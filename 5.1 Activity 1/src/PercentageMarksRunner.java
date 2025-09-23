import java.util.Scanner;

public class PercentageMarksRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create student1
        System.out.println("=== Enter details for Student 1 ===");
        PercentageMarks student1 = createStudent(input, 1);

        // Create student2
        System.out.println("\n=== Enter details for Student 2 ===");
        PercentageMarks student2 = createStudent(input, 2);

        // Display student details
        System.out.println("\n=== Student 1 Details ===");
        student1.getValues();
        student1.computePercentage();
        student1.getPercentageMarks();

        System.out.println("\n=== Student 2 Details ===");
        student2.getValues();
        student2.computePercentage();
        student2.getPercentageMarks();

        // Compare students and show results
        compareAndDisplayResults(student1, student2);

        // Show total obtained marks for each student
        System.out.println("\n=== Total Obtained Marks ===");
        System.out.println("Student 1 total obtained marks: " + student1.getTotalObtainedMarks());
        System.out.println("Student 2 total obtained marks: " + student2.getTotalObtainedMarks());

        input.close();
    }

    private static PercentageMarks createStudent(Scanner input, int studentNumber) {
        System.out.println("Enter Total marks of Sweng 311 for Student " + studentNumber + ": ");
        float total_sweng311 = getValidMarks(input, "Total marks of Sweng 311");

        System.out.println("Enter Obtained marks of Sweng 311 for Student " + studentNumber + ": ");
        float obtained_sweng311 = getValidObtainedMarks(input, "Obtained marks of Sweng 311", total_sweng311);

        System.out.println("Enter Total marks of Sweng 411 for Student " + studentNumber + ": ");
        float total_sweng411 = getValidMarks(input, "Total marks of Sweng 411");

        System.out.println("Enter Obtained marks of Sweng 411 for Student " + studentNumber + ": ");
        float obtained_sweng411 = getValidObtainedMarks(input, "Obtained marks of Sweng 411", total_sweng411);

        System.out.println("Enter Total marks of Sweng 431 for Student " + studentNumber + ": ");
        float total_sweng431 = getValidMarks(input, "Total marks of Sweng 431");

        System.out.println("Enter Obtained marks of Sweng 431 for Student " + studentNumber + ": ");
        float obtained_sweng431 = getValidObtainedMarks(input, "Obtained marks of Sweng 431", total_sweng431);

        System.out.println("Enter Total marks of CMPSC 221 for Student " + studentNumber + ": ");
        float total_cmpsc221 = getValidMarks(input, "Total marks of CMPSC 221");

        System.out.println("Enter Obtained marks of CMPSC 221 for Student " + studentNumber + ": ");
        float obtained_cmpsc221 = getValidObtainedMarks(input, "Obtained marks of CMPSC 221", total_cmpsc221);

        return new PercentageMarks(total_sweng311, obtained_sweng311,
                total_sweng411, obtained_sweng411,
                total_sweng431, obtained_sweng431,
                total_cmpsc221, obtained_cmpsc221);
    }

    private static float getValidMarks(Scanner input, String fieldName) {
        while (true) {
            try {
                float marks = input.nextFloat();
                if (marks >= 1 && marks <= 100) {
                    return marks;
                } else {
                    System.out.println(fieldName + " must be between 1 and 100. Please re-enter: ");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 and 100: ");
                input.next(); // Clear invalid input
            }
        }
    }

    private static float getValidObtainedMarks(Scanner input, String fieldName, float totalMarks) {
        while (true) {
            try {
                float marks = input.nextFloat();
                if (marks >= 1 && marks <= 100 && marks <= totalMarks) {
                    return marks;
                } else if (marks > totalMarks) {
                    System.out.println("Obtained marks cannot exceed total marks (" + totalMarks + "). Please re-enter: ");
                } else {
                    System.out.println(fieldName + " must be between 1 and 100. Please re-enter: ");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 and " + totalMarks + ": ");
                input.next(); // Clear invalid input
            }
        }
    }

    private static void compareAndDisplayResults(PercentageMarks student1, PercentageMarks student2) {
        PercentageMarks higherScorer = PercentageMarks.compareStudents(student1, student2);

        System.out.println("\n=== Comparison Results ===");
        if (higherScorer == student1) {
            System.out.println("Student 1 has higher percentage: " + student1.getPercentage() + "%");
            System.out.println("Student 2 percentage: " + student2.getPercentage() + "%");
        } else if (higherScorer == student2) {
            System.out.println("Student 2 has higher percentage: " + student2.getPercentage() + "%");
            System.out.println("Student 1 percentage: " + student1.getPercentage() + "%");
        } else {
            System.out.println("Both students have equal percentage: " + student1.getPercentage() + "%");
        }
    }
}