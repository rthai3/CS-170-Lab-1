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

public class TemperatureConverter {
	//Objects
		//Reason why these variables are private is so the user cannot see it
		//Also they will not be able to access them
		//This will hold fahrenheit
		private static double fah;
		//This will hold celsius
		private static double cels;
		//This will hold the result after calculation to be returned
		double result;
		
		//Default Constructor
		//Usually given automatically by compiler
		//Will not have anything in the parameters
		//Good to write out just in case
		//Decimal inputed since it is a type double
		public TemperatureConverter() {
			fah = 0.0;
			cels = 0.0;
		}
		
		//Constructor
		//Will have another set of variables in parameters
		public TemperatureConverter(double f, double c) {
			fah = f;
			cels = c;
		}
		
		//Methods
		//Mutator #1
		//The first method will set and store the fahrenheit 
		public void setFahrenheit(double f) {
			fah = f;
		}
		
		//Mutator #2
		//The second method will set and store the celsius
		public void setCelsius(double c) {
			cels = c;
		}
		
		//Accessor #1
		//The third method is to have the get function to return the fahrenheit 
		//of the temperature
		public double getFahrenheit() {
			return fah;
		}
		
		//Accessor #2
		//The fourth method is to have the get function to return the celsius of
		//the temperature
		public double getCelsius() {
			return cels;
		}
		
		public double getResult() {
			return result;
		}
		
		//The fifth method is a converting units function
		//This function is tasked with converting the temperature fahrenheit
		//to celsius
		public void convertFtoC() {
			result = (5 * (fah-32)/9);
			result = Math.round(result * 100.0) / 100.0;
		}
		
		//The sixth method
		//This function will convert celsius to fahrenheit
		public void convertCtoF() {
			result = ((9/5) * cels) + 32;
		}

}
