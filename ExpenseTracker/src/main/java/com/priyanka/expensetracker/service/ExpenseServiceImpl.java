package com.priyanka.expensetracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priyanka.expensetracker.model.Expense;
import com.priyanka.expensetracker.repo.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {
	
	@Autowired
	ExpenseRepository repo;

	@Override
	public List<Expense> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	@Override
	public Expense findById(Long id) {
		if(repo.findById(id).isPresent()) {
			return repo.findById(id).get();
		}
		return null;
		
	}

	@Override
	public Expense add(Expense exp) {
		return repo.save(exp);
	}

	@Override
	public Expense update(Expense exp) {
		return repo.save(exp);
	}

	@Override
	public void delete(Long id) {
		repo.deleteById(id);
	}

	
}
