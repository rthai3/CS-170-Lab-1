/************************************
 * Name: Raymond Thai
 * Course: CS170-01
 * Lab #: Lab 1
 * Submission Date: 2/17/2020 at 10pm
 * Brief Description: The purpose of this lab is show our understanding of the introduction
 * of Java after covering chapters 1-4 in the textbook. According to the instructions given 
 * by the instructor, this program will be tasked with creating a half pyramid in the output
 * console. The program works by asking the user for what first row they would like to start
 * at. Then the program will ask for the last row the user would like to stop at. When the
 * program is run, it will print out a half pyramid and the peak will start off at whatever
 * number the user chose and end at the last row number they inputed. The program works by 
 * asking the user for input data and then will store that in the operational class or also 
 * known as a header file in c++. Then that value will be called back to be calculated and 
 * print the numbers. Kind of like encapsulation used here.
 *
 ************************************/

import java.util.Scanner;

public class NestedLoopTableApp {
	public static void main(String[] args) {
		//Will hold string input
		String input;
		//will hold the first row input
		int fRow;
		//Amount of rows chosen by user
		int lRow;
		
		//Create a NestedLoopTable object
		//This will link with the operation class
		NestedLoopTable storage = new NestedLoopTable();
		
		//Create scanner object
		Scanner obj = new Scanner(System.in);
		
		//Will hold the increment count to manage the loops for do while loop
		int holder = 1;
		//Will hold char input 
		//char choice;
		
		do {
			//Print inquiring user on row number
			System.out.println("Please enter the row you would like to start off at: ");
			//Ask the user for String input PII
			input = obj.next();
			//Create empty space between user input and printing out output
			System.out.println(" ");
			//Convert the string into a type int
			fRow = Integer.parseInt(input);
			//Set the digits and will be linked to the operation class method 
			storage.setFRow(fRow);
			//Return the number from the operation class
			storage.getFRow();
			
			//Second part where the program will ask for the last row
			System.out.println("Please enter the last row: ");
			//Ask the user for the String input
			input = obj.next();
			//Space between user input and printing out the output
			System.out.println(" ");
			//Convert the string into type int
			lRow = Integer.parseInt(input);
			//Set the lRow and well be linked back to the operation class method
			storage.setLRow(lRow);
			//Return the number from the operation class
			storage.getLRow();
			
			//The Outer Loop
			//had digits variable in the middle
			for (int i = 1; i <= storage.getLRow(); i++) {
				//The Inner Loop
				//will print the numbers
				for(int j = storage.getFRow(); j <= i; j++) {
					//JOptionPane.showMessageDialog(null, j + " ");
					System.out.print(j + " ");
				}
				//JOptionPane.showMessageDialog(null, " ");
				System.out.println("");
				
			}
			
			//Create a space between
			System.out.println(" ");
			//This will ask the user if they would like to continue the loop
			//System.out.println("Would you like to continue? If yes, please type Y/y. To quit, type N/n.");
			//Get the user's choice 
			//choice = obj.next().charAt(0);
			//The increment will change after a loop
			holder = 2;
			
			//The if while statement and if statement will determine and sort 
			//to see if the user would like to loop the program
			while (holder == 2) {
				//Hold the char for choice
				char choice;
				//
				System.out.println(" ");
				//
				System.out.println("Would you like to continue? If yes, please type Y/y. To quit, type N/n.");
				//
				choice = obj.next().charAt(0);
				
				if((choice == 'N') || (choice == 'n')) {
					holder = 3;
					System.out.println("Goodbye!");
				}
				else if((choice == 'Y') || (choice == 'y')) {
					//Changed from two to one
					//make sure 2 does not go back into this while loop
					holder = 1;
					System.out.println("Continuing in progress...");
					//continue;
					//break;
				}
				else {
					holder = 2;
				}
				
			}
		}while (holder < 3);
	}

}
