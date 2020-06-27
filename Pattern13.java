class Pattern13
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Maximum Number");
		int max = sc.nextInt();

		for (int i = 1; i <= max; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(j+" ");
			}		
			System.out.println();
		}	

		for (int i = 1; i <= max; i++) 		
		{
			for (int j = 1; j <= max-i; j++) 
			{
				System.out.print(j+" ");
			}	
			System.out.println();
		}
	}
}

// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1