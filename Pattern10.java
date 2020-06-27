class Pattern10
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
				System.out.print(j+" ");	
			}
			System.out.println();
			for (int k=1; k<=i;k++) 
			{
				System.out.print(" ");
			}
			
		}		
	}
}
/*
4 3 2 1
 3 2 1
  2 1
   1

*/