
import java.util.Scanner;

public class Activity1_Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks (1-100): ");
        int marks = scanner.nextInt();

        String grade;


        switch (marks / 10) {
            case 10:
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            case 5:
                grade = "E";
                break;
            default:
                grade = "F";
        }

        if (marks >= 0 && marks <= 100) {
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid marks entered!");
        }

        scanner.close();
    }
}
