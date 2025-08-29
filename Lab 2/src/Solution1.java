// Activity 2 - Solution 2: Using switch-case with ranges
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        int temp = scanner.nextInt();

        String message;

        switch (temp / 10) {
            case -10: case -9: case -8: case -7: case -6: case -5: case -4: case -3: case -2: case -1: case 0:
                // This includes all negatives and 0–9
                message = (temp < 0) ? "FREEZING" : "COLD";
                break;
            case 1:
                message = "COLD";
                break;
            case 2:
                message = "WARM";
                break;
            case 3:
                if (temp <= 30) message = "WARM";
                else message = "HOT";
                break;
            case 4:
                if (temp <= 40) message = "HOT";
                else message = "VERY HOT";
                break;
            default:
                if (temp > 40) message = "VERY HOT";
                else message = "FREEZING";
        }

        System.out.println(message);
        scanner.close();
    }
}
