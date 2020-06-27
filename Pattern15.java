class Pattern15
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
				System.out.print(" ");			
			}
			for (int k=1; k<=i ; k++ ) 
			{
				System.out.print(t);
				t++;
			}		
			for (int p = 2; p <= i; p++) 
			{
				System.out.print(t);
				t++;
			}
			System.out.println();
		}		
	}
}

//    1
//   123
//  12345
// 1234567