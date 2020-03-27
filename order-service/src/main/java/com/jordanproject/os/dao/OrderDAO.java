package com.jordanproject.os.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jordanproject.os.model.Order;

@Repository
public interface OrderDAO extends JpaRepository<Order, Integer>{

}
