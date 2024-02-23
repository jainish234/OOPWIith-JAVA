// Write a program user through input one number and then check. This no is
// AutomorphicNumber or not. Using Constructor.
// Examples: 5*5 = 25, 6*6 = 36, 25*25 = 625.

import java.util.Scanner;

class AutomorphicNumber {
    //private 
    int num;

    // Constructor to initialize the number
    AutomorphicNumber(int num) {
        this.num = num;
    }

    // Method to check if the number is an Automorphic Number
    //public 
    void isAutomorphicNumber() {
        int square = num * num;
        int lastDigits = square % 100;

        if (lastDigits == num) {
            System.out.println(num + " is an Automorphic Number.");
        } else {
            System.out.println(num + " is not an Automorphic Number.");
        }
    }

    // Main method to take user input and create an object of AutomorphicNumber
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        AutomorphicNumber automorphicNumber = new AutomorphicNumber(num);
        automorphicNumber.isAutomorphicNumber();
        scanner.close();
    }
}

// output:=
// Enter a number: 25
// 25 is an Automorphic Number.