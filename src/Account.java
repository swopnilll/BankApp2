public class Account {

    private String type;
    private double balance;

    public Account( double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean hasAmount(double amount){
        return !(amount < this.balance);
    }

    public void deposit(double amount){
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount){
        if(this.hasAmount(amount)){
            System.out.println("Insufficient Balance");

            return;
        }

        this.balance = this.balance - amount;
    }

    public void pay(double amount, Account account){
        if(this.hasAmount(this.balance)){
            System.out.println("Insufficient Balance");

            return;
        }

        this.balance = this.balance - amount;

        account.balance = account.balance + amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "type='" + type + '\'' +
                ", balance=" + balance +
                '}';
    }
}