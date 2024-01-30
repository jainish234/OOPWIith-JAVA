import java.util.*;
class Menu
{
    public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
    	while(true)
        {
            System.out.println("-----------------");
	        System.out.println("1.Addititon");
	        System.out.println("2.Subtraction");
            System.out.println("3.Multi");
	        System.out.println("4.Div");
            System.out.println("5.Exit");
            System.out.println("-----------------");

	        System.out.print("Select  aboue menu");
                       			
			int no=sc.nextInt();
            int no1,no2;
            switch(no)
            {
				case 1:
					System.out.println("Addititon");
					System.out.println("Enter Number one");
					no1=sc.nextInt();
					System.out.println("Enter Number two");
					no2=sc.nextInt();
					System.out.println("Add is:"+(no1+no2));
					break;
				case 2:
					System.out.println("Subtration");
					System.out.println("Enter Number one");
					no1=sc.nextInt();
					System.out.println("Enter Number two");
					no2=sc.nextInt();
					System.out.println("Sub is:"+(no1-no2));
					break;
				case 3:
					System.out.println("Multiplication");
					System.out.println("Enter Number one");
					no1=sc.nextInt();
					System.out.println("Enter Number two");
					no2=sc.nextInt();
					System.out.println("Multi is:"+(no1*no2));
					break;
				case 4:
					System.out.println("Division");
					System.out.println("Enter Number one");
					no1=sc.nextInt();
					System.out.println("Enter Number two");
					no2=sc.nextInt();
					System.out.println("Div is:"+(no1/no2));
					break;
					
				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("Please provide not airthmetic");
			}
        }
    }	 
}