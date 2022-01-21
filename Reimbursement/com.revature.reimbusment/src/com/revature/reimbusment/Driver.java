package com.revature.reimbusment;


import com.revature.reimbusment.Transaction;
import java.util.Scanner;

public class Driver {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fields
			//type of transaction: lodging, food
			//transaction ID
			//user ID
			//transaction amount
			//	date
			//status: approved, pending, rejected
		boolean notDone = true;
		Scanner myscanner = new Scanner(System.in);
		
		while(notDone) {
			
			System.out.println("Please enter your employee ID: ");
			String userId = myscanner.nextLine();
			
			System.out.println("What do you want to do: ");
			System.out.println("[0]: Create a transaction");
			System.out.println("[1]: View my transactions");
			System.out.println("[2] Request reimbursement: ");
			System.out.println("[3] Exit: ");
			
			String userInput = myscanner.nextLine();
			
			switch (userInput) {
			case "0":
				//don't know what went wrong here
				Transaction newTransaction = new Transaction();
				//Transaction newTransaction = new Transaction();
				
				break;
			case "1":
				break;
			case "2":
				break;
			case "3":
				System.out.println("Goodbye");
				notDone = false;
				break;
			}

		}
		
		
		
	}


}
