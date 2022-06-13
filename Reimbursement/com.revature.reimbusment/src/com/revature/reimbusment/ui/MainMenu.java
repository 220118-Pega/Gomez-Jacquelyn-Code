package com.revature.reimbusment.ui;

import java.util.Scanner;

import com.revature.reimbusment.models.Transaction;

/**
 * MainMenu class will handle ui
 * 		
 * 
 * @author jacki
 *
 */
public class MainMenu {
	
	Scanner myscanner = new Scanner(System.in);
	
	public void start() {
		
		boolean keepGoing = true;
		
		while(keepGoing) {
			
			System.out.println("Welcome to the reimbursement request portal. What do you want to do?");
			
			System.out.println("[0]: Request a reimbursement: ");
			System.out.println("[1]: View my reimbursement requests");
			System.out.println("[2] View status of my requests: ");
			System.out.println("[3] Exit: ");
			
			String userInput = myscanner.nextLine();
			
			switch (userInput) {
			case "0":
				//create a reimbursement request
				createReimbursementTicket();
				break;
			case "1":
				// view all reimbursement requests
				break;
			case "2":
				//view status of requests
				break;
			case "3":
				//exit 
				System.out.println("Goodbye");
				keepGoing = false;
				break;
			default:
				System.out.println("Wrong input. Please try again");
			}
		
		}
		
	}
	
	private void createReimbursementTicket() {
		//retrieve info from user to create ticket
		//using parseInt and parseFloat instead of calling nextInt/nextFloat with scanner 
		//b/c nextInt and nextFloat do not consume '\n', prevents scanner from consuming 
		//following call of nextLine
		System.out.println("Please enter your user ID: ");
		int userId = Integer.parseInt(myscanner.nextLine());
		System.out.println("Please enter the transaction amount: ");
		float transactionAmount = Float.parseFloat(myscanner.nextLine());
		
		//select transaction type
		System.out.println("Please select the transaction type: ");
		System.out.println("[0] Lodging");
		System.out.println("[1] Travel");
		System.out.println("[2] Food");
		System.out.println("[3] Other");
		
		String transactionType = myscanner.nextLine();
		
		switch (transactionType) {
		case "0":
			transactionType = "LODGING";
			break;
		case "1":
			transactionType = "TRAVEL";
			break;
		case "2":
			transactionType = "FOOD";
			break;
		case "3":
			transactionType = "OTHER";
			break;
		default:
			System.out.println("Wrong input. Please select a transaction type from the list provided");
		}
		
		System.out.println("Add a description (optional). Hit enter if you don't want to add a description: ");
		String description = myscanner.nextLine();
		
		Transaction newTransaction = new Transaction(userId, transactionAmount, transactionType, description);
		newTransaction.displayTransaction(newTransaction);
	}
	


}


