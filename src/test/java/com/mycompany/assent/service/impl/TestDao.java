package com.mycompany.assent.service.impl;

import com.mycompany.assent.dao.impl.DaoAuthorImpl;
import com.mycompany.assent.dao.impl.DaoBookImpl;
import com.mycompany.assent.domain.Author;
import com.mycompany.assent.domain.Book;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
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
public class TestDao {

    @Inject
    DaoAuthorImpl daoAuthor;

    @Test
    public void test0() {
        Assert.notNull(daoAuthor);
    }

    @Test
    @Transactional
    public void test() {
        List<Author> listAuthor = daoAuthor.getAll();
        
        for (Author author : listAuthor) {
            System.out.println(author);
        }
    }
    
    
    @Test
    @Transactional
    public void findTestId() {
        System.out.println("*** start findTest1");
        Author author = new Author();
        author.setIdAuthor(1);
        
        List<Author> listAuthor = daoAuthor.find(author);
        
        System.out.println("*** sout");
        for (Author el : listAuthor) {
            System.out.println(el);
        }
        
        System.out.println("*** stop findTest1");
    }
    
    @Test
    @Transactional
    public void findTestFname() {
        System.out.println("*** start findTestFname");
        Author author = new Author();
        author.setFname("d");
        author.setLname("l");
        
        List<Author> listAuthor = daoAuthor.find(author);
        
        System.out.println("*** sout");
        for (Author el : listAuthor) {
            System.out.println(el);
        }
        
        System.out.println("*** stop findTest1");
    }
    
    @Test
    @Transactional
    public void findTestId2() {
        System.out.println("*** start findTestFname");
        Author author = new Author();
        author.setFname("dasgesgfd345");
        
        List<Author> listAuthor = daoAuthor.find(author);
        
        System.out.println("*** sout");
        for (Author el : listAuthor) {
            System.out.println(el);
        }
        
        System.out.println("*** stop findTest1");
    }
}
