import java.util.*;
class Rev
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
        System.out.println("Original Number is:-"+no);
        System.out.println("Reverse Number is:-"+rev);
    }
}

Output:=
Enter any number:-
589
Original Number is:-589
Reverse Number is:-985