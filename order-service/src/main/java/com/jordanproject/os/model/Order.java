package com.jordanproject.os.model;

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
@Table(name = "ORDER_TABLE")
public class Order {
	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	private String name;
	@Column(name = "Quantity")
	private int qty;
	private double price;

}