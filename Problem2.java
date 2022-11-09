
//vaSadili_inf222
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Bills: 1000, 500, 200, 100, 50, 20");
        System.out.println("Coins: 10, 5, 1");

        System.out.print("Enter the amount:");
        double amount1 = s.nextDouble();
        int amount = (int) amount1;

        if (amount > 0) {
            int rem = amount % 1000;
            int countThousands = amount / 1000;
            System.out.println("P1000 bills: " + countThousands);

            // computation
            int remfor500 = rem % 500;
            int count500 = rem / 500;
            System.out.println("P500 bills: " + count500);

            int remfor200 = remfor500 % 200;
            int count200 = remfor500 / 200;
            System.out.println("P200 bills: " + count200);

            int remfor100 = remfor200 % 100;
            int count100 = remfor200 / 100;
            System.out.println("P100 bills: " + count100);

            int remfor50 = remfor100 % 50;
            int count50 = remfor100 / 50;
            System.out.println("P50 bills: " + count50);

            int remfor20 = remfor50 % 20;
            int count20 = remfor50 / 20;
            System.out.println("P20 bills: " + count20);

            int remfor10 = remfor20 % 10;
            int count10 = remfor20 / 10;
            System.out.println("P10 coins: " + count10);

            int remfor5 = remfor10 % 5;
            int count5 = remfor10 / 5;
            System.out.println("P5 coins: " + count5);

            int remfor1 = remfor5 % 1;
            int count1 = remfor5 / 1;
            System.out.println("P1 coins: " + count1);
        } else {
            System.out.println("Invalid input");

        }

    }
}
