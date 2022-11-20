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

    }

}