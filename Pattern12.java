class Pattern12
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Maximum Number");
		int max = sc.nextInt();
		for (int i = 1; i <= max; i++) 
		{ 
			for (int j = max-i+1; j > 0; j--) 
			{
				System.out.print(j+" ");	
			}
			System.out.println();
		}

		for (int i = 1; i <= max; i++) 
		{ 
			for (int j = i; j > 0; j--) 
			{
				System.out.print(j+" ");	
			}
			System.out.println();
		}
	}
}
/*
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
*/