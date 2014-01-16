package com.mycompany.assent.service.impl;


import com.mycompany.assent.dao.impl.DaoBookImpl;
import com.mycompany.assent.domain.Author;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import org.junit.Test;
import static org.junit.Assert.*;
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
public class ServiceAuthorImplTest {

    @Inject
    ServiceAuthorImpl serviceAuthor;

    @Test
    public void test0() {
        Assert.notNull(serviceAuthor);
    }

    /**
     * Test of createAuthor method, of class ServiceAuthorImpl.
     */
    @Test
    public void testCreateAuthor() {
        System.out.println("createAuthor");
        Author author = null;
        ServiceAuthorImpl instance = new ServiceAuthorImpl();
        instance.createAuthor(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthor method, of class ServiceAuthorImpl.
     */
    @Test
    public void testGetAuthor() {
        System.out.println("getAuthor");
        Serializable id = 1;
        Author author = serviceAuthor.getAuthor(id);
        Assert.notNull(author);

        System.out.println(author);
    }

    /**
     * Test of getAllAuthor method, of class ServiceAuthorImpl.
     */
    @Test
    public void testGetAllAuthor() {
        System.out.println("getAllAuthor");
        List<Author> listAuthor = serviceAuthor.getAllAuthor();
        Assert.notNull(listAuthor);

        for (Author author : listAuthor) {
            System.out.println(author);
        }
    }

    /**
     * Test of deleteAuthor method, of class ServiceAuthorImpl.
     */
    @Test
    public void testDeleteAuthor() {
        System.out.println("deleteAuthor");
        Author author = null;
        ServiceAuthorImpl instance = new ServiceAuthorImpl();
        instance.deleteAuthor(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAuthor method, of class ServiceAuthorImpl.
     */
    @Test
    public void testUpdateAuthor() {
        System.out.println("updateAuthor");
        Author author = null;
        ServiceAuthorImpl instance = new ServiceAuthorImpl();
        instance.updateAuthor(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}