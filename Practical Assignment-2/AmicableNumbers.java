// Write a program user through input two numbers and check amicable
// number using Constructor.
// Example– 220 and 284 are Amicable Numbers.


import java.util.Scanner;

class AmicableNumbers {
    //private 
    int num1, num2;

    // Constructor to initialize the numbers
    AmicableNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Method to check if the numbers are amicable
    //public 
    void checkAmicable() {
        int sum1 = 0, sum2 = 0, temp;

        // Calculate the sum of the proper divisors of num1
        for (int i = 1; i <= num1 / 2; i++) {
            if (num1 % i == 0) {
                sum1 += i;
            }
        }

        // Calculate the sum of the proper divisors of num2
        for (int i = 1; i <= num2 / 2; i++) {
            if (num2 % i == 0) {
                sum2 += i;
            }
        }

        // Check if the numbers are amicable
        if (sum1 == num2 && sum2 == num1) {
            System.out.println(num1 + " and " + num2 + " are Amicable Numbers.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not Amicable Numbers.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        AmicableNumbers amicableNumbers = new AmicableNumbers(num1, num2);
        amicableNumbers.checkAmicable();
    }
}

//output:=
// Enter the first number: 220
// Enter the second number: 224
// 220 and 224 are not Amicable Numbers.