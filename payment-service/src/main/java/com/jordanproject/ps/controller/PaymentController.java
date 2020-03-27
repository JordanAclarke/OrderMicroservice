package com.jordanproject.ps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jordanproject.ps.model.Payment;
import com.jordanproject.ps.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	@GetMapping("/getAllPayments")
	public List<Payment> getAllPayments() {
		return paymentService.getListOfPayments();
	}
	
	@PostMapping("/addPayment")
	public Payment savePayment(@RequestBody Payment payment) {
		return paymentService.savePayment(payment);
		

	}

}
