package com.revature.reimbusment.models;

import java.time.LocalDateTime;


/**
 * 
 * This is a class to model the transactions
 * @author jacki
 *
 */
public class Transaction {
	//fields
	int userId;
	float transactionAmount;
	//description of the reimbursement
	String description;
	LocalDateTime timeStamp;
	
	//type of transaction stored as an enum
	public enum transactiontype {LODGING, FOOD, TRAVEL, OTHER};
	public transactiontype myTransaction;
	//status stores as enum, to be determined by company
	private enum status {PENDING, APPROVED, REJECTED};
	status myStatus;
	
	
	
	
	//constructors
	
	//constructor to be used if user does not provide a description
	public Transaction(int userId, float transactionAmount, String transactionType) {
		this.userId = userId;
		this.transactionAmount = transactionAmount;
		this.myTransaction = transactiontype.valueOf(transactionType);
		this.description = "No description added";
		this.myStatus = status.PENDING;
		
		//time stamp is set by the constructor
		this.timeStamp = LocalDateTime.now();
	}

	public Transaction(int userId, float transactionAmount, String transactionType, String description) {
		this.userId = userId;
		this.transactionAmount = transactionAmount;
		this.myTransaction = transactiontype.valueOf(transactionType);
		this.description = description;
		this.myStatus = status.PENDING;
		
		//time stamp is variable is set by the constructor
		this.timeStamp = LocalDateTime.now();
	}
	
	
	//methods

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public float getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(float transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public transactiontype getMyTransaction() {
		return myTransaction;
	}

	public void setMyTransaction(transactiontype myTransaction) {
		this.myTransaction = myTransaction;
	}
	
	//method to retrieve the status of transaction
	public status getMyStatus() {
		return myStatus;
	}
	
	//method to set the status of the transaction
	public void setMyStatus(status myStatus) {
		this.myStatus = myStatus;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void displayTransaction(Transaction transaction) {
		System.out.println("Employee ID: " + transaction.userId);
		System.out.println("Reimbursement request amount: $" + transaction.transactionAmount);
		System.out.println("Reimbursement type: " + myTransaction);
		System.out.println("Description: " + description);
	}

	//format of object when converted to string
	//possibly not necessary
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
