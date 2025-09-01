import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks (1-100): ");
        int marks = scanner.nextInt();

        String grade = Solution1.getGrade(marks);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}


