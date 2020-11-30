package com.priyanka.expensetracker.service;

import java.util.List;

import com.priyanka.expensetracker.model.Expense;

public interface ExpenseService {
	
	List<Expense> findAll();
	
	Expense findById(Long id);
	
	Expense add(Expense exp);
	
	Expense update(Expense exp);
	
	void delete(Long id);
}
