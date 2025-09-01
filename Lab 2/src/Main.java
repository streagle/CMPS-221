import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Temperature in centigrade: ");
        int temp = scanner.nextInt();

        // Call method from StudentGrade class
        String Message = Solution2.getMessage(temp);
        System.out.println("Weather is: " + Message);

        scanner.close();
    }
}