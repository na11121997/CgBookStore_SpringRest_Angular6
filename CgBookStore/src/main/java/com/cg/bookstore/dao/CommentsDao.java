package com.cg.bookstore.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bookstore.beans.Comment;

public interface CommentsDao extends JpaRepository<Comment , Integer> {
}
