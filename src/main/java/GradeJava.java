import java.util.Scanner;

public class GradeJava {
    public static void main(String[] args) {
        // Print the specifications of the project
        printSpecifications();

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Array to store the quiz grades
        int[] grades = new int[10];
        // Variable to keep track of the number of grades entered
        int count = 0;
        // Variable to keep the sum of grades for calculating the average
        int total = 0;

        // Loop to input grades until 10 grades are entered or 999 is entered to quit
        while (count < 10) {
            System.out.print("Enter quiz grade (999 to quit): ");
            // Read the grade from the console
            int grade = scanner.nextInt();
            // Check if the user entered 999 to quit
            if (grade == 999) {
                break;
            }
            // Store the grade in the array
            grades[count] = grade;
            // Add the grade to the total
            total += grade;
            // Increment the count of grades entered
            count++;
        }

        // Print all the grades entered
        System.out.println("Grades entered:");
        for (int i = 0; i < count; i++) {
            System.out.println(grades[i]);
        }

        // Calculate the average grade
        double average = (double) total / count;
        System.out.println("Average grade: " + average);

        // Determine the letter grade based on the average
        char letterGrade;
        if (average >= 90) {
            letterGrade = 'A';
        } else if (average >= 80) {
            letterGrade = 'B';
        } else if (average >= 70) {
            letterGrade = 'C';
        } else if (average >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        // Print the letter grade
        System.out.println("Letter grade: " + letterGrade);

        // Close the scanner
        scanner.close();
    }

    // Method to print the project specifications
    public static void printSpecifications() {
        System.out.println("Project Specifications: ");
        System.out.println("1. Input quiz grades.");
        System.out.println("2. Use a loop to continue entering grades until 999 is entered.");
        System.out.println("3. Populate an array with quiz grades.");
        System.out.println("4. End loop after 10 grades or when 999 is entered.");
        System.out.println("5. Print all grades in the array.");
        System.out.println("6. Compute the average quiz grade.");
        System.out.println("7. Determine letter grade based on the average.");
    }
}
