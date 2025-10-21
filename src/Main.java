import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int die1 = 0;
        int die2 = 0;
        int sum = 0;

        String playAgainResponse = "y";

        do {
            die1 = rand.nextInt(1, 7);
            die2 = rand.nextInt(1, 7);
            sum = die1 + die2;
            System.out.println("You rolled a " + die1 + " and a " + die2 + ". The sum is " + sum);

            if (sum == 7 || sum == 11) {
                System.out.println("You Win!");
            } else if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("You Crapped!");
            } else {
                System.out.println("You rolled a point.");
                int point = sum;
                System.out.println("You rolled point " + point + " You need to roll again to match it");

                boolean keepRolling = true;
                 while (keepRolling) {
                     die1 = rand.nextInt(1, 7);
                     die2 = rand.nextInt(1, 7);
                      int newSum = die1 + die2;

                     System.out.println("...Roll: " + die1 + " + " + die2 + " = " + newSum);

                     if (newSum == point) {
                         System.out.println("You win!");
                         keepRolling = false;
                     } else if (newSum == 7) {
                         System.out.println("You lose!");
                         keepRolling = false;
                     }




                 }



            }

            System.out.print("Do you want to play again? [Y/N]: ");
            playAgainResponse = scanner.next();

            while (!playAgainResponse.equalsIgnoreCase("Y") && !playAgainResponse.equalsIgnoreCase("N"))
            {
                System.out.println("That is not a valid input please try again!");
                System.out.print("Do you want to play again? [Y/N]: ");
                playAgainResponse = scanner.next();
            }

        } while (playAgainResponse.equalsIgnoreCase("Y") );

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}