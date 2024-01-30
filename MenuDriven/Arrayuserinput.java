import java.util.*;
class Arrayuserinput
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] no=new int[5];
		int k=1;
		for(int i=0;i<no.length;i++)
		{
			System.out.print("Enter no->"+k+":");
			no[i]=sc.nextInt();
			k++;
		}
		System.out.println("Array Display");
		int sum=0;
		int j=1;
		for(int i=0;i<no.length;i++)
		{
			System.out.print("No is->"+j+":"+no[j]);
			sum=sum+no[i];
			j++;
		}
		System.out.println("Array Sum is:"+sum);
	}
}