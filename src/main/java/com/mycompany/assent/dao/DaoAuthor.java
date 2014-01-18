package com.mycompany.assent.dao;

import com.mycompany.assent.domain.Author;
import java.util.List;

/**
 *
 * @author assent
 * @param <T>
 */
public interface DaoAuthor extends Dao<Author> {

    public List<Author> find(Author author);
}
