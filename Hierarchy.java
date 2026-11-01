
class Person_1 {
    private String name;
    private int age;

    static int count = 0;

    final String collegeName = "Cambridge Institute of Technology";

    Person_1(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + collegeName);
    }

    // Method overloading
    void displayDetails(String role) {
        System.out.println("Role: " + role);
    }
}

class Student extends Person_1 {
    private int rollNo;
    private String course;

    Student(String name, int age, int rollNo, String course) {
        super(name, age);
        this.rollNo = rollNo;
        this.course = course;
    }

    @Override
    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        super.displayDetails();
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Course: " + course);
    }
}

class Faculty extends Person_1 {
    private String subject;
    private double salary;

    Faculty(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    void displayDetails() {
        System.out.println("\n--- Faculty Details ---");
        super.displayDetails();
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}

class Administrator extends Person_1 {
    private String department;
    private String designation;

    Administrator(String name, int age, String department,
                  String designation) {
        super(name, age);
        this.department = department;
        this.designation = designation;
    }

    @Override
    void displayDetails() {
        System.out.println("\n--- Administrator Details ---");
        super.displayDetails();
        System.out.println("Department: " + department);
        System.out.println("Designation: " + designation);
    }
}

class College {
    static class Department {
        void showDepartment() {
            System.out.println("\nDepartment: Computer Science");
        }
    }
}

public class Hierarchy {
    public static void main(String[] args) {

        Person_1[] people = new Person_1[3];

        people[0] = new Student(
                "Mahesh", 19, 101, "Cyber Security"
        );

        people[1] = new Faculty(
                "Ramesh", 40, "Java Programming", 50000
        );

        people[2] = new Administrator(
                "Suresh", 45, "Administration", "Manager"
        );

        // Runtime polymorphism
        for (Person_1 p : people) {
            p.displayDetails();
        }

        // Method overloading
        people[0].displayDetails("Student");

        // Nested class
        College.Department d = new College.Department();
        d.showDepartment();

        // Static variable
        System.out.println("\nTotal People Created: " + Person_1.count);
    }
}
