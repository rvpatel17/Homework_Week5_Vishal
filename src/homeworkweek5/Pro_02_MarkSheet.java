package homeworkweek5;

// Rewrite the student mark sheet programme (From java-homework-week3
// programmes) using if else and while loop.

import java.util.Scanner;

public class Pro_02_MarkSheet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter student Roll No: ");
        int rollNo = scanner.nextInt();

        System.out.println("Enter marks for Math (between 0 to 100): ");
        int mathMarks = scanner.nextInt();
        if (mathMarks < 0 || mathMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }

        System.out.println("Enter marks for Science (between 0 to 100): ");
        int scienceMarks = scanner.nextInt();
        if (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }

        System.out.println("Enter marks for English (between 0 to 100): ");
        int englishMarks = scanner.nextInt();
        if (englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }

        int total = mathMarks + scienceMarks + englishMarks;
        double percentage = (total / 3.0);

        String result;
        if (percentage >= 35) {
            result = "Pass";
        } else {
            result = "Fail";
        }

        String grade;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "N/A";
        }

        System.out.println("_____________________________");
        System.out.println("|                           |");
        System.out.println("|         Mark Sheet        |");
        System.out.println("|___________________________|");
        System.out.println("| Name      : " + name +    "       |");
        System.out.println("| Roll No   : " + rollNo +    "     |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects  : Marks         |");
        System.out.println("|___________________________|");
        System.out.println("| Math      : " + mathMarks +       "            |");
        System.out.println("| Science   : " + scienceMarks +    "            |");
        System.out.println("| English   : " + englishMarks +       "            |");
        System.out.println("|___________________________|");
        System.out.println("| Total     : " + total + "           |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage: " + percentage + "          |");
        System.out.println("| Result    : " + result + "             |");
        System.out.println("| Grade     : " + grade + "              |");
        System.out.println("|___________________________|");

        scanner.close();
    }
}
