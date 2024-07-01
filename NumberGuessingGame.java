import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);

    // Here the random class variable takes in an argument that in exclusive, so if we want to have a number between 0-100 we should adjust the range that's why we added 1 to the generating int
    int randomNumber = rand.nextInt(100) + 1;
    int tryCount = 0;
    System.out.println("Enter your guess (1-100):");

    while (true) {
      int playerGuess = scanner.nextInt();
      tryCount++;
      if (playerGuess == randomNumber) {
        System.out.println("Correct! You Won!");
        break;
      } else if (randomNumber > playerGuess) {
        System.out.println("Nope! The number is higher.Guess again.");
      } else {
        System.out.println("Nope! The nuber is lower. Guess again.");
      }
      System.out.println("You guessed in " + tryCount + " counts.");
    }
    scanner.close();
  }
}
