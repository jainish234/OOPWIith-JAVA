/*15)Write a program to enter a main string and sub string and find the number of times
the substring is present in the main string ignoring case consideratins.
Assusem that substring is present only as a single word.It is neither found inside
the string nor as a group of words.*/

/*Example:
Enter main String: The man goes to the theatre.
Enter a substring: The
Output:
No of times substring is present in the main string:2*/

import java.io.*;
public class Search_string
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a main string: ");
		String ms=br.readLine();
		System.out.println("Enter a substring: ");
		String ss=br.readLine();
		int l=ms.length();
		int i,p=0,freq=0;
		
		for(i=0;i<l;i++)
		{
 			char ch=ms.charAt(i);
 			if(ch==' ')
 			{
 				String word=ms.substring(p,i);
 				if(word.equalsIgnoreCase(ss))
 				{
 					freq++;
 				}
 				p=i+1;
 			}
		}
		System.out.println("No of times substring is present in the main string: "+freq);
	} 
} 

/*output:=
Enter a main string:
The man goes to the theatre.
Enter a substring:
The
No of times substring is present in the main string: 2*/
