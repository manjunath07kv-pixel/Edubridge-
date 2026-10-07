class Student {
    String name;
    int age;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println();
    }

    public static void main(String[] args) {

        
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

    
        s1.name = "Mahesh";
        s1.age = 18;
        s1.marks = 85;

        s2.name = "Rahul";
        s2.age = 19;
        s2.marks = 90;

        s3.name = "Ramesh";
        s3.age = 18;
        s3.marks = 78;


        s1.display();
        s2.display();
        s3.display();
    }
}