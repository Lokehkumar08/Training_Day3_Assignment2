package day333;
import java.util.Scanner;

public class HeadsOrTailsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        HeadsOrTails coinToss = new HeadsOrTails();

        
        System.out.print("Guess the coin toss result (Heads/Tails): ");
        String userGuess = sc.nextLine().trim().toLowerCase();

        
        String tossResult = coinToss.getHeadsOrTails().toLowerCase();

        
        if (userGuess.equals(tossResult)) {
            System.out.println("You guessed correctly! It's " + tossResult + ". You win!");
        } else {
            System.out.println("You guessed incorrectly. The result was " + tossResult + ". You lose.");
        }

        sc.close();
    }
}

