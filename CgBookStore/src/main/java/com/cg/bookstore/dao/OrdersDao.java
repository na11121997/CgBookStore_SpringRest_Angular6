package com.cg.bookstore.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bookstore.beans.Ordered;

public interface OrdersDao extends JpaRepository<Ordered , Integer> {
}
