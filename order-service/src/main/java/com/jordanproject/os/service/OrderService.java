package com.jordanproject.os.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jordanproject.os.common.Payment;
import com.jordanproject.os.common.TransactionRequest;
import com.jordanproject.os.common.TransactionResponse;
import com.jordanproject.os.dao.OrderDAO;
import com.jordanproject.os.model.Order;

@Service
public class OrderService {
	
	@Autowired
	private OrderDAO orderDao;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public TransactionResponse saveOrder(TransactionRequest transactionRequest) {
		Order order = transactionRequest.getOrder();
		Payment payment = transactionRequest.getPayment();
		payment.setOrderId(order.getId());
		payment.setAmount(order.getPrice());
//		Rest Call, when you configure client, you can change the local host to application name
		Payment paymentResponse = restTemplate.postForObject("http://PAYMENT-SERVICE/payment/addPayment", payment, Payment.class);
		orderDao.save(order);
		return new TransactionResponse(order, paymentResponse.getAmount(), paymentResponse.getTransactionId());
	}
	
	public List<Order> getAllOrders() {
		List<Order> listOfOrders = orderDao.findAll();
		return listOfOrders;
	}

}
