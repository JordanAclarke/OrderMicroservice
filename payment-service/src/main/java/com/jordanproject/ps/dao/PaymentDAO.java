package com.jordanproject.ps.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jordanproject.ps.model.Payment;

@Repository
public interface PaymentDAO extends JpaRepository<Payment, Integer> {

	Payment findByOrderId(int orderId);

}
