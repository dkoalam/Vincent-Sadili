import java.util.*;

public class ATM_loop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        int balance = 1000;
        String menu = "y";
        while (menu.equalsIgnoreCase("y")) {
            System.out.print("Enter PIN: ");
            int pin = s.nextInt();
            int i = 1;
            int atemp = 2;
            while (pin != 123456 && i <= atemp) {
                System.out.println("Wrong pin!try again.");
                System.out.print("Enter PIN: ");
                pin = s.nextInt();
                i++;
            }


            if (pin == 123456) {

                System.out.println("Please choose transaction: ");
                System.out.println("[W]-Withdraw");
                System.out.println("[D]-Deposit");
                System.out.println("[C]-Check balance");
                System.out.println("[B]-Bank Transfer");

                System.out.print("Enter here: ");
                String enter = s1.next();
                while (!enter.equalsIgnoreCase("w") && !enter.equalsIgnoreCase("d") && !enter.equalsIgnoreCase("b")
                        && !enter.equalsIgnoreCase("c")) {
                    System.out.println("Please type what is in the choices");
                    System.out.print("Enter here: ");
                    enter = s1.next();

                }

                if (enter.equalsIgnoreCase("W")) {

                    System.out.print("How much would you like to withdraw: ");
                    int withdraw = s1.nextInt();
                    while(withdraw<100){
                        System.out.println("Withdraw greater than 99.");
                        System.out.print("How much would you like to withdraw: ");
                         withdraw = s1.nextInt();   
                    }
                    if (withdraw < balance) {
                        int remaining_balance = balance - withdraw;

                        System.out.println("Your remaining balance is: " + remaining_balance);
                        System.out.println("You'll get " + withdraw + " pesos.");
                        System.out.println("Thank you for banking with us!");
                    } else {
                        System.out.println("Insufficient Fund");
                    }

                } else if (enter.equalsIgnoreCase("d")) {

                    System.out.print("How much would you like to deposit: ");
                    int deposit = s1.nextInt();
                    while(deposit<100){
                        System.out.println("Deposit greater than 99.");
                        System.out.print("How much would you like to deposit: ");
                         deposit = s1.nextInt();  
                    }

                    int deposit_balance = balance + deposit;

                    System.out.println("Your remaining balance is: " + deposit_balance);
                    System.out.println("Thank you for banking with us!");

                } else if (enter.equalsIgnoreCase("c")) {

                    System.out.println("Your remaining balance is: " + balance);
                    System.out.println("Thank you for banking with us!");

                } else if (enter.equalsIgnoreCase("b")) {
                    System.out.println("Account Number:");
                    int num = s1.nextInt();

                    System.out.println("Account Name:");
                    String name = s.next();

                    System.out.println("Amount to transfer: ");
                    int tran = s1.nextInt();

                    int transfer_balance = balance - tran;

                    System.out.println("Balance: "+transfer_balance);

                } else {
                    System.out.println("please type what is in the choices");
                }

            }else{
                System.exit(0);
            }
            System.out.print("Do you want another transaction[y/n]: ");
            menu=s.next();
        }

    }
}
