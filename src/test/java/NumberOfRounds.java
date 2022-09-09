import java.util.Scanner;

public class NumberOfRounds {




    public static int numberOfRoundsMethod(){

        int numberOfRounds=0;



        do {

            // giving message to inform the user
            System.out.print("Enter Number of Rounds: ");

            // Receiving the number of the rounds from the user with try catch
            numberOfRounds= TryCatch.tryCatch();

        }
            //if the number between [1-99], the game will ask again to enter a number
        while (numberOfRounds<1||numberOfRounds>99);

            // will return number of rounds
        return numberOfRounds;


    }
}
