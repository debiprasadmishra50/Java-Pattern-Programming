class Pattern19
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Number of rows");
		int row = sc.nextInt();

		for (int i=1; i <= row; i++) 
		{ 
			for (int j=row-i+1; j>0; j--) 
			{
				System.out.print("*");	
			}
			for (int p = row-i; p>0; p--) 
			{
				System.out.print("*");	
			}
			System.out.println();
			for (int k=1; k<=i;k++) 
			{
				System.out.print(" ");
			}
			
		}		
	}
}

// *******
//  *****
//   ***
//    *