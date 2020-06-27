class Pattern14
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Number of rows");
		int row = sc.nextInt();

		for (int i=1; i <= row; i++) 
		{
			for (int j=1; j<=i; j++) 
			{
				if(j%2 == 0)
					System.out.print(0+" ");			
				else
					System.out.print(1+" ");
			}		
			System.out.println();
		}	
	}
}

// 1
// 1 0
// 1 0 1
// 1 0 1 0
// 1 0 1 0 1