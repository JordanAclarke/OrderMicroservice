package com.jordanproject.os.common;

import com.jordanproject.os.model.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {

	private Order order;
	
	private double amount;
	
	private String transactionId;
}
