package com.priyanka.expensetracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.priyanka.expensetracker.model.Expense;
import com.priyanka.expensetracker.service.ExpenseService;

@RestController
@RequestMapping("/api/v1")
public class ExpenseController {

	@Autowired
	ExpenseService serv;
	
	@GetMapping("/expenses")
	public ResponseEntity<List<Expense>> get() {
		//return serv.findAll(); to return as list
		//ResponseEntity: to send as response obj with status
		return new ResponseEntity<List<Expense>>(serv.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/expenses/{id}")
	public ResponseEntity<Expense> getByID(@PathVariable("id") Long id) {
		//return serv.findAll(); to return as list
		return new ResponseEntity<Expense>(serv.findById(id), HttpStatus.OK);
	}
	
	@PostMapping("/expenses")
	public ResponseEntity<Expense> add(@RequestBody Expense exp) {
		return new ResponseEntity<Expense>(serv.add(exp), HttpStatus.OK);
	}
	
	@PutMapping("/expenses")
	public ResponseEntity<Expense> update(@RequestBody Expense exp) {
		return new ResponseEntity<Expense>(serv.update(exp), HttpStatus.OK);
	}
	
	@DeleteMapping("/expenses/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") Long id) {
		//return serv.findAll(); to return as list
		serv.delete(id);
		return new ResponseEntity<String>("Expense deleted",HttpStatus.OK);
	}
}
