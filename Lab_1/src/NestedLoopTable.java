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

public class NestedLoopTable {
	//Will hold the first row entered for the user input
	private static int fRow;
	//Will hold the last row entered for the user input
	private static int lRow;
	
	//Default Constructor
	public NestedLoopTable() {
		fRow = 0;
		lRow = 0;
	}
	
	//Constructor
	public NestedLoopTable(int f, int l) {
		fRow = f;
		lRow = l;
	}
	
	//Method #1
	//Mutator/Setter
	public void setFRow(int f) {
		fRow = f;
	}
	
	//Method #2
	public void setLRow(int l) {
		lRow = l;
	}
	
	//Accessor #1
	//Getter
	public int getFRow() {
		return fRow;
	}
	
	//Accessor #2
	public int getLRow() {
		return lRow;
	}

}
