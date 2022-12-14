import java.util.*;

/*
Hi wordmaster!

Enter the word to be guessed: banana
Enter how many clues to provide: 3
Enter clue #1: yellow
Enter clue #2: long
Enter clue #3: monkey

-------GUESSING STARTS NOW-------
<->Here are your clues!<->

1.) yellow
2.) long
3.) monkey

You have 3 tries left!
Enter your answer: mango
WRONG!
You have 2 tries left!
Enter your answer: apple
WRONG!
You have 1 tries left!
Enter your answer: saging
WRONG!
You have 0 tries left!

Would you like to try again?[y/n]: 
y

You have 3 tries left!
Enter your answer: banana

CORRECT! The word being asked is banana!
 YOU WON THE GAME!
*/

public class arraylist_and_method_wordguess_GAME {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner n = new Scanner(System.in);

        System.out.println("Hi wordmaster!\n");

        System.out.print("Enter the word to be guessed: ");
        String guess = s.next();

        System.out.print("Enter how many clues to provide: ");
        int clues = n.nextInt();

        // check if clues is <=0
        hi(guess, clues);
        // input and storing/printing the array data
        array(clues);
        // guessing start here and ask if you want to try again
        ask(guess);

    }

    // ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    // check if clues is <=0
    static void hi(String word, int clues) {

        if (clues <= 0) {
            System.out.println("Invalid input");
            System.exit(0);
        }

    }

    // input and storing/printing the array data--------------------------------------------------------------------------------------------------------------------------------------------------
    static void array(int clues) {
        ArrayList<String> clueStrings = new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        // store array
        String cluString = "";
        for (int i = 0; i < clues; i++) {
            System.out.print("Enter clue #" + (i + 1) + ": ");
            cluString = s.next();
            clueStrings.add(cluString);

        }
        System.out.println("-------GUESSING STARTS NOW-------");

        System.out.println("<->Here are your clues!<->");

        // print stored array
        for (int i = 0; i < clues; i++){
            System.out.println((i+1)+".) "+clueStrings.get(i));
        }
        

    }

    // guessing start here and ask if you want to try again--------------------------------------------------------------------------------------------------------------------------------------------------
    static void ask(String guess) {
        Scanner s = new Scanner(System.in);
        String ask = "y";
        int atemp = 3;
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
