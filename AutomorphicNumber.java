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