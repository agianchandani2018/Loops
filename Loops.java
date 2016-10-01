/**
 * This is a project to test different types of Loops
 * @author Ami Gianchandani
 * 
 */

public class Loops
{
	public static void main(String[] args) // no return value
	{
		whileLoop();
		System.out.println("--------------------");
		
		forLoop();
		System.out.println("--------------------");
		
		nestedWhileLoop(4);
		System.out.println("--------------------");
		
		nestedForLoop(7);
		System.out.println("--------------------");
		
		topTriangle(5);
		System.out.println("--------------------");
		
		bottomTriangle(4);
		System.out.println("--------------------");
		
		printStarsTop(5);
		System.out.println("--------------------");
		
		printStarsBottom(4);
	}
	
	/**
	* <This method prints out a list from 1 - 10 with each number on a new line>
	* It does this by incrementing a counter up each time through the while loop until it reaches 11 and can no longer enter the loop
	*/
	
	
	public static void whileLoop()
	{
		int counter = 1;
		while (counter < 11)
		{
			System.out.println(counter);
			counter++; //counter += 1; OR counter += 2
			
		}
	}
	
	/**
	* <This method prints out a list from 0 - 10 with each number on a new line>
	* It does this by incrementing i, the variable up each time through the for loop until it reaches 11 and can no longer enter the loop
	*/
	
	public static void forLoop()
	{
		for(int i = 0; i <= 10; i++)
		{
			System.out.println(i);
		}
	}


	/**
	* <This method prints out n rows and n columns of stars: n depends on the input>
	* It does this by printing a star in the first row for every column and then moving to the next row and printing a star for every column there
	* Uses nested while loops
	* @param n int that is passed in to the method
	*/

	public static void nestedWhileLoop(int n)
	{
		int row = 0;
		while (row < n)
		{
			int column = 0;
			while ( column < n)
			{
				System.out.print('*');
				column ++;
			}
			System.out.println();
			row ++;
		}
	}


	/**
	* <This method prints out n rows and n columns of stars: n depends on the input>
	* It does this by printing a star in the first row for every column and then moving to the next row and printing a star for every column there
	* Uses nested for loops
	* @param n int that is passed in to the method
	*/

	public static void nestedForLoop (int n)
	{
		for(int i = 0; i< n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print('*');
			}
		
	
		System.out.println();
		}
	}
	
	
	/**
	* <This method prints out a triangle>
	* It does this by printing a the same number of stars as the row
	* Uses nested while loops
	* @param n int that is passed in to the method
	*/	
	
	public static void topTriangle (int n)
	{
		int row = 0;
		while (row < n)
		{
			int column = 0;
			while (column <= row)
			{
				//System.out.println(row);
				System.out.print('*');
				
				column ++;
			}
			System.out.println();
			row ++;
		}
	}
	
	/**
	* <This method prints out a triangle with the base on top>
	* It does this by printing the number of stars for the user input number minus the number of rows
	* Uses nested while loops
	* @param n int that is passed in to the method
	*/	
	
	public static void bottomTriangle (int n)
	{
		int row = 0;
		while (row < n)
		{
			int column = (n - row);
			while (column >= 1)
			{
				System.out.print('*');
				column --;
			}
			System.out.println();
			row ++;
		}
	}
	
	/**
	* <This method prints out a triangle>
	* It does this by printing the number of stars for the user input number minus the number of rows
	* Uses nested for loops
	* @param n int that is passed in to the method
	*/	
		
	
	public static void printStarsTop(int n)
	{
		for (int row = 0; row < n; row ++)
		{
			for (int column = n - row; column >= 1; column --)
			{
				System.out.print('*');
			}
			System.out.println();
		}
	}

	
	/**
	* <This method prints out a triangle with the base on top>
	* It does this by printing the number of stars for the user input number minus the number of rows
	* Uses nested for loops
	* @param n int that is passed in to the method
	*/	
	
	public static void printStarsBottom(int n)
	{
		for (int row = 0; row < n; row ++)
		{
			for (int column = n - row; column > 1; column --)
			{
				System.out.print('*');
			}
			System.out.println();
		}
	}




}