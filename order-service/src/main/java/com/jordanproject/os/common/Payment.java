package com.jordanproject.os.common;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PAYMENT_TABLE")
public class Payment {
	
	@Id
	@GeneratedValue
	@Column(name = "PAYMENT_ID")
	private int paymentId;
	
	@Column(name = "PAYMENT_STATUS")
	private Boolean paymentStatus = false;
	
	private String transactionId;
	
	private int orderId;
	
	private double amount;
	

}
