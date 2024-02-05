import java.util.*;
class Art{
    Scanner sc=new Scanner(System.in);
    int no1,no2;
    Art()
    {
        System.out.print("Enter Number1:");
        no1 = sc.nextInt();
        System.out.print("Enter Number2:");
        no2 = sc.nextInt();
    }
    void add()
    {
        System.out.println("Addition"+(no1+no2));
    }
    void sub()
    {
        System.out.println("Sub"+(no1-no2));
    }
}
class Cons2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Art a=new Art();
        System.out.println("Enter Above Number:");
        int no=sc.nextInt();
        switch(no)
        {
            case 1:
                a.add();
                break;
            case 2:
                a.sub();
                break;
            default:
                System.out.println("Plz Enter Number");
        }
    }
}

//output:=

Enter Number1:45
Enter Number2:67
Enter Above Number:
100
Plz Enter Number