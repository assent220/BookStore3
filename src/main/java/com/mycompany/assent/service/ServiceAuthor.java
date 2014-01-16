package com.mycompany.assent.service;


import com.mycompany.assent.domain.Author;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author assent2
 */
public interface ServiceAuthor {

    void createAuthor(Author author);

    Author getAuthor(Serializable id);

    List<Author> getAllAuthor();

    void deleteAuthor(Author author);

    void updateAuthor(Author author);
}
