class Pattern8
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Number of rows");
		int row = sc.nextInt();

		for (int i=1; i <= row; i++) 
		{
			for (int j =1; j <= row-i+1; j++) 
			{
				System.out.print(j);	
			}
			System.out.println();
		}
	}
}
/*
1234
123
12
1
*/