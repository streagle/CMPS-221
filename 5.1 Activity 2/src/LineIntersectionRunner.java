// LineIntersectionRunner.java
import java.util.Scanner;

public class LineIntersectionRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for first line
        System.out.print("Enter slope (m1) of first line: ");
        double m1 = scanner.nextDouble();
        System.out.print("Enter y-intercept (b1) of first line: ");
        double b1 = scanner.nextDouble();
        LineIntersection line1 = new LineIntersection(m1, b1);

        // Input for second line
        System.out.print("Enter slope (m2) of second line: ");
        double m2 = scanner.nextDouble();
        System.out.print("Enter y-intercept (b2) of second line: ");
        double b2 = scanner.nextDouble();
        LineIntersection line2 = new LineIntersection(m2, b2);

        // Compute intersection
        double[] intersection = line1.getIntersection(line2);

        if (intersection == null) {
            System.out.println("The lines are parallel and do not intersect.");
        } else {
            System.out.printf("The lines intersect at (%.2f, %.2f)%n", intersection[0], intersection[1]);
        }

        scanner.close();
    }
}
