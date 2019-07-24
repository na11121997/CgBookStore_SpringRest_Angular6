package com.cg.bookstore.beans;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Map;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int categoryId;

    private String categoryName;

    @OneToMany(mappedBy = "category" , fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
    @MapKey
    @JsonManagedReference("category_books")
    private Map<Integer,Book> books;

    @OneToMany(mappedBy = "category" , fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    @MapKey
    @JsonManagedReference("author_category")
    private Map<Integer,Author> authors;

    public Category(int categoryId , String categoryName, Map<Integer, Book> books, Map<Integer, Author> authors) {
        super();
        this.categoryName = categoryName;
        this.books = books;
        this.authors = authors;
        this.categoryId = categoryId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Map<Integer, Book> getBooks() {
        return books;
    }

    public void setBooks(Map<Integer, Book> books) {
        this.books = books;
    }

    public Map<Integer, Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Map<Integer, Author> authors) {
        this.authors = authors;
    }

    public Category(){

    }



}
