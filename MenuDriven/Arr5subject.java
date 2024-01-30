import java.util.*;
class Arr5subject
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String[] s_num=new String[5];
		int k=1;
		for(int i=0;i<s_num.length;i++)
		{
			System.out.print("Enter your subject name->"+k+":");
			s_num[i]=sc.next();
			k++;
		}
		System.out.println("\n Display Array Subject Name");
		int j=1;
		for(int i=0;i<s_num.length;i++)
		{
			System.out.println("Enter your subject name:"+j+":"+s_num[i]);
			j++;
		}
	}
}