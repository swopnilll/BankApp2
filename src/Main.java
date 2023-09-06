import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char value;

        Account myAcc = new Account(1000);

        System.out.println("Welcome to sydney international Bank");

        System.out.println("Start banking (d/w/s/x):");

        float amount;


        do {

            value = sc.next().charAt(0);

            switch (value) {
                case 'd' -> {
                    System.out.println("Enter the amount you want to deposit");
                    amount = sc.nextFloat();
                    myAcc.deposit(amount);

                    System.out.println("Amount deposited " +myAcc.getBalance());
                }
                case 'w' -> {
                    System.out.println("Enter the amount you want to withdraw");

                    myAcc.withdraw(sc.nextFloat());

                    System.out.println("Amount withdrawn " +sc.nextFloat());
                }
                case 's' -> {
                    System.out.println("Starting balance: $ " +myAcc.getBalance());
                }
            }

            System.out.println("Continue banking (d/w/s/x):");

        } while (value != 'x');

        System.out.println("Thank you for using our service");
    }
}