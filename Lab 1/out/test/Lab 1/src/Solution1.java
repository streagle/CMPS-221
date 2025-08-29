
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks (1-100): ");
        int marks = scanner.nextInt();

        if (marks < 50) {
            System.out.println("Your Grade: F");
        } else if (marks <= 60) {
            System.out.println("Your Grade: E");
        } else if (marks <= 70) {
            System.out.println("Your Grade: D");
        } else if (marks <= 80) {
            System.out.println("Your Grade: C");
        } else if (marks <= 90) {
            System.out.println("Your Grade: B");
        } else if (marks <= 100) {
            System.out.println("Your Grade: A");
        } else {
            System.out.println("Invalid marks entered!");
        }

        scanner.close();
    }
}
