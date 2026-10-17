
import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        String playAgain;

        do {
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int sum = die1 + die2;

            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Sum: " + sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Craps! You lose!");

            } else if (sum == 7 || sum == 11) {
                System.out.println("Natural! You win!");

            } else {
                int point = sum;
                System.out.println("Your point is: " + point);

                boolean gameOver = false;

                while (!gameOver) {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    sum = die1 + die2;

                    System.out.println();
                    System.out.println("Die 1: " + die1);
                    System.out.println("Die 2: " + die2);
                    System.out.println("Sum: " + sum);

                    if (sum == point) {
                        System.out.println("Made point! You win!");
                        gameOver = true;

                    } else if (sum == 7) {
                        System.out.println("Got a seven! You lose!");
                        gameOver = true;

                    } else {
                        System.out.println("Trying for point: " + point);
                    }
                }
            }

            System.out.print("Would you like to play again? (Y/N): ");
            playAgain = in.nextLine();

            System.out.println();

        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");
        in.close();
    }
}

