public class Loops
{
	public static void main(String[] args) // no return value
	{
		whileLoop();
		
		System.out.println("--------------------");
		forLoop();
		
		nestedWhileLoop(4);
		
		nestedForLoop(7);
		
		topTriangle(4);
		
		bottomTriangle(4);
	}
	
	public static void whileLoop()
	{
		int counter = 1;
		while (counter < 11)
		{
			System.out.println(counter);
			counter++; //counter += 1; OR counter += 2
			
		}
	}
	public static void forLoop()
	{
		for(int i = 0; i <= 10; i++)
		{
			System.out.println(i);
		}
	}

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
	
	
	public static void topTriangle (int n)
	{
		int row = 0;
		while (row < n)
		{
			int column = 0;
			while (column <= row)
			{
				//System.out.println(row);
				System.out.print("*");
				
				column ++;
			}
			System.out.println();
			row ++;
		}
	
	}
	
	public static  void bottomTriangle (int n)
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
	



}