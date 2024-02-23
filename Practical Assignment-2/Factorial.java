import java.util.*;

class Fact_Con
{
    int fact = 1;
    int num;

    Fact_Con(int a) {
        num = a;
    }

    void cal_Fact() {
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
    }

    void disFact() {
        System.out.println("Factorial of the entered number is: " + fact);
    }
}

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter a number: ");
        int userInput = sc.nextInt();

        Fact_Con f = new Fact_Con(userInput);

        f.cal_Fact();
        f.disFact();
    }
}