package com.mycompany.assent.dao.impl;

import com.mycompany.assent.dao.AbstractHbnDao;
import com.mycompany.assent.dao.DaoAuthor;
import com.mycompany.assent.domain.Author;
import javax.inject.Named;
import org.springframework.stereotype.Repository;

/**
 *
 * @author assent2
 */
@Named
public class DaoAuthorImpl extends AbstractHbnDao<Author> implements DaoAuthor {
}
