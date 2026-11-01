class Payment {
    double calculateAmount(double amount){
        return amount;
    }
    double calculateAmount(double amount,double discount){
        return amount -(amount*discount/100);
    }
}
class CardPayment extends Payment{
    @Override
    double calculateAmount(double amount) {
        double fee = amount * 0.02;
        return amount + fee;
    }
}
class UPIPayment extends Payment{
    @Override
    double calculateAmount(double amount) {
            double fee = amount * 0.01;
            return amount + fee;
    }
}
public class PaymentTest{
    public static void main(String[] args){
        Payment p;
        p = new CardPayment();
        System.out.println("Card Payment:");
        System.out.println("Total Amount:" +p.calculateAmount(1000));

        p = new UPIPayment();
        System.out.println("\nUPI Payments");
        System.out.println("Total Amount:" +p.calculateAmount(1000));
        Payment Payment = new Payment();
        System.out.println("Amount after discount:"+ Payment.calculateAmount(1000,10));
    }
}
