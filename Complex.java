public class Complex {

    int real,imag;

    Complex(int r,int i){
        real = r;
        imag = i;
    }
    Complex add(Complex c){
        return new Complex(real+c.real,imag+c.imag);
    }
    Complex multiply(Complex c){
        int r = (real *c.real) - (imag * c.imag);
        int i = (real * c.real) - (imag * c.imag);
        return new Complex(r,i);
    }

    void compereMagnitude(Complex c){
        double m1 = Math.sqrt(real*real + imag*imag);
        double m2 = Math.sqrt(c.real * c.real + c.imag*c.imag);

        if(m1>m2)
            System.out.println("First complex number is larger");
        else
            System.out.println("Both are equal");
    }
    Complex copy(){
        return new Complex(real,imag);
    }

    void display(){
        System.out.println(real + " + " + imag + "i");
    }

    public static void main(String[] args){
        Complex c1 = new Complex(2,3);
        Complex c2 = new Complex(2,5);

        System.out.println("First Complex number:");
        c1.display();

        System.out.println("Second Complex number:");
        c2.display();
        Complex sum = c1.add(c2);

        System.out.println("Addition:");
        sum.display();

        Complex product = c1.multiply(c2);
        System.out.println("Multiplication:");
        product.display();

        c1.compereMagnitude(c2);
        Complex c3 = c1.copy();
        System.out.println("copied object:");
        c3.display();

        c1.real = 10;
        c1.imag = 20;

        System.out.println("Modified Original:");
        c1.display();

        System.out.println("copied object:");
        c3.display();
    }
}
