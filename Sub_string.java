/*14) Write a program to enter a string and print each word alogn with the number of
vowels in it.
Example:
Input:
Enter a string: These are wonderful times.
OUTPUT:
Word Vowel
These 2
Are 2
Wonderful 3
Times 2*/

import java.io.*;
class Sub_string
{
	public static void main(String fh[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a sentence : ");
		String str=br.readLine();
		str+=" ";
		int l=str.length();
		String t=" ";
		int i,j,c=0,p=0;
		for(i=0;i<l;i++)
		{
			char ch=str.charAt(i);
			if(ch==' ')
			{
				t=str.substring(p,i+1);
 				c=0;
 				for(j=0;j<t.length();j++)
 				{
 					char k=t.charAt(j);
 					if(k=='a'||k=='e'|| k=='i' || k=='o' ||k=='u' || k=='A' || k=='E' || k=='I' || k=='O' || k=='U')
 					c++;
 				}
				System.out.println(t+"\t"+c);
 				p=i+1;
 			}
 		}
	} 
} 

/*output:=
Enter a sentence :
These are wonderful times.
Word 			Vowel
-------------------------
These   		2
are     		2
wonderful       3
times.  		2*/
