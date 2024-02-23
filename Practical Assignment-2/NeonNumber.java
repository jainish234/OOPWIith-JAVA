import java.util.Scanner;

class Neonnum_Con
{
    int number;

    Neonnum_Con(int num) 
    {
        this.number = num;
    }

    boolean isNeon() 
    {
        int square = number * number;
        int sumOfDigits = 0;

        while (square != 0) 
        {
            int digit = square % 10;
            sumOfDigits += digit;
            square /= 10;
        }

        return (sumOfDigits == number);
    }
}

class NeonNumber  
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = sc.nextInt();

        Neonnum_Con neon = new Neonnum_Con(inputNumber);

        if (neon.isNeon()) 
        {
            System.out.println("Given number " + inputNumber + " is a Neon number.");
        } 
        else 
        {
            System.out.println("Given number " + inputNumber + " is not a Neon number.");
        }
    }
}

// output:=
// Enter a number: 9
// Given number 9 is a Neon number.