
//vaSadili_inf222
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // get input
        System.out.print("Enter the number of frequent flyers: ");
        int numF = s.nextInt();
        if (numF > 0) {
            int flyers[] = new int[numF];
            System.out.print("Enter the frequent flyers: ");
            // Enter the frequent flyers: 1 1 3 4 2 one space between inputs
            int i = 0;
            for (i = 0; i < flyers.length; i++) {
                flyers[i] = s.nextInt();
            }
            int mFrequent = 0;
            int count = 0;
            // get the most frequent
            for (int j = 0; j < flyers.length; j++) {
                int tempFlyers = flyers[j];
                int tempCount = 0;
                if (tempFlyers <= 100 && tempFlyers >= 1) {
                    for (int p = 0; p < flyers.length; p++) {
                        if (flyers[p] == tempFlyers) {
                            tempCount++;
                        }
                    }
                    if (tempCount > count) {
                        mFrequent = tempFlyers;
                        count = tempCount;
                    }

                } else {
                    System.out.println("Invalid input");
                    System.out.println("Each frequent flyer number is within the range: <= 100 and >= 1");
                    System.exit(0);
                }

            }

            System.out.println("Most frequent = " + mFrequent);
        } else {
            System.out.println("Invalid Input");
            System.out.println("The value is guaranteed to be > 0.");
        }
    }

}
