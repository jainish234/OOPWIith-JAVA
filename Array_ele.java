/*12)Write a program to create an array of n elements and insert a given at the given
position in the array .Your program should display appropriate error message if the
position is invalid.*/

/*Example:
Size of the array:5
Input 5 integers:1,2,4,5,6
Enter the element to be inserted :3
Enter the position at which the element should be inserted:3
OUTPUT:
1,2,3,4,5,6*/

import java.util.*;
class Perform6
{
		int n,i,j,k;
		Scanner sc=new Scanner(System.in);
		Perform()
		{
			System.out.println("Enter the size of the array: ");
			n=sc.nextInt();
			int a[]=new int[n+1];

			System.out.println("Enter "+n+" integers:");
			for(i=0;i<n;i++)
			{
 				a[i]=sc.nextInt();
			}
			System.out.println("Enter the element to be inserted: ");
			int e=sc.nextInt();

			System.out.println("Enter the position: ");
			int p=sc.nextInt();
			
			boolean flag=false;
			for(i=0;i<n;i++)
			{
				if(i+1==p)
				{
	 				for(j=n;j>i;j--)
 					{
	 					a[j]=a[j-1];
 					}
 					a[i]=e;
 					flag=true;
 					n++;
 					break;
				}
			}
			if(flag)
			{
	 			for(i=0;i<n;i++)
 				System.out.print(a[i]+" ");
			}
			else
			{
 				System.out.print("Position Invalid");
			}
		}
}
class Array_ele
{
	public static void main(String args[])throws InputMismatchException
	{
		Perform p=new Perform();
	} 
}

/*output:=
Enter the size of the array:
5
Enter 5 integers:
1 3 5 7 9
Enter the element to be inserted:
10
Enter the position:
5
1 3 5 7 10 9*/



