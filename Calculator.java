public class Calculator {
    int calculate(int a,int b){
        return a+b;
    }

    double calculate(double a,double b){
        return a*b;
    }
    int calculate(int a, int b,int c){
        return Math.max(a, Math.max(b,c));
    }

    double calculate(int a , double b){
        return a-b;
    }

    public static void main(String[] args){
        Calculator obj = new Calculator();

        System.out.println("Sum =" +obj.calculate(10,20));
        System.out.println("Product =" +obj.calculate(5.5,3.5));
        System.out.println("Largest =" +obj.calculate(10,20,30));
        System.out.println("Difference = " +obj.calculate(20,2.2));
    }
}
