import java.util.Scanner;

public class Main_Activity2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Temperature in centigrade: ");
        int temp = scanner.nextInt();

        // Call method from StudentGrade class
        String Message = Activity2_Solution2.getMessage(temp);
        System.out.println("Weather is: " + Message);

        scanner.close();
    }
}