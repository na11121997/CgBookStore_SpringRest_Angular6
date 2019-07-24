package com.cg.bookstore.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bookstore.beans.Book;

public interface BooksDao extends JpaRepository<Book,Integer> {
}
