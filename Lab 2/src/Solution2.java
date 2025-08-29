
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        int temp = scanner.nextInt();

        if (temp < 0) {
            System.out.println("FREEZING");
        } else if (temp <= 15) {
            System.out.println("COLD");
        } else if (temp <= 30) {
            System.out.println("WARM");
        } else if (temp <= 40) {
            System.out.println("HOT");
        } else {
            System.out.println("VERY HOT");
        }

        scanner.close();
    }
}
