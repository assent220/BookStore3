package com.mycompany.assent.domain;
// Generated Dec 25, 2013 7:06:02 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Tag generated by hbm2java
 */
@Entity
@Table(name="tag"
    ,catalog="testHibernate"
    , uniqueConstraints = @UniqueConstraint(columnNames="name") 
)
public class Tag  implements java.io.Serializable {


     private Integer idTag;
     private String name;
     private Set<Book> books = new HashSet<Book>(0);

    public Tag() {
    }

	
    public Tag(String name) {
        this.name = name;
    }
    public Tag(String name, Set<Book> books) {
       this.name = name;
       this.books = books;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_tag", unique=true, nullable=false)
    public Integer getIdTag() {
        return this.idTag;
    }
    
    public void setIdTag(Integer idTag) {
        this.idTag = idTag;
    }

    
    @Column(name="name", unique=true, nullable=false, length=50)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

@ManyToMany(fetch=FetchType.LAZY, mappedBy="tags")
    public Set<Book> getBooks() {
        return this.books;
    }
    
    public void setBooks(Set<Book> books) {
        this.books = books;
    }




}


