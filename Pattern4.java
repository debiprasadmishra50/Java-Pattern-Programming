class Pattern4
{
	public static void main(String[] args) 
	{	
		for (int i=1; i<=5; i++) //5 is the number of rows
		{
			int j=i;
			for (int k=i; k>=1; k--) 
			{
				System.out.print(j+" ");	
				j = j+5;
			}
			System.out.println();
		}
	}
}


/*
1 
2 7 
3 8 13 
4 9 14 19 
5 10 15 20 25
*/
