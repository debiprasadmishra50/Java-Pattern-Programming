Q1
---------------------------
class Pattern1
{
	public static void main(String[] args) 
	{
		for (int i=1; i<5; i++) 
		{
			for (int j=1; j<=i; j++) 
			{
				System.out.print("* ");				
			}			
			System.out.println();
		}		
	}
}
/*
*
* *
* * *
* * * *
*/


Q2
------------------------
class Pattern2
{
	public static void main(String[] args) 
	{
		for (int i=1; i<5; i++) 
		{
			for (int j=1; j<=i; j++) 
			{
				System.out.print("1");				
			}			
			System.out.println();
		}			
	}
}
/*
1
11
111
1111
*/

Q3
---------------------------
class Pattern3
{
	public static void main(String[] args) 
	{
		for (int i=1; i<5; i++) 
		{
			for (int j=1; j<=i; j++) 
			{
				System.out.print(j);				
			}			
			System.out.println();
		}				
	}
}
/*
1
12
123
1234
*/



Q4
----------------------------
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



Q5
------------------------
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


Q6
----------------------------
class Pattern6
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Number of rows");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) 
		{
			for (int j = row-1; j >= i; j--) 
			{
				System.out.print(" ");			
			}
			for (int k=1; k<=i ; k++ ) 
			{
				System.out.print("#");
			}		
			System.out.println();
		}	
	}
}
/*
     #
    ##
   ###
  ####
 #####
 */


 Q7
 ----------------------
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


 Q8
 ------------------------
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


Q9
--------------------------
class Pattern9
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Number of rows");
		int row = sc.nextInt();


		for (int i=1; i <= row; i++) 
		{ 
			for (int j=row-i+1; j >=1; j--) 
			{
				System.out.print(j);	
			}
			System.out.println();
		}	
	}
}
/*
4321
321
21
1
*/


Q10
----------------------
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


   Q11
   ----------------------
   class Pattern11
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Maximum Number");
		int max = sc.nextInt();
		for (int i = 1; i <= max; i++) 
		{ 
			for (int j = 1; j <= max-i+1; j++) 
			{
				System.out.print(j+" ");	
			}
			System.out.println();
		}

		for (int i = 1; i <= max; i++) 
		{ 
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(j+" ");	
			}
			System.out.println();
		}
	}
}
/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/


Q12
------------------------
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


Q13
-------------------------
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


Q14
----------------------
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


Q15
----------------------------
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


Q16
----------------------
class Pattern16
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
			
			for (int p = i-1; p > 0; p--) 
			{
				System.out.print(p);
			}
			System.out.println();
		}			
	}
}

//    1
//   121
//  12321
// 1234321



Q17
--------------------
class Pattern17
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
				System.out.print("  ");		//Just added another space here, rest is same as Pattern16	
			}
			for (int k=1; k<=i ; k++ ) 
			{
				System.out.print(t+" ");
				t++;
			}	
			
			for (int p = i-1; p > 0; p--) 
			{
				System.out.print(p+" "); //just another space here
			}
			System.out.println();
		}			
	}
}

//       1
//     1 2 1
//   1 2 3 2 1
// 1 2 3 4 3 2 1



Q18
--------------------------
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



Q19
---------------------
class Pattern19
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
				System.out.print("*");	
			}
			for (int p = row-i; p>0; p--) 
			{
				System.out.print("*");	
			}
			System.out.println();
			for (int k=1; k<=i;k++) 
			{
				System.out.print(" ");
			}
			
		}		
	}
}

// *******
//  *****
//   ***
//    *



Q20
-----------------------
class Pattern20
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Number of rows");
		int row = sc.nextInt();
		int t = row-1;
		for (int i=1; i <= row ; i++) 
		{
			for (int j=1; j <= row-i+1; j++) 
			{
				System.out.print(j+" ");				
			}
			for (int p = t; p > 0; p--) 
			{
				System.out.print(p+" ");
			}
			System.out.println();
			for (int j=1; j <= i; j++) 
			{
				System.out.print("  ");				
			}
			t--;
		}		
	}
}

// 1 2 3 4 3 2 1
//   1 2 3 2 1
//     1 2 1
//       1