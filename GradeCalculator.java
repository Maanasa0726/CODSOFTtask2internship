import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Initialize variables
        double totalMarks = 0;

        // Loop to input marks for each subject
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            double marks = scanner.nextDouble();
            totalMarks += marks;
        }

        // Calculate average
        double average = totalMarks / numSubjects;
        System.out.println("Average marks: " + average);

        // Determine grade
        char grade = getGrade(average);
        System.out.println("Grade: " + grade);

        // Close the scanner
        scanner.close();
    }

    // Method to determine the grade based on the average
    public static char getGrade(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
