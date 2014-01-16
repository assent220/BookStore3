package com.mycompany.assent.dao.impl;

import com.mycompany.assent.dao.AbstractHbnDao;
import com.mycompany.assent.dao.DaoBook;
import com.mycompany.assent.domain.Book;
import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import org.hibernate.Hibernate;

/**
 *
 * @author assent
 */
@Named
public class DaoBookImpl extends AbstractHbnDao<Book> implements DaoBook {

    @SuppressWarnings("unchecked")
    @Override
    public int getCntAllInWarehouse(Integer idBook) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    @Override
    public Book getWithForeignData(Serializable id, DaoBook.ForeignData... foreignData) {
        Book book = get(id);
        initializeForeignData(book, foreignData);
        return book;
    }

    @Override
    public List<Book> getAllWithForeignData(DaoBook.ForeignData... foreignData) {
        List<Book> listBook = getAll();

        if (listBook != null && !listBook.isEmpty() && foreignData.length != 0) {
            for (Book book : listBook) {
                initializeForeignData(book, foreignData);
            }
        }

        return listBook;
    }

    private void initializeForeignData(Book book, DaoBook.ForeignData... foreignData) {
        if (book != null) {
            for (ForeignData foreignBook : foreignData) {
                switch (foreignBook) {
                    case author:
                        Hibernate.initialize(book.getAuthors());
                        break;
                    case publisher:
                        Hibernate.initialize(book.getPublishers());
                        break;
                    case category:
                        Hibernate.initialize(book.getCategories());
                        break;
                    case tag:
                        Hibernate.initialize(book.getTags());
                        break;
                    default:
                }
            }
        }
    }
}
