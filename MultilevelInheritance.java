
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class Employee_1 extends Person {
    int employeeId;

    Employee_1(String name, int employeeId) {
        super(name);
        this.employeeId = employeeId;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee_1 {
    String department;

    Manager(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    void displayDepartment() {
        System.out.println("Department: " + department);
    }
}

public class  MultilevelInheritance {
    public static void main(String[] args) {

        Manager m = new Manager("Mahesh", 101, "IT");

        m.displayPerson();
        m.displayEmployee();
        m.displayDepartment();
    }
}
