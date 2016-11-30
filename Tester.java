import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		int row = 0;
		int column = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Please give a non negative integer for rows: "); // prompt for number of rows
		row = input.nextInt();
		System.out.println();
		while(row < 0) // check if valid number
		{
			System.out.println("The number you gave is not a valid number. PLease try again.");
			System.out.print("Please give a non negative integer for rows: ");
			row = input.nextInt();
			System.out.println();
		}
		System.out.print("Please give a non negative integer for columns: ");  // prompt for number of columns
		column = input.nextInt();
		System.out.println();
		while(column < 0) // check if valid number
		{
			System.out.println("The number you gave is not a valid number. PLease try again.");
			System.out.print("Please give a non negative integer for columns: ");
			column = input.nextInt();
			System.out.println();
		}
		input.close();
		System.out.println();
		MultiplicationTable table = new MultiplicationTable(row , column);
		table.printTable();
		
	} // end of main method

} // end of  Tester class
