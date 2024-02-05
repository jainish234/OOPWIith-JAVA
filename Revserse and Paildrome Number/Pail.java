import java.util.*;
class Pail
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int rev=0,rem=0,temp=0;
        System.out.println("Enter any number:-");
        int no=sc.nextInt();
        temp=no;
        while(temp > 0)
        {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if(no == rev)
        {
            System.out.println("This Number is Paildrome."+no);
        }
        else
        {
            System.out.println("This Number is Not Paildrome."+no);
        }
    }
}

Output:=
Enter any number:-
79
This Number is Not Paildrome 79.