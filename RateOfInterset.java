/*
 * Q1) Accept age and gender from user and display the rate of interest as follow
age above 60 and gender Male (RI= 7 %)
age above 60 and gender FeMale (RI= 7.5 %)
below 60 age = RI 5%
 */
package trial;

import java.util.Scanner;

public class RateOfInterest {

	public static void main(String[] args) {
		AgeRI();
	}
	
	public static void AgeRI()
	{
		int age;
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age: ");
		age = sc.nextInt();
		System.out.println("Enter Gender M/F?");
		char gender= sc.next().charAt(0);
		if(gender == 'M' || gender == 'm')
		{
			if(age>60 )
			{
				System.out.println("The Rate of Interest is 7% ");
			}
			else if(age<60)
			{
				System.out.println("the rate of Interest is 5% ");
			}
		}
		if(gender == 'F' || gender == 'f')
		{
			if((age>60) )
			{
				System.out.println("The Rate of Interest is 7.5% ");
			}
			else if(age<60)
			{
				System.out.println("the rate of Interest is 5% ");
			}
		}
		else
		{
			System.out.println("Enter Valid input");
		}
		sc.close();
	}

}
