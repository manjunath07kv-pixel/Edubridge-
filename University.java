public class University {
    String universityName;
    String location;

    University(String universityName,String location){
        this.universityName = universityName;
        this.location = location;
    }
    static class Depertment{
        String depertmentname;
        Depertment(String depertmentname){
            this.depertmentname = depertmentname;
        }
        void displayDepertment(){
            System.out.println("Depertment:" +depertmentname);
        }
    }
    class Faculty{
        String facultyName;
        String designation;

        Faculty(String facultyName,String designation){
            this.facultyName = facultyName;
            this.designation = designation;
        }

        private void displayFaclty() {
            System.out.println("Faculty Name:" +facultyName);
            System.out.println("Designation:" + designation);
            System.out.println("University:" +universityName);
        }
    }
    void displayUniversity(){
        System.out.println("University Name:" +universityName);
        System.out.println("Location:" +location);
    }
    public static void main(String[] args){
        University u = new University("Cambridge Insititute of technology North Campus","Banglore");
        University.Depertment d = new University.Depertment("Cyber Security");
        University.Faculty f = u.new Faculty("Mahesh" , "Assistant Professor");

        System.out.println("University Details:");
        u.displayUniversity();
        System.out.println("\nDepertment Details :");
        d.displayDepertment();

        System.out.println("\nFaculty Details ;");
        f.displayFaclty();
    }
}
