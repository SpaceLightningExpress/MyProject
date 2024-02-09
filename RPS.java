

import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] Game = {"Rock", "Paper", "Scissors"};
            String Code = Game[new Random().nextInt(Game.length)];

            String PlayerMoves;

            while (true) {
                System.out.println("Enter Rock Paper Scissors");
                PlayerMoves = scanner.nextLine();

                if (PlayerMoves.equals("Rock") || PlayerMoves.equals("Paper") || PlayerMoves.equals("Scissors")) {
                    break;
                }
                System.out.println("Non-Valid Move");
            }

            System.out.println("Computar Play:" + Code);

            if (PlayerMoves.equals(Code)) {
                System.out.println("The Game Was Tie");

            } else if (PlayerMoves.equals("Rock")) {
                if (Code.equals("Paper")) {
                    System.out.println("U Lose");

                } else if (Code.equals("Scissors")) {
                    System.out.println("U Win");
                }
            } else if (PlayerMoves.equals("Paper")) {
                if (Code.equals("Rock")) {
                    System.out.println("U Win");

                } else if (Code.equals("Scissors")) {
                    System.out.println("U Lose");
                }
            } else if (PlayerMoves.equals("Scissors")) {
                if (Code.equals("Paper")) {
                    System.out.println("U Win");

                } else if (Code.equals("Rock")) {
                    System.out.println("U Lose");
                }
            }
            System.out.println("Play Again Yes/No");
            String Play = scanner.nextLine();

            if (Play.equals("Yes")) {
                break;

            }

        }
    }
}
