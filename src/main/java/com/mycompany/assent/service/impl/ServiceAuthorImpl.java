package com.mycompany.assent.service.impl;

import com.mycompany.assent.dao.DaoAuthor;
import com.mycompany.assent.domain.Author;
import com.mycompany.assent.service.ServiceAuthor;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author assent2
 */
@Named
public class ServiceAuthorImpl implements ServiceAuthor {

    @Inject
    DaoAuthor daoAuthor;

    @Transactional
    @Override
    public void createAuthor(Author author) {
        daoAuthor.create(author);
    }

    @Transactional(readOnly = true)
    @Override
    public Author getAuthor(Serializable id) {
        return daoAuthor.get(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Author> getAllAuthor() {
        return daoAuthor.getAll();
    }

    @Transactional
    @Override
    public void deleteAuthor(Author author) {
        daoAuthor.delete(author);
    }

    @Transactional
    @Override
    public void updateAuthor(Author author) {
        daoAuthor.update(author);
    }
}
