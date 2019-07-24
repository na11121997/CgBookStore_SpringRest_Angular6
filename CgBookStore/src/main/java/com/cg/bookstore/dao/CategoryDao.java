package com.cg.bookstore.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bookstore.beans.Category;

public interface CategoryDao extends JpaRepository<Category,Integer> {
}
