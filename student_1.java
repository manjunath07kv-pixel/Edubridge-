
class Student_1 {

    final int MAX_MARKS = 100;

    private String usn;
    private String name;
    private int mark1, mark2, mark3;

    static int student1count = 0;


    Student_1(String usn, String name, int m1, int m2, int m3) {
        this.usn = usn;
        this.name = name;

        setmarks(m1, m2, m3);
        student1count++;
    }

    void setmarks(int m1, int m2, int m3) {
        if (m1 >= 0 && m1 <= MAX_MARKS &&
                m2 >= 0 && m2 <= MAX_MARKS &&
                m3 >= 0 && m3 <= MAX_MARKS) {

            mark1 = m1;
            mark2 = m2;
            mark3 = m3;
        } else {
            throw new IllegalArgumentException(
                    "Marks must be between 0 to 100");
        }
    }


    String getUsn() {
        return usn;
    }

    String getName() {
        return name;
    }

    int getMark1() {
        return mark1;
    }

    int getMark2() {
        return mark2;
    }

    int getMark3() {
        return mark3;
    }

    int calculateTotal() {
        return mark1 + mark2 + mark3;
    }

    double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
    }

    void display(boolean result) {
        display();

        System.out.println("Marks: " + mark1 + ", "
                + mark2 + ", " + mark3);
        System.out.println("Total: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
    }


    public static void main(String[] args) {

        Student_1 s1 = new Student_1(
                "1AJ25CY026", "Mahesh R", 90, 95, 97);

        Student_1 s2 = new Student_1(
                "1AJ25CY027", "Manjunatha", 78, 67, 90);

        System.out.println("Student 1 Details:");
        s1.display();

        System.out.println("\nStudent 1 Result:");
        s1.display(true);

        System.out.println("\nStudent 2 Details:");
        s2.display();

        System.out.println("\nStudent 2 Result:");
        s2.display(true);

        System.out.println("\nResult Summary");
        System.out.println("Student 1 Total: "
                + s1.calculateTotal());

        System.out.println("Total Students: "
                + Student_1.student1count);
    }
}
