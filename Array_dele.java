/*13)Write a program to create an array of elements and delete a given element from the
array. Your program should display an appropriate error message if the element to
be deleted is not found in the array.*/

/*Example:
Size of the array:5
Input 5 Integers :1,2,4,5,6
Enter the element to be deleted:4
Output:
1,2,5,6*/

import java.util.*;
class delete
{
	delete()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		int i,j,k;
		System.out.println("Enter "+n+" integers:");
		for(i=0;i<n;i++)
		{
 			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be deleted: ");
		int e=sc.nextInt();
		boolean flag=false;
		for(i=0;i<n;i++)
		{
			if(a[i]==e)
			{
 				for(j=i;j<n-1;j++)
 				{
 					a[j]=a[j+1];
 				}
 				flag=true;
 				n--;
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
 			System.out.print("Element not found");
		}

	}
}
class Array_dele
{
	public static void main(String args[])throws InputMismatchException
	{
		delete d=new delete();
		
	}
} 

/*output:
Enter the size of the array:
6
Enter 6 integers:
1 2 4 5 6 7
Enter the element to be deleted:
6
1 2 4 5 7*/