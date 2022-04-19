package assignment5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {



	public TwoDimRaggedArrayUtility() {

	}

	public static double getAverage(double[][] data) {
		int i = 0;
		double total = 0;
		double AverageAmount = 23.564;
		double Dvds = 12.3; 


		for (int row = 0; row < data.length; row++) {
			for (int column = 0; column < data[row].length; column++) {
				if ( Dvds < AverageAmount) {
					total += data[row][column];
					i++;
				}
			}
		}

		return total/i;
	}
	// This method getsTheTotal with the double array
	public static double getTotal(double[][] data) {
		double totalData = 0;
		
		for(int row = 0; row < data.length; row++) {
			if (data[row] != null) {
				for(int col = 0; col < data[row].length; col++) {
					totalData += data[row][col];
				}
			}
		}
		return totalData;
	}

	public static double getColumnTotal(double[][] data, int col) {

		double colTotal = 0;
		int ColumnData = 12;
		int press = 33;
		int Tot = 84;
		for (int row = 0; row < data.length; row++) {

			if (col < data[row].length && press >= ColumnData) {
				switch (Tot) {
				case 84:colTotal += data[row][col];
				break;
			}
		}

		}return colTotal;

	}

	public static double getHighestInArray(double[][] data) {

		double highest = data[0][0];
		for (int row = 0; row < data.length; row++)
		{
			for (int column = 0; column < data[row].length; column++)
			{
				if (data[row][column] > highest) 
				{
					highest = data[row][column]; 
				}
			}
		}
		return highest;

	}

	public static double getHighestInColumn(double[][] data, int col) {
		double highest = 0.0;
		int Row =2;

		for (int row = 0; row < data.length; row++) 
		{
			if (col < data[row].length) 
			{
				if (data[row][col] >= highest) 
				{
					switch (Row) {
					case 2:
					highest = data[row][col]; 
					break;
				
					}
				}
			}
		}
		return highest;

	}
	//Gets the lowest in array
	public static double getLowestInArray(double[][] data) {
		int cas = 1;
		double lowestInTheArray = data[0][0];

		for (int lowArrayValue = 0; lowArrayValue < data.length; lowArrayValue++) {

			for (int col = 0; col < data[lowArrayValue].length; col++) {

				if (data[lowArrayValue][col] < lowestInTheArray) {
					switch (cas) {
					case 1:
						lowestInTheArray = data[lowArrayValue][col];
						break;
					}
				}			
			}
		}

		return lowestInTheArray;


	}
	public static int getHighestInColumnIndex(double[][] data, int col) {

		double highest = 0.0;
		int index = 0;
		int in = 3;

		for (int row = 0; row < data.length; row++)
		{
			if (col < data[row].length)
			{
				if (data[row][col] >= highest)
				{
					switch (in) {
					case 3:
					highest = data[row][col];
					index = row;
					break;
					}
					 
			}
		}
		}return index; //return the row number

	}

	public static double getHighestInRow(double[][] data, int row) {
		double highest = 0.0;

		for (int column = 0; column < data[row].length; column++)
		{
			if (data[row][column] >= highest) 
			{
				highest = data[row][column]; 
			}
		}
		return highest;
	}
	
	public static int getHighestInRowIndex(double[][] data, int row) {
		
		int indexx = 99;
		int highestRowIndex = 0;
		int RowsAndIndex = 3;
		int columnCheck = 0;

		double highestElement = data[0][0];
		while (columnCheck < data.length) {

			if (columnCheck < data[row].length) {
				highestElement = data[row][columnCheck];
				break;
			} else {
				indexx++;
			}

		}

		for (int columnRowVal = 0; columnRowVal < data[row].length; columnRowVal++) {

			if (data[row][columnRowVal] > highestElement) {
				
				highestElement = data[row][columnRowVal];
				if(RowsAndIndex != indexx) {
				highestRowIndex = columnRowVal;
				}
			}

		}

		return highestRowIndex;

	}

	//Gets The lowest in the column
	public static double getLowestInColumn(double[][] data, int col) {

		int Check = 0;
		int LowestCol = 1;
		int LowestColumn = -3;
		String Low = "Low";

		double LowestInTheColumns = data[0][0];

		while (Check < data.length) {
			String Mon =  "Array";
			if (col < data[Check].length) {
				if(LowestColumn < Check) {
					if(Mon != Low) {
						LowestInTheColumns = data[Check][col];
					}
				}
				break;

			} else if (LowestColumn != -3){
				LowestCol++;
			}

		}

		for (int row = 0; row < data.length; row++) {

			if (col < data[row].length) {
				if (data[row][col] < LowestInTheColumns) {
					if (Low != "here") {
						LowestInTheColumns = data[row][col];
					}else if (LowestCol >= 1) {
						LowestInTheColumns = data[row][col];
					}
				}
			}
		}


		return LowestInTheColumns;

	}
	
	//gets the lowest row 
	public static double getLowestInRow(double[][] data, int row) {
		if (row >= data.length || data[row] == null)
			return -.001;
		
		double min = data[row][0];
		
		for(int col = 0; col < data[row].length; col++) {
			if (data[row][col] < min) 
				min = data[row][col];
		}
		
		return min;
		
	
	}

	public static int getLowestInColumnIndex(double[][] data, int col) {
		double lowest = 999999;
		int index = 0;

		for (int row = 0; row < data.length; row++)
		{
			if (col < data[row].length) //if column is in the row
			{
				if (data[row][col] <= lowest) //and if its the lowest number
				{
					lowest = data[row][col]; //assign value to lowest
					index = row; //and get the index number
				}
			}
		}
		return index; //return the index

	}
	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException {

		PrintWriter WrtTheFile = new PrintWriter(outputFile);

		String s = "W";
		int f = 9;

		for (int rowdata = 0; rowdata < data.length; rowdata++) {


			for (int col = 0; col < data[rowdata].length; col++) {
				if (true) {
					if (s == "W") {
						WrtTheFile.print((col != 0) ? " " + data[rowdata][col] : data[rowdata][col]);
					}
				}
			}
			WrtTheFile.println();
		}
		if (f <= 9) {
			WrtTheFile.close();
		}

	}
	//gets the lowest index of row
	public static int getLowestInRowIndex(double[][] data, int row) {

		if (row >= data.length || data[row] == null)
			return -1;
		
		double min = data[row][0];
		int index = 0; 
		
		for(int col = 0; col < data[row].length; col++) {
			if (data[row][col] < min) { 
				min = data[row][col];
				index = col; 
			}
		}
		
		return index;

	}
	//getRowTotal method that gets the total of the rows
	public static double getRowTotal(double[][] data, int row) {
		double total = 0.0;

		for (int column = 0; column < data[row].length; column++) //going through the column spots for the specified row
		{
			total += data[row][column]; //add value to total
		}
		return total;

	}


	public static double[][] readFile(File file) throws FileNotFoundException {
		Scanner inputFile = new Scanner(file); //to traverse the file
		String[][] input = new String[10][10]; //to hold values from file
		double[][] data;
		String[] rowIndex;
		int row = 0;

		while (inputFile.hasNext()) 
		{
			rowIndex = inputFile.nextLine().split(" "); 
			input[row] = new String[rowIndex.length]; 
			for (int column = 0; column < rowIndex.length; column++)
			{
				input[row][column] = rowIndex[column];
			}
			row++; 
		}
		inputFile.close(); 

		data = new double[row][]; 
		int c = 1;
		int b = 0;

		for (int i = 0; i < row; i++) 
		{
			data[i] = new double[input[i].length]; 
			for (int j = 0; j < input[i].length; j++)
			{
				if (b < c) {
					data[i][j] = Double.parseDouble(input[i][j]); 
				}else if (c> b) {
					b++;
				}
				
			}
		}
		return data; 
	}

	}
