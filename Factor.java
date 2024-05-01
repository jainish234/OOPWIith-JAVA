import java.util.Scanner;

class FactCal_Con
{
    int number;

    FactCal_Con(int num) 
    {
        number = num;
    }

    void dis_Fact() 
    {
        System.out.print("Factors of " + number + " are: ");
        for (int i = 1; i <= number; ++i) 
        {
            if (number % i == 0) 
            {
                System.out.print(i + " ");
            }
        }
    }
}

class Factor
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int userInput = sc.nextInt();

        FactCal_Con f = new FactCal_Con(userInput);
        f.dis_Fact();
    }
}