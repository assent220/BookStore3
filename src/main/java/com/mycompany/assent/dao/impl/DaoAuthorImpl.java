package com.mycompany.assent.dao.impl;

import com.mycompany.assent.dao.AbstractHbnDao;
import com.mycompany.assent.dao.DaoAuthor;
import com.mycompany.assent.domain.Author;
import static com.mycompany.assent.util.ClassNameUtil.getCurrentClassName;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.inject.Named;
import org.hibernate.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author assent2
 */
@Named
public class DaoAuthorImpl extends AbstractHbnDao<Author> implements DaoAuthor {

    final Logger logger = LoggerFactory.getLogger(getCurrentClassName());

    @Override
    public List<Author> find(Author author) {

        logger.debug("start find: " + author.toString());

        if (author.getIdAuthor() != null) {
            Author authorElem = get(author.getIdAuthor());

            if (authorElem == null) {
                return Collections.emptyList();
            }
            return Collections.singletonList(authorElem);
        }

        if (author.getIdAuthor() == null
                && (author.getFname() == null || author.getFname().trim().isEmpty())
                && (author.getLname() == null || author.getLname().trim().isEmpty())
                && (author.getPname() == null || author.getPname().trim().isEmpty())) {
            return Collections.emptyList();
        }

        boolean flFirstPredicateSetup = false;

        String hql = "FROM Author as a WHERE ";

        if (author.getFname() != null && !author.getFname().trim().isEmpty()) {
            String predicate = "a.fname like '" + author.getFname().trim() + "%' ";
            if (!flFirstPredicateSetup) {
                hql += predicate;
                flFirstPredicateSetup = true;
            } else {
                hql += " AND " + predicate;
            }
        }

        if (author.getLname() != null && !author.getLname().trim().isEmpty()) {
            String predicate = "a.lname like '" + author.getLname().trim() + "%' ";
            if (!flFirstPredicateSetup) {
                hql += predicate;
                flFirstPredicateSetup = true;
            } else {
                hql += " AND " + predicate;
            }
        }

        if (author.getPname() != null && !author.getPname().trim().isEmpty()) {
            String predicate = "a.pname like '" + author.getPname().trim() + "%' ";
            if (!flFirstPredicateSetup) {
                hql += predicate;
                flFirstPredicateSetup = true;
            } else {
                hql += " AND " + predicate;
            }
        }

        logger.debug(hql);
        Query createQuery = getSession().createQuery(hql);

        return createQuery.list();
    }
}
