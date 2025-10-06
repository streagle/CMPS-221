import java.util.*;

class PC {
    private String model;
    private String serialNumber;

    public PC(String model, String serialNumber) {
        this.model = model;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return model + " (" + serialNumber + ")";
    }
}

class Office {
    private String roomNumber;

    public Office(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Office " + roomNumber;
    }
}

class Teacher {
    private String name;
    private Office office;
    private List<PC> pcs;

    public Teacher(String name, Office office) {
        this.name = name;
        this.office = office;
        this.pcs = new ArrayList<>();
    }

    public void addPC(PC pc) {
        pcs.add(pc);
    }

    public void showDetails() {
        System.out.println("Teacher: " + name);
        System.out.println("Office: " + office);
        System.out.println("PCs: " + pcs);
    }
}

public class Activity1 {
    public static void main(String[] args) {
        Office office = new Office("B-210");
        Teacher teacher = new Teacher("Dr. Smith", office);

        teacher.addPC(new PC("Dell Optiplex", "PC001"));
        teacher.addPC(new PC("MacBook Pro", "PC002"));

        teacher.showDetails();
    }
}