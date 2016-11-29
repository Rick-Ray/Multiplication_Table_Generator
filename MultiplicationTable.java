
public class MultiplicationTable {
	
	private int row = 0;
	private int col = 0;
	private int spaceBuffer = 2;
	private int limitForSpaces = 0;
	private String cLSpace = " "; // 1 space added for cleaner look (can be taken out) btw cL stands for cleaner look
	
	public MultiplicationTable(int r , int c){
		if(r >= 0) this.row = r + 1;
		if(c >= 0) this.col = c + 1;
		this.limitForSpaces = lengthOfDigits(row*col) + spaceBuffer;
		//printTable(); // for testing
	} // end of MultiplicationTable
	
	public void setSpaceBufferLength(int length){
		if(length >= 0) this.spaceBuffer = length;
	} // end of setSpaceBufferLength
	
	public int getSpaceBufferLength(){
		return this.spaceBuffer;
	} // end of getSpaceBufferLength
	
	private int lengthOfDigits(int num){ // helper method for printTable 
		int count = 0;
		do{
			num = num/10;
			count++;
		}while(num != 0); // end of do while loop
		return count;
	} // end of lengthOfDigits
	
	private String calculateSpaces(int length){ // helper method for printTable
		String cSpaces = "";
		for(int i = 0; i<limitForSpaces - length; i++) cSpaces = cSpaces + " ";
		return cSpaces;
	} // end of calculateSpaces
	
	public void printTable(){
		//print first number list (column digits)
		System.out.print(cLSpace+calculateSpaces(0));
		for(int i = 0; i<col; i++) System.out.print(i+cLSpace+calculateSpaces(lengthOfDigits(i))); 
		System.out.println();
		System.out.println(); // added for cleaner look (can be taken out)
		for(int i = 0; i<row; i++)
		{   //print row digit
			System.out.print(i+cLSpace+calculateSpaces(lengthOfDigits(i))); 
			for(int j = 0; j<col; j++)
			{   // print row * column
				System.out.print(i*j+cLSpace+calculateSpaces(lengthOfDigits(i*j))); 
			} // end of for j
			System.out.println(); // go to next line
		} // end of for i
	} // end of printTable
	
} // end of MultiplicationTable Class
