/*
 * Q3)Write a program to display the following pattern
*********
 *******
  *****
   ***
    *
******
*    *
*    *
******
A
BC
DEF
GHIJ
KLMNO
 */
package trial;

public class pat {

	public static void main(String[] args) {
		int n= 5, al = 65;
		Pp1(n);
		Sp(n);
		Ap(al);
		
	}
	public static void Pp1(int n)
	{
		System.out.println();
		for (int i=n;i>=1;i--)
		{
			for (int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for (int j=0;j<2*i-1;j++)
			{
				System.out.print("*");
			}
			
		System.out.println();
		}
	}
	public static void Sp(int n)
	{
		System.out.println("\n\n");
		for(int i =0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || i == n-1 || j==0 || j== n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
		System.out.println();
		}
	}
	public static void Ap(int al)
	{
		System.out.println("\n\n");
		for(int i =0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)al + " ");
				al++;
			}
			System.out.println();
		}
	}

}
