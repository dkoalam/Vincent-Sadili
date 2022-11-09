import java.util.*;
public class ATM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        int balance = 1000;
        System.out.print("Enter PIN: ");
        int pin = s.nextInt();

        if (pin == 123456) {

            System.out.println("Please choose transaction: ");
            System.out.println("[W]-Withdraw");
            System.out.println("[D]-Deposit");
            System.out.println("[C]-Check balance");

            System.out.print("Enter here: ");
            String enter = s1.next();

            if (enter.equalsIgnoreCase("W")) {

                System.out.print("How much would you like to withdraw: ");
                int withdraw = s1.nextInt();
                if (withdraw < balance) {
                    int remaining_balance = balance - withdraw;

                    System.out.println("Your remaining balance is: " + remaining_balance);
                    System.out.println("You'll get " + withdraw + " pesos.");
                    System.out.println("Thank you for banking with us!");
                } else {
                    System.out.println("Insuffcient Fund");
                }

            } else if (enter.equalsIgnoreCase("d")) {

                System.out.print("How much would you like to deposit: ");
                int deposit = s1.nextInt();

                int deposit_balance = balance + deposit;

                System.out.println("Your remaining balance is: " + deposit_balance);
                System.out.println("Thank you for banking with us!");

            } else if (enter.equalsIgnoreCase("c")) {

                System.out.println("Your remaining balance is: " + balance);
                System.out.println("Thank you for banking with us!");

            } else {
                System.out.println("please type what is in the choices");
            }

        } else {
            System.out.println("Incorrect PIN");
        }
        /*
Create a program that will process a basic transaction of an ATM. The program must have a withdrawal, deposit, and checking of balance. The default PIN is “123456”, the default cash on account is: 1000. One transaction per execution of program to test. The program must test if the PIN is correct, it also check if the amount to withdraw is less than or equal to the current cash on account. You can create your own message per test cases like: “Insufficient Fund”, “Incorrect PIN” etc.

Sample Output for Withdraw:

Enter PIN: 123456

Please choose transaction:

[W] – Withdraw

[D] – Deposit

[C] – Check balance

Enter here: W

How much would you like to withdraw: 500

Your remaining balance is: 500

You’ll get 500 pesos.

Thank you for banking with us!

----------------------------- end of program ---------------------------

Sample Output for Deposit:

Enter PIN: 123456

Please choose transaction:

[W] – Withdraw

[D] – Deposit

[C] – Check balance

Enter here: D

How much would you like to deposit: 500

Your remaining balance is: 1500

Thank you for banking with us!

----------------------------- end of program ----------------------------

Sample Output for Check balance:

Enter PIN: 123456

Please choose transaction:

[W] – Withdraw

[D] – Deposit

[C] – Check balance

Enter here: C

Your remaining balance is: 1000

Thank you for banking with us!

---------------------------- end of program -------------------------------
        */
    }
}
