
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
        /*
        Problem 1 Description

Hello! My name is Daisy and I work for Philippine Airlines. As our gift for passengers who frequently fly with us, we’ve decided to pick someone who flew with us the most in the last few months or so. In order to do that, we need to be able to identify that person among all of the other frequent flyers. Your job would be to create a program that would print out the most frequent number that pops up in the system. If there is more than one most frequent number, print the larger one. (Assume that the values of the integers are in the range of 1 – 100).

Input

1. The number of frequent flyers

Constraints

The value is guaranteed to be > 0.

2. The frequent flyers ​

Constraints

Each frequent flyer number is within the range: <= 100 and >= 1

 

Test Case:



Enter the number of frequent flyers: 5

Enter the frequent flyers: 1 1 5 8 9

Most frequent = 1
        */
    }

}
