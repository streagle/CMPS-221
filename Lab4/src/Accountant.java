import java.util.Scanner;


public class Accountant {
    // Fields of the class
    private String name;
    private int age;
    private String companyName; 


    public Accountant(String n, int a, String c) {
        name = n;
        age = a;
        companyName = c;
    }


    public void displaySalary() {
        // Compute exponent part
        double exponent = 0.04295 * age + 0.141;
        double salary = 40000 * Math.sqrt(Math.exp(exponent));

        // Display salary with 2 decimal precision
        System.out.printf("Salary: $%.2f\n", salary);
    }


    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Company Name: " + companyName);
    }
}


class MyProg {
    public static void main(String[] args) {
        // Create Scanner object to read user inputs
        Scanner input = new Scanner(System.in);

        // Prompt user for name
        System.out.print("Enter accountant's name: ");
        String name = input.nextLine();

        // Prompt user for age
        System.out.print("Enter accountant's age: ");
        int age = input.nextInt();
        input.nextLine();

        // Prompt user for company name
        System.out.print("Enter company name: ");
        String company = input.nextLine();

        // Instantiate an Accountant object with the inputs
        Accountant acc = new Accountant(name, age, company);

        // Call methods to display info and salary
        acc.displayInfo();
        acc.displaySalary();

        // Close the scanner
        input.close();
    }
}
