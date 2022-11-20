import java.util.Scanner;

public class wordguess_GAME {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        System.out.println("Hi wordmaster!");

        System.out.print("Enter the word to be guessed: ");
        String guess = s.next();

        System.out.print("Enter how many clues to provide: ");
        int clues = n.nextInt();
        if (clues <= 0) {
            System.out.println("Invalid input");
            System.exit(0);
        }

        String cluString[] = new String[clues];

        // store array
        for (int i = 0; i < clues; i++) {
            System.out.print("Enter clue #" + (i + 1) + ": ");
            cluString[i] = s.next();

        }
        System.out.println("GUESSING STARTS NOW");
        int atemp = 3;
        System.out.println("Here are your clues!");

        // print stored array
        for (int i = 0; i < clues; i++) {
            System.out.println((i + 1) + ")" + cluString[i]);
        }
        // while ask is y repeat
        String ask = "y";
        while (ask.equalsIgnoreCase("y")) {
            System.out.println("You have " + atemp + " tries left!");
            String word = "";
            int i = 1;

            while (!guess.equalsIgnoreCase(word) && i <= atemp) {
                System.out.print("Enter your answer: ");
                word = s.next();
                if (!guess.equalsIgnoreCase(word)) {

                    System.out.println("WRONG!");
                    System.out.println("You have " + (atemp - i) + " tries left!");
                } else {

                    System.out.println("CORRECT! The word being asked is " + guess + "!");
                    System.out.println(" YOU WON THE GAME!");
                    System.exit(0);

                }
                i++;

            }
            System.out.println("Would you like to try again?[y/n]: ");
            ask = s.next();
        }
/*
Create a guessing game, user must first enter a word to guess. Then the user will be asked to enter how many clues does he want to provide to the user. The game starts and the user must guess the word being referred to by the clues. The user can win the game by guessing the word, if the user fails then he’ll only have 3 attempts to guess the word. If the game ends and the user wasn’t able to guess the word he has a choice to continue guessing or to not continue.

Sample Output:

Hi wordmaster!

Enter the word to be guessed: banana(inputted)

Enter how many clues to provide: 3(inputted)

Enter clue #1: It’s yellow. (inputted)

Enter clue #2: It’s a fruit. (inputted)

Enter clue #3: Monkeys Love to eat it. (inputted)

------------------------------------

GUESSING STARTS NOW

______________________

Here are your clues!

1.) It’s yellow.

2.) It’s a fruit.

3.) Monkeys Love to eat it.

You have 3 tries left!

Enter your answer: apple(inputted)

WRONG!

You have 2 tries left!

Enter your answer: grapes(inputted)

WRONG!

You have 1 tries left!

Enter your answer: banana(inputted)

CORRECT! The word being asked is banana!

YOU WON THE GAME!

// if you are wrong and run out of tries.

You have 1 tries left!

Enter your answer: coffee(inputted)

WRONG!

You have 0 tries left!

Would you like to try again?[y/n]: yes..

// if the player runs out of tries its game over display GAME OVER and ask if he would like to try again. Reset the number of tries to 3 if the user enters yes and if the user enters no, simply end the program
*/
    }

}
