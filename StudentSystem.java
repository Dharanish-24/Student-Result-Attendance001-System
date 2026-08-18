
import java.util.*;

public class StudentSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Student Details
        System.out.print("Enter student name: ");
        String studentName = input.nextLine();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        // Subject Marks
        System.out.print("Enter Mathematics mark: ");
        int mathematics = input.nextInt();

        System.out.print("Enter Science mark: ");
        int science = input.nextInt();

        System.out.print("Enter Computer Science mark: ");
        int computerScience = input.nextInt();

        // Attendance
        System.out.print("Enter attendance percentage: ");
        double attendance = input.nextDouble();

        // Calculate Total
        int total = mathematics + science + computerScience;

        // Calculate Average
        double average = total / 3.0;

        // Calculate Grade
        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else if (average >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Check Pass / Fail
        boolean passed;

        if (mathematics >= 40
                && science >= 40
                && computerScience >= 40
                && attendance >= 75) {

            passed = true;

        } else {
            passed = false;
        }

        // Display Result
        System.out.println("\n========================================");
        System.out.println("       STUDENT RESULT SYSTEM");
        System.out.println("========================================");

        System.out.println("Student Name       : " + studentName);
        System.out.println("Age                : " + age);

        System.out.println("----------------------------------------");

        System.out.println("Mathematics        : " + mathematics);
        System.out.println("Science            : " + science);
        System.out.println("Computer Science   : " + computerScience);

        System.out.println("----------------------------------------");

        System.out.println("Total Marks        : " + total);
        System.out.println("Average            : " + average);
        System.out.println("Grade              : " + grade);
        System.out.println("Attendance         : " + attendance + "%");

        if (passed) {
            System.out.println("Result             : PASS");
        } else {
            System.out.println("Result             : FAIL");
        }

        System.out.println("========================================");

        input.close();
    }
}
