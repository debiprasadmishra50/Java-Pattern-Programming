class Pattern17
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Number of rows");
		int row = sc.nextInt();
		
		for (int i = 1; i <= row; i++) 
		{
			int t = 1;
			for (int j = row-1; j >= i; j--) 
			{
				System.out.print("  ");		//Just added another space here, rest is same as Pattern16	
			}
			for (int k=1; k<=i ; k++ ) 
			{
				System.out.print(t+" ");
				t++;
			}	
			
			for (int p = i-1; p > 0; p--) 
			{
				System.out.print(p+" "); //just another space here
			}
			System.out.println();
		}			
	}
}

//       1
//     1 2 1
//   1 2 3 2 1
// 1 2 3 4 3 2 1