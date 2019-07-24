package com.cg.bookstore.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bookstore.beans.Author;

public interface AuthorDao extends JpaRepository<Author , Integer> {

}
