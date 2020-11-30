package com.company.service;

import java.util.List;
import com.company.model.Expense;

public interface ExpenseService {
	List<Expense> findAll();
}
