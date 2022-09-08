import java.util.Scanner;

public class Game {


    public static void main(String[] args) {

        // Creating scan object to receive number of rounds from the user
        Scanner scan = new Scanner(System.in);


        // giving message to inform the user
        System.out.print("Enter Number of Rounds: ");

        // Receiving the number of the rounds from the user
        int numberOfRounds = scan.nextInt();


        int playerOneTotalPoint = 0;
        int playerTwoTotalPoint = 0;
        int playerThreeTotalPoint = 0;


        // It will let users to use dice for numberOfRounds times.
        for (int i = 0; i < numberOfRounds; i++) {


            // Every player using the dice to receive a random number [1-6]
            int playerOneDice = Dice.dice();
            int playerTwoDice = Dice.dice();
            int playerThreeDice = Dice.dice();

            // According to their dice numbers they will gain points and bonus points
            int playerOneGainedPoint = 0;
            int playerTwoGainedPoint = 0;
            int playerThreeGainedPoint = 0;


            // if all three players get the same number, then the number is added to total point of each player.
            // I did not add this part because I could not see the difference. It is not effecting the result.


                // if player one and player two dice numbers are equal, they will get double points of their dices
            if (playerOneDice == playerTwoDice) {
                playerOneGainedPoint = playerOneDice * 2;
                playerTwoGainedPoint = playerTwoDice * 2;
                playerThreeGainedPoint = playerThreeDice;


                // if player two and player three dice numbers are equal, they will get double points of their dices
            } else if (playerTwoDice == playerThreeDice) {

                playerTwoGainedPoint = playerTwoDice * 2;
                playerThreeGainedPoint = playerThreeDice * 2;
                playerOneGainedPoint = playerOneDice;


                // if player one and player three dice numbers are equal, they will get double points of their dices
            } else if (playerOneDice == playerThreeDice) {

                playerOneGainedPoint = playerOneDice * 2;
                playerThreeGainedPoint = playerThreeDice * 2;
                playerTwoGainedPoint = playerTwoDice;

                // there is no bonus for anyone
            } else {
                playerOneGainedPoint = playerOneDice;
                playerTwoGainedPoint = playerTwoDice;
                playerThreeGainedPoint = playerThreeDice;


            }
            // adding the points to the player's total points
            playerOneTotalPoint += playerOneGainedPoint;
            playerTwoTotalPoint += playerTwoGainedPoint;
            playerThreeTotalPoint += playerThreeGainedPoint;


            // at the starting of the table statements of the points
            if (i == 0) {
                System.out.println("+---------+---------+---------+---------+----------+----------+----------+");
                System.out.printf("| %6s  | %6s  | %6s  | %6s  | %7s  | %7s  | %7s  |", "ROUND", "DICE1", "DICE2", "DICE3", "TOTAL1", "TOTAL2", "TOTAL3");
                System.out.println();
                System.out.println("+---------+---------+---------+---------+----------+----------+----------+");
            }

            // writing the numbers to the table
            System.out.printf("| %4d    | %4d    | %4d    | %4d    | %5d    | %5d    | %5d    |", i + 1, playerOneDice, playerTwoDice, playerThreeDice, playerOneTotalPoint, playerTwoTotalPoint, playerThreeTotalPoint);
            System.out.println();
            System.out.println("+---------+---------+---------+---------+----------+----------+----------+");
        }

    }


}
