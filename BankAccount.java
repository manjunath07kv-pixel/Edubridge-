public class BankAccount {

    private String accountNumber;
    private double balance;
    static int accountCount = 0;
    final int accountId;

    BankAccount(String accountNumber , double balance){
        if(balance < 0){
            throw new IllegalArgumentException("Initial balance cannot be negative:");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        accountCount++;
        accountId = accountCount;
    }
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
        } else {
            balance = balance + amount;

            System.out.println("Deposited:" + amount);
        }
    }
        public void withdrew ( double amount) {
            if (amount <= 0) {
                System.out.println("Invalid withdrew amount");
            } else if (amount > balance) {
                System.out.println("Insufficient balance");
            }else{
                balance = balance - amount;
                System.out.println("withdrew:" + amount);
            }
        }

        public double getBalance () {
            return balance;
        }
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("12333421", 5000);
        BankAccount b2 = new BankAccount("9898989", 3000);
        System.out.println("Account ID:" + b1.accountId);
        b1.deposit(2000);
        b2.withdrew(1000);
        System.out.println("Current Balance:" + b1.getBalance());
        b1.withdrew(10000);
        System.out.println("Total Acounts:" + BankAccount.accountCount);
    }

}
