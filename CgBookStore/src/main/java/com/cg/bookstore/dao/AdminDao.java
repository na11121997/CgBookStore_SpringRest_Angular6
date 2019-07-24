package com.cg.bookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bookstore.beans.Admin;

public interface AdminDao extends JpaRepository<Admin , Integer> {
}
