package com.mycompany.assent.service;


import com.mycompany.assent.domain.Author;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 *
 * @author assent2
 */
public interface ServiceAuthor {

    void createAuthor(Author author);

    Author getAuthor(Serializable id);

    List<Author> findAuthor(Author author);
    
    List<Author> getAllAuthor();

    void deleteAuthor(Author author);

    void updateAuthor(Author author);
}
