import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxAttempts = 10;
        int score = 0;
        int rounds = 3;

        System.out.println("Welcome to the Guess the Number game!");
        
        for (int round = 1; round <= rounds; round++) {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            boolean hasGuessed = false;

            System.out.println("\nRound " + round + " of " + rounds);
            System.out.println("I have picked a number between 1 and 100. Try to guess it!");

            while (attempts < maxAttempts && !hasGuessed) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    score += (maxAttempts - attempts + 1);
                    hasGuessed = true;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }
            }

            if (!hasGuessed) {
                System.out.println("You've used all attempts. The number was: " + numberToGuess);
            }
        }

        System.out.println("\nGame over! Your total score is: " + score);
        scanner.close();
    }
}