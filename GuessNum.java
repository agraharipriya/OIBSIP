import java.util.Random;
import java.util.Scanner;

public class GuessNum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int numberOfAttempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I've selected a random number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("Try to guess it!");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfAttempts++;

            if (userGuess < lowerBound || userGuess > upperBound) {
                System.out.println("Please guess within the valid range (" + lowerBound + " to " + upperBound + ").");
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number " + numberToGuess + " correctly.");
                System.out.println("Number of attempts: " + numberOfAttempts);
                hasGuessedCorrectly = true;
            }
        }

        scanner.close();
    }
}
