import java.util.Scanner;
import java.lang.Math;

public class Task4 {
    static void main() {
        //vars
        Scanner scan = new Scanner(System.in);
        int userGuess = 0;
        boolean userGuessGood = false;
        int numberOfTickets = (int)((Math.random() * (16)) + 20);
        /* 16 is our range, the amount of numbers from 20-35 inclusive. Multiplying Math.random by 16 generates a number from 0 to 16 (includes 0 but not 16).
        (int) casts the random number from to an int from 0-15, removing all decimal numbers.
        Adding 20 turns our number range from [0, 16) to [0,35)
        */

        //input for the user's guess
        do {
            System.out.println("Enter a guess for the amount of tickets sold from 20-35.");
            if (!scan.hasNextInt()) {
                System.out.println("You entered a string or a decimal. Please try again.");
            } else {
                userGuess = scan.nextInt();
                if (userGuess < 20 || userGuess > 35) {
                    System.out.println("You entered a number that was outside the range of 20-35. Please try again.");
                } else {
                    userGuessGood = true;
                }
            }
            scan.nextLine(); //clears the scanner to prevent infinite loops or asking twice
        } while (!userGuessGood);

        //calculates if the user's guess was too high, too low, or just right
        if (userGuess > numberOfTickets) {
            System.out.println("The count was " + numberOfTickets + " tickets sold. Your estimate of " + userGuess + " was too high.");
        }
        else if (userGuess < numberOfTickets) {
            System.out.println("The count was " + numberOfTickets + " tickets sold. Your estimate of " + userGuess + " was too low.");
        }
        else {
            System.out.println("The count was " + numberOfTickets + " tickets sold. Your estimate was perfect!");
        }
    }
}