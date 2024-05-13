package homeworkweek5.Calculate;

//Write a “main” method into the main class. It has a scanner that takes
// user input. Also write the logic that it ask user to “Enter first Number:”,
// “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
// enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
// other symbols

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        char choice;

        do {
            System.out.print("Enter first Number: ");
            int a = scanner.nextInt();

            System.out.print("Enter second Number: ");
            int b = scanner.nextInt();

            System.out.print("Please enter one of symbol +,-,*, /: ");
            char symbol = scanner.next().charAt(0);

            calculator.calculateResult(a, b, symbol);

            System.out.print("Would you like to do more calculation? Please enter 'Y' or 'N': ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        scanner.close();
    }
}
