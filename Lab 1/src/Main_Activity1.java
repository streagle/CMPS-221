import java.util.Scanner;

public class Main_Activity1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks (1-100): ");
        int marks = scanner.nextInt();

        String grade = Activity1_Solution1.getGrade(marks);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}


