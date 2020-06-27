class Pattern7
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Number of rows");
		int row = sc.nextInt();

		for (int i=1; i <= row; i++) 
		{
			for (int k=i; k<=row; k++) 
			{
				System.out.print(" ");
			}
			for (int j=i; j>0; j--) 
			{
				System.out.print(j+" ");	
			}
			System.out.println();
		}	
	}
}
/*

     1
    2 1
   3 2 1
  4 3 2 1
 5 4 3 2 1
 */