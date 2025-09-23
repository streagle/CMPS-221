// LineIntersection.java
public class LineIntersection {
    private double m; // slope
    private double b; // y-intercept

    // Constructor
    public LineIntersection(double m, double b) {
        this.m = m;
        this.b = b;
    }

    // Getters
    public double getSlope() {
        return m;
    }

    public double getIntercept() {
        return b;
    }

    // Compute intersection with another line
    public double[] getIntersection(LineIntersection other) {
        double x, y;

        // Check if lines are parallel
        if (this.m == other.m) {
            return null; // No intersection (parallel lines)
        }

        // x = (b2 - b1) / (m1 - m2)
        x = (other.b - this.b) / (this.m - other.m);
        y = this.m * x + this.b;

        return new double[]{x, y};
    }
}
