package com.project.controllers;
import java.util.*;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.project.models.BIC;
import com.project.models.Customers;
import com.project.models.Employee;
import com.project.models.Transactions;
import com.project.repos.BICRepo;
import com.project.repos.CustomerRepo;
import com.project.repos.EmployeeRepo;
import com.project.repos.TransactionRepo;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@Autowired
	private BICRepo bicRepo;
	
	@Autowired
	private TransactionRepo transactionRepo;
	
	@RequestMapping("/employees")
	public List<Employee> getEmployees(){
		return employeeRepo.findAll();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/transactions")
	public List<Transactions> getTransactions(){
		return transactionRepo.findAll();
	}
	
	@Transactional
	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeRepo.save(employee);
	}
	
	// User Login
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> userLogin(@RequestBody Employee user) {
		Employee UserData = employeeRepo.findByEuname(user.getEuname());
		if(user.getEpcode().equals(UserData.getEpcode())) {
			return ResponseEntity.ok(UserData);
		}
		return (ResponseEntity<?>) ResponseEntity.internalServerError();
	}
	//get account details
	@RequestMapping(value = "/verifySender", method = RequestMethod.POST)
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> verifyAccount(@RequestBody Customers customer) {
		
		Customers cust = customerRepo.findByAccountNumber(customer.getAccountNumber());
		return ResponseEntity.ok(cust);
	}
	
	@RequestMapping(value = "/verifyBIC", method = RequestMethod.POST)
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> verifyBIC(@RequestBody BIC bic) {
		BIC b = bicRepo.findByBic(bic.getBic());
		return ResponseEntity.ok(b);
	}
	
	@Transactional
	@PostMapping("/uploadTransaction")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> UploadTransaction(@RequestBody Transactions transaction) {
		if(transaction.getTransferType().equals("Customer") && transaction.getRecAccNo().equals("69652133523248") && transaction.getRecAccNo().equals("45002608912874") && transaction.getRecAccNo().equals("42895235807723")) {
			return (ResponseEntity<?>) ResponseEntity.internalServerError();
		}else if(transaction.getTransferType().equals("Bank Transfer") && !transaction.getRecAccNo().equals("69652133523248") && !transaction.getRecAccNo().equals("45002608912874") && !transaction.getRecAccNo().equals("42895235807723")) {
			return (ResponseEntity<?>) ResponseEntity.internalServerError();
		}
		transactionRepo.save(transaction);
		return ResponseEntity.ok(transaction);
	}
	
	@Transactional
	@PostMapping("/updateBalance")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> updateBalance(@RequestBody Customers customer) {
		Customers cust = customerRepo.findByAccountNumber(customer.getAccountNumber());
		if(customer.getAccountNumber().equals(cust.getAccountNumber())) {
			cust.setBalance(customer.getBalance());
			customerRepo.save(cust);
			return ResponseEntity.ok(cust);			
		}
		return (ResponseEntity<?>) ResponseEntity.notFound();
	}
	
	
}
