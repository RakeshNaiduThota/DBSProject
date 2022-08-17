package com.project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customers {
	private int cusId;
	private String name;
	private String accountNumber;
	private int balance;
	private String overdraft;
	
	public Customers() {}
	
	public Customers(int CusId, String Name, String AccountNumber, int Balance, String Overdraft) {
		super();
		cusId = CusId;
		name = Name;
		accountNumber = AccountNumber;
		balance = Balance;
		overdraft = Overdraft;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(String overdraft) {
		this.overdraft = overdraft;
	}
	
	
	
}
