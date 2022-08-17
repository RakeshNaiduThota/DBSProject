package com.project.models;

import javax.persistence.*;

@Entity
@Table(name="transactions")
public class Transactions {

	private int transactionId;
	private String senderAccNo;
	private String senderName;
	private String balance;
	private String recAccNo;
	private String recName;
	private String msgCode;
	private String bic;
	private String ins_name;
	private String transferFee;
	private int amount;
	private String transferType;
	private String finalBalance;
	private String transactionDate;
	
	public Transactions() {}
	
	public Transactions(int transactionId, String senderAccNo, String senderName, String balance, String recAccNo,
			String recName, String msgCode, int amount, String transactionType, String finalBalance, String transactionDate) {
		super();
		this.transactionId = transactionId;
		this.senderAccNo = senderAccNo;
		this.senderName = senderName;
		this.balance = balance;
		this.recAccNo = recAccNo;
		this.recName = recName;
		this.msgCode = msgCode;
		this.amount = amount;
		this.transferType = transactionType;
		this.finalBalance = finalBalance;
		this.transactionDate = transactionDate;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public String getSenderAccNo() {
		return senderAccNo;
	}
	public void setSenderAccNo(String senderAccNo) {
		this.senderAccNo = senderAccNo;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getRecAccNo() {
		return recAccNo;
	}
	public void setRecAccNo(String recAccNo) {
		this.recAccNo = recAccNo;
	}
	public String getRecName() {
		return recName;
	}
	public void setRecName(String recName) {
		this.recName = recName;
	}
	public String getMsgCode() {
		return msgCode;
	}
	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getFinalBalance() {
		return finalBalance;
	}
	public void setFinalBalance(String finalBalance) {
		this.finalBalance = finalBalance;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public String getIns_name() {
		return ins_name;
	}

	public void setIns_name(String ins_name) {
		this.ins_name = ins_name;
	}

	public String getTransferType() {
		return transferType;
	}

	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}

	public String getTransferFee() {
		return transferFee;
	}

	public void setTransferFee(String transferFee) {
		this.transferFee = transferFee;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	
}
