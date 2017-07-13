package com.cts.vo;

import org.springframework.stereotype.Component;

@Component
public class AllDetails {

	private Long accountNumber;

	private String Description;

	private String transactionType;

	private Long transactionAmount;

	private Long TransactionId;
	
	private Long Balance; 
	
	private Long accountBalance;
	
	private String accountHolderName;

	private String accountType;
	
	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public Long getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(Long transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public Long getTransactionId() {
		return TransactionId;
	}

	public void setTransactionId(Long transactionId) {
		TransactionId = transactionId;
	}

	public Long getBalance() {
		return Balance;
	}

	public void setBalance(Long balance) {
		Balance = balance;
	}

	public Long getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Long accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


}
