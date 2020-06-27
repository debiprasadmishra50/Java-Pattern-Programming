class Pattern18
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
				System.out.print("  ");		
			}
			for (int k=1; k<=i ; k++ ) 
			{
				System.out.print(t);
				if(i==1) //Not print * for row 1
					break;
				else
					System.out.print("*");
				t++;
			}	
			
			for (int p = i-1; p > 0; p--) 
			{
				System.out.print(p); 
				if(p==1) //Not print * for last column
					break;
				else
					System.out.print("*");
			}
			System.out.println();
		}			
	}
}

//       1
//     1*2*1
//   1*2*3*2*1
// 1*2*3*4*3*2*1