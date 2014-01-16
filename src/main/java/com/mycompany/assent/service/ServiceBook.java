package com.mycompany.assent.service;

import com.mycompany.assent.dao.DaoBook;
import com.mycompany.assent.domain.Book;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author assent
 */
public interface ServiceBook {

    /**
     *
     * @param str - ISBN || BookName || Author
     * @return
     */
    List<Book> findBook(String str);

    void createBook(Book book);

    Book getBook(Integer id, DaoBook.ForeignData... foreignData);

    void deleteBook(Book book);

    void updateBook(Book book);
}
