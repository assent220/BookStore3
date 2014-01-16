package com.mycompany.assent.service.impl;

import com.mycompany.assent.dao.DaoBook;
import com.mycompany.assent.domain.Book;
import com.mycompany.assent.service.ServiceBook;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.hibernate.mapping.Collection;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author assent
 */
@Named
@Transactional
public class ServiceBookImpl implements ServiceBook {

    @Inject
    DaoBook daoBook;

    @Override
    public void createBook(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteBook(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateBook(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional(readOnly = true)
    @Override
    public List<Book> findBook(String str) {
        if (str == null || str.isEmpty()) {
            return daoBook.getAll();
        }
        return Collections.emptyList();

    }

    @Transactional(readOnly = true)
    @Override
    public Book getBook(Integer id, DaoBook.ForeignData... foreignData) {
        return daoBook.getWithForeignData(id, foreignData);
    }

    @Transactional(readOnly = true)
    public List<Book> getBookAll(DaoBook.ForeignData... foreignData) {
        return daoBook.getAllWithForeignData(foreignData);
    }
}
