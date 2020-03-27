package com.jordanproject.os.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jordanproject.os.common.Payment;
import com.jordanproject.os.common.TransactionRequest;
import com.jordanproject.os.common.TransactionResponse;
import com.jordanproject.os.model.Order;
import com.jordanproject.os.service.OrderService;

@RestController
@RequestMapping("/api")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping("/allOrders")
	public List<Order> getListOfOrders() {
		return orderService.getAllOrders();
	}
	
	
	@PostMapping("/addOrder")
	public TransactionResponse saveOrder(@RequestBody TransactionRequest transactionRequest) {

		return orderService.saveOrder(transactionRequest);
//		Do a rest call and pass order id
	}
	
	
	
	
}
