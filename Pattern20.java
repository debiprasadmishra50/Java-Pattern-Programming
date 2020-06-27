class Pattern20
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Number of rows");
		int row = sc.nextInt();
		int t = row-1;
		for (int i=1; i <= row ; i++) 
		{
			for (int j=1; j <= row-i+1; j++) 
			{
				System.out.print(j+" ");				
			}
			for (int p = t; p > 0; p--) 
			{
				System.out.print(p+" ");
			}
			System.out.println();
			for (int j=1; j <= i; j++) 
			{
				System.out.print("  ");				
			}
			t--;
		}		
	}
}

// 1 2 3 4 3 2 1
//   1 2 3 2 1
//     1 2 1
//       1