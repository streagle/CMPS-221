public class PercentageMarks {
    private float totalMarksSwen311, totalMarksSwen411, totalMarksSwen431, totalMarksCmpsc221;
    private float obtainedMarksSweng311, obtainedMarksSweng411, obtainedMarksSweng431, obtainedMarksCmpsc221;
    private float totalMarks, obtainedMarks, percentageMarks;

    public PercentageMarks(float totalSweng311, float obtainedSweng311,
                           float totalSweng411, float obtainedSweng411,
                           float totalSweng431, float obtainedSweng431,
                           float totalCmpsc221, float obtainedCmpsc221) {
        setValues(totalSweng311, obtainedSweng311, totalSweng411, obtainedSweng411,
                totalSweng431, obtainedSweng431, totalCmpsc221, obtainedCmpsc221);
    }

    public void setValues(float totalSweng311, float obtainedSweng311,
                          float totalSweng411, float obtainedSweng411,
                          float totalSweng431, float obtainedSweng431,
                          float totalCmpsc221, float obtainedCmpsc221) {

        // Validate marks range (1-100)
        validateMarks(totalSweng311, "Total marks for SWENG311");
        validateMarks(obtainedSweng311, "Obtained marks for SWENG311");
        validateMarks(totalSweng411, "Total marks for SWENG411");
        validateMarks(obtainedSweng411, "Obtained marks for SWENG411");
        validateMarks(totalSweng431, "Total marks for SWENG431");
        validateMarks(obtainedSweng431, "Obtained marks for SWENG431");
        validateMarks(totalCmpsc221, "Total marks for CMPSC221");
        validateMarks(obtainedCmpsc221, "Obtained marks for CMPSC221");

        // Validate obtained <= total
        validateObtainedVsTotal(obtainedSweng311, totalSweng311, "SWENG311");
        validateObtainedVsTotal(obtainedSweng411, totalSweng411, "SWENG411");
        validateObtainedVsTotal(obtainedSweng431, totalSweng431, "SWENG431");
        validateObtainedVsTotal(obtainedCmpsc221, totalCmpsc221, "CMPSC221");

        this.totalMarksSwen311 = totalSweng311;
        this.totalMarksSwen411 = totalSweng411;
        this.totalMarksSwen431 = totalSweng431;
        this.totalMarksCmpsc221 = totalCmpsc221;

        this.obtainedMarksSweng311 = obtainedSweng311;
        this.obtainedMarksSweng411 = obtainedSweng411;
        this.obtainedMarksSweng431 = obtainedSweng431;
        this.obtainedMarksCmpsc221 = obtainedCmpsc221;
    }

    private void validateMarks(float marks, String fieldName) {
        if (marks < 1 || marks > 100) {
            throw new IllegalArgumentException(fieldName + " must be between 1 and 100");
        }
    }

    private void validateObtainedVsTotal(float obtained, float total, String courseName) {
        if (obtained > total) {
            throw new IllegalArgumentException("Obtained marks cannot exceed total marks for " + courseName);
        }
    }

    public void getValues() {
        System.out.println("Total marks of Sweng 311: " + this.totalMarksSwen311);
        System.out.println("Obtained marks of Sweng 311: " + this.obtainedMarksSweng311);
        System.out.println("Total marks of Sweng 411: " + this.totalMarksSwen411);
        System.out.println("Obtained marks of Sweng 411: " + this.obtainedMarksSweng411);
        System.out.println("Total marks of Sweng 431: " + this.totalMarksSwen431);
        System.out.println("Obtained marks of Sweng 431: " + this.obtainedMarksSweng431);
        System.out.println("Total marks of CMPSC 221: " + this.totalMarksCmpsc221);
        System.out.println("Obtained marks of CMPSC 221: " + this.obtainedMarksCmpsc221);
    }

    public void computePercentage() {
        this.totalMarks = this.totalMarksSwen311 + this.totalMarksSwen411 +
                this.totalMarksSwen431 + this.totalMarksCmpsc221;
        this.obtainedMarks = this.obtainedMarksSweng311 + this.obtainedMarksSweng411 +
                this.obtainedMarksSweng431 + this.obtainedMarksCmpsc221;
        this.percentageMarks = (this.obtainedMarks / this.totalMarks) * 100;
    }

    public void getPercentageMarks() {
        System.out.println("Total Marks: " + this.totalMarks);
        System.out.println("Total Obtained Marks: " + this.obtainedMarks);
        System.out.println("Percentage Marks: " + this.percentageMarks + "%");
    }

    public float getPercentage() {
        return this.percentageMarks;
    }

    public float getTotalObtainedMarks() {
        return this.obtainedMarks;
    }

    // Static method to compare two students and return the highest percentage
    public static PercentageMarks compareStudents(PercentageMarks student1, PercentageMarks student2) {
        if (student1.getPercentage() > student2.getPercentage()) {
            return student1;
        } else if (student2.getPercentage() > student1.getPercentage()) {
            return student2;
        } else {
            return null; // Equal percentages
        }
    }
}