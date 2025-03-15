import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continuePlaying = true;
        int totalWins = 0;

        while (continuePlaying) {
            int targetNumber = random.nextInt(100) + 1; // Generates a number between 1 and 100
            int attempts = 0;
            final int maxTries = 7;
            boolean isCorrect = false;
            
            System.out.println("Try to guess the number between 1 and 100. You have " + maxTries + " attempts.");
            
            while (attempts < maxTries) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                
                if (userGuess == targetNumber) {
                    System.out.println("Great job! You guessed it in " + attempts + " tries.");
                    totalWins++;
                    isCorrect = true;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Your guess is too low. Try again!");
                } else {
                    System.out.println("Your guess is too high. Try again!");
                }
            }
            
            if (!isCorrect) {
                System.out.println("Out of attempts! The correct number was " + targetNumber);
            }
            
            System.out.println("Total rounds won: " + totalWins);
            System.out.print("Would you like to play again? (yes/no): ");
            String playResponse = scanner.next().toLowerCase();
            continuePlaying = playResponse.equals("yes");
        }
        
        System.out.println("Thanks for playing! Final score: " + totalWins);
        scanner.close();
    }
}
