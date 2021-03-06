package com.priyanka.expensetracker.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

//Adds model as table to DB
@Entity
//@Table(name="tble_expense") if table name different from class name

//Lombok
@Setter
@Getter
public class Expense {
	
	//Primary key in table
	@Id
	//AutoGenerated
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String expense;
	private String description;
	private BigDecimal amount;
	
}
