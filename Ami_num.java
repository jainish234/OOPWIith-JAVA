/*1) Write a program user through input two numbers and check amicable
number using Constructor.*/

import java.util.Scanner;
//import java.util.*;
class Ami_num
{
	int num1,num2;
	Ami_num(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	void checkAmicable()
	{
		int sum_num1 = 0, sum_num2 = 0;
		for (int i = 1; i <= num1; i++) 
		{
			if (num1 % i == 0)
				sum_num1 += i;
		}
		for (int i = 1; i <= num2; i++) 
		{
			if (num2 % i == 0)
				sum_num2 += i;
		}
		if (sum_num1 == sum_num2)
		{
			System.out.println("These numbers are amicable.");
		}
		else
		{
			System.out.println("These numbers are not amicable.");
			System.out.println("\n");	
		}
	}
		
	public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Input the second number: ");
        int num2 = sc.nextInt();
		Ami_num amino=new Ami_num(num1,num2);
		amino.checkAmicable();
    }   		
}

/*output:=
========================================
Input the first number: 220
Input the second number: 284
These numbers are amicable.

========================================
Input the first number: 456
Input the second number: 425
These numbers are not amicable.*/
