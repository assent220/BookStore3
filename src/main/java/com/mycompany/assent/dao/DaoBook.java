package com.mycompany.assent.dao;

import com.mycompany.assent.domain.Book;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author assent
 * @param <T>
 */
public interface DaoBook extends Dao<Book> {

    Book getWithForeignData(Serializable id, ForeignData... foreignData);

    List<Book> getAllWithForeignData(ForeignData... foreignData);

    int getCntAllInWarehouse(Integer idBook);

    public enum ForeignData {

        author, category, discount, publisher, tag, warehouse;
    }
}
