class Pattern5
{
	static boolean isPrime(int num)
	{
		for (int i = 2; i <= (num/i); i++)
        {
           if (num % i == 0)
           return false;
        }
        return true;   
	}
	public static void main(String[] args) 
	{
		int row = 5, count = 2;
		for (int i =1; i <= row; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				while(!isPrime(count))		
				{
					count++;
				}
				System.out.print(count+" ");
				count++;
			}	
			System.out.println();
		}

	}
}
/*
2
3 5
7 11 13
17 19 23 29
31 37 41 43 47
*/
