package com.mycompany.assent.service.impl;

import com.mycompany.assent.dao.impl.DaoAuthorImpl;
import com.mycompany.assent.dao.impl.DaoBookImpl;
import com.mycompany.assent.domain.Author;
import com.mycompany.assent.domain.Book;
import java.util.List;
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
}
