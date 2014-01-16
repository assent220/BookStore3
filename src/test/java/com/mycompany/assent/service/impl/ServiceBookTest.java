package com.mycompany.assent.service.impl;

import com.mycompany.assent.dao.DaoBook.ForeignData;
import com.mycompany.assent.dao.impl.DaoBookImpl;
import com.mycompany.assent.domain.Author;
import com.mycompany.assent.domain.Book;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import org.springframework.transaction.annotation.Transactional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.util.Assert;

/**
 *
 * @author assent2
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
    "spring/root-context.xml"
})
@TransactionConfiguration(defaultRollback = true, transactionManager = "transactionManager")
public class ServiceBookTest {

    @Inject
    ServiceBookImpl serviceBook;
    @Inject
    DaoBookImpl daoBook;

    @Test
    public void test0() {
        Assert.notNull(serviceBook);
    }

    @Test
    public void testGetAll() {

        System.out.println("*** testGetAll");
        System.out.println("*** start");
        List<Book> findBook = serviceBook.findBook(null);

        System.out.println("*** out");

        for (Book book : findBook) {
            System.out.println(book);
        }
        System.out.println("*** end");

        Book book = findBook.get(0);

        System.out.println(book);
    }

    @Test
    public void testGetWithForeignData() {
        System.out.println("*** testGetWithForeignData");
        System.out.println("*** start");
        Book book = serviceBook.getBook(1, ForeignData.author);

        System.out.println("*** book");
        System.out.println(book);

        System.out.println("*** authors");
        Set<Author> authors = book.getAuthors();
        for (Author author : authors) {
            System.out.println(author);
        }

        System.out.println("*** end");
    }

    @Test
    public void testGetAllWithForeignData() {
        System.out.println("*** testGetWithForeignData");
        System.out.println("*** start");
        List<Book> listBook = getAllWithForeignData(ForeignData.author);

        System.out.println("*** book");

        for (Book book : listBook) {
            System.out.println("* book: " + book);

            Set<Author> authors = book.getAuthors();
            for (Author author : authors) {
                System.out.println("* author" + author);
            }
        }

        System.out.println("*** end");
    }

    @Transactional
    public List<Book> getAllWithForeignData(ForeignData... foreignData) {
        return daoBook.getAllWithForeignData(foreignData);
    }
}
