// Jean-Luc Madrid
// CSIS 10A (#0941)
// Week 6A Lab B

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class Gradebook {
    public static void main(String[] args) {
        // Declare variables
        int[] studentIDs;
        int[] test1Grades;
        int[] test2Grades;
        int[] test3Grades;
        String[] lastNames;
        PrintWriter result = null;
        Scanner kin = new Scanner(System.in);
        Scanner fin = null;

        // Step 4: Prompt for input file and verify it exists
        String inputFileName;
        while (true) {
            System.out.print("Enter the input file name with extension: ");
            inputFileName = kin.nextLine();
            try {
                fin = new Scanner(new File(inputFileName));
                break;
            } catch (IOException e) {
                System.out.println("File not found. Please try again.");
            }
        }

        // Step 5: Read number of students and initialize arrays
        int numStudents = fin.nextInt();
        studentIDs = new int[numStudents];  // Changed from String to int
        lastNames = new String[numStudents];
        test1Grades = new int[numStudents];
        test2Grades = new int[numStudents];
        test3Grades = new int[numStudents];

        // Step 6: Read student data
        for (int i = 0; i < numStudents; i++) {
            studentIDs[i] = fin.nextInt();
            lastNames[i] = fin.next();
            test1Grades[i] = fin.nextInt();
            test2Grades[i] = fin.nextInt();
            test3Grades[i] = fin.nextInt();
        }

        // Step 7: Calculate and display test averages
        double avg1 = average(test1Grades);
        double avg2 = average(test2Grades);
        double avg3 = average(test3Grades);
        System.out.printf("Class Averages: Test 1: %.2f%%, Test 2: %.2f%%, Test 3: %.2f%%%n", avg1, avg2, avg3);

        // Step 8: Prompt for output file name
        String outputFileName;
        while (true) {
            System.out.print("Enter the output file name with extension: ");
            outputFileName = kin.nextLine();
            File outputFile = new File(outputFileName);
            if (!outputFile.exists()) {
                try {
                    result = new PrintWriter(outputFile);
                    break;
                } catch (IOException e) {
                    System.out.println("Error creating output file. Please try again.");
                }
            } else {
                System.out.println("File already exists. Please choose a different name.");
            }
        }

        // Step 9: Calculate student grades and write to output file
        for (int i = 0; i < numStudents; i++) {
            double overall = (test1Grades[i] + test2Grades[i] + test3Grades[i]) / 3.0;
            result.println(formatGrade(studentIDs[i], lastNames[i], overall));
        }

        // Step 10: Close I/O streams
        fin.close();
        result.close();
        kin.close();
    }

    // Helper method to calculate average
    public static double average(int[] grades) {
        double sum = 0.0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    // Helper method to determine letter grade
    public static String getLetter(double grade) {
        if (grade >= 90.0) {
            return "A";
        } else if (grade >= 80.0) {
            return "B";
        } else if (grade >= 70.0) {
            return "C";
        } else if (grade >= 60.0) {
            return "D";
        } else {
            return "F";
        }
    }

    // Helper method to format output line
    public static String formatGrade(int studentID, String lastName, double overall) {
        String letter = getLetter(overall);
        return String.format("%d %s %.2f%% %s", studentID, lastName, overall, letter);
    }
}