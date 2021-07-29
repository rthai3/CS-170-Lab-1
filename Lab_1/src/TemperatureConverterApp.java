/************************************
 * Name: Raymond Thai
 * Course: CS170-01
 * Lab #: Lab 1
 * Submission Date: 2/17/2020 at 10pm
 * Brief Description: The purpose of this lab is show our understanding of the introduction
 * of Java after covering chapters 1-4 in the textbook. According to the instructions given 
 * by the instructor, this program will be converting units of temperature. Fahrenheit to 
 * Celsius, Celsius to Fahrenheit, and Quit button using JOptionpane.
 *
 ************************************/

import javax.swing.JOptionPane;

//Driver class also known as the main class 
public class TemperatureConverterApp {
	public static void main (String[] args) {
		//will hold the users data input
		double digits;
		//will hold the string 
		String input;
		
		//Create a TemperatureConverter object
		//This will link with the operational class
		TemperatureConverter storage = new TemperatureConverter();
		
		//
		
		//Switch case menu with JOptionPane
		//Will have a do while loop
		
		//make variable 0. It will later hold the input of the user
		int userSelection = 0;
		
		do {
			//User will choose a number offered in output
			//That number will go into the String menu and then converted to int
			//Will finally go back to userSelection
			String menu = JOptionPane.showInputDialog("Temperature Conversion" + "\n\n Menu" +
					"\n1. Fahrenheit to Celsius" + "\n2. Celsius to Fahrenheit" + 
					"\n3. Quit");
			userSelection = Integer.parseInt(menu);
			
			switch(userSelection) {
				case 1:
					//need to add the object so that it can connect to operator file
					//will call back for data
					//storage.convertFtoC();
					
					//receive input data
					input = JOptionPane.showInputDialog("Please Enter Fahrenheit. ");
					//convert to double
					digits = Double.parseDouble(input);
					//set as fahrenheit
					storage.setFahrenheit(digits);
					//Convert fahrenheit to celsius
					storage.convertFtoC();
					
					//Display the result in celsius
					JOptionPane.showMessageDialog(null, input + "F = " + storage.getResult() + "C");
					
					break;
				case 2:
					//need object in front so that it knows where the data is which
					//is in the operator file
					//storage.convertCtoF();
					
					//Receive input data from user
					input = JOptionPane.showInputDialog("Please Enter Celsius. ");
					//Convert to double
					digits = Double.parseDouble(input);
					//set as Celsius
					storage.setCelsius(digits);
					//Convert celsius to fahrenheit
					storage.convertCtoF();
					
					//Display the result in fahrenheit
					JOptionPane.showMessageDialog(null, input + "C = " + storage.getResult() + "F");
					
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Bye!");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Error!");
					
			}
		} while (userSelection < 3);
		
	}

}
