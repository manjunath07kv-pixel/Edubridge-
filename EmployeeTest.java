 class Employee {
    int employeeID;
    String name;
    double basicSalary;

    Employee(int employeeID,String name,double basicSalary){
        this.employeeID = employeeID;
        this.name = name;
        this.basicSalary = basicSalary;
    }
    double calculateSalary(){
        return basicSalary;
    }
    void displayDetails(){
        System.out.println("Employee ID:" +employeeID);
        System.out.println("Name: "+ name);
        System.out.println("Basic Salary :" + basicSalary);
    }
}
class permanentEmployee extends Employee{
    double allowance;
    double bouns;

    permanentEmployee(int id,String name,double salary,double allowance,double bouns){
        super(id,name,salary);
        this.allowance = allowance;
        this.bouns = bouns;
    }
    double calculateSalary(){
        return basicSalary + allowance + bouns;
    }
    void display(){
        displayDetails();
        System.out.println("Allowance:" +allowance);
        System.out.println("Bouns:" +bouns);
        System.out.println("Total Salary:" +calculateSalary());
    }
}
class ContractEmployee extends Employee{
    int hoursWorked;
    double hourlyRate;
    ContractEmployee(int id,String name,double salary,int hoursWorked,double hourlyRate){
        super(id,name,salary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    double calculateSalary(){
        return hoursWorked * hourlyRate;
    }
    void display(){
        displayDetails();

        System.out.println("Hours Worked :" +hoursWorked);
        System.out.println("Hourly Rate:" +hourlyRate);
        System.out.println("Total salary :" +calculateSalary());
    }
}
public class EmployeeTest{
    public static void main(String[] args){
        permanentEmployee p1 = new permanentEmployee(101,"Mahesh",30000,5000,3000);
        ContractEmployee c1 = new ContractEmployee(102,"Ramesh",0,150,300);

        System.out.println("Peramenent Employee Details:");
        p1.display();
        System.out.println();

        System.out.println("Comtract Employee Deatils:");
        c1.display();
        Employee[] employees = {p1, c1 };
        System.out.println("\nSalary Summary:");
        for( Employee e : employees){
            System.out.println(e.name +" Salary" + e.calculateSalary());
        }

    }
}
