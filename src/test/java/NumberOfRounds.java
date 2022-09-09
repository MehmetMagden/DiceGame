import java.util.Scanner;

public class NumberOfRounds {




    public static int numberOfRoundsMethod(){

        int numberOfRounds=0;



        do {

            // giving message to inform the user
            System.out.print("Enter Number of Rounds: ");

            // Receiving the number of the rounds from the user
            numberOfRounds= TryCatch.tryCatch();

        }
        while (numberOfRounds<1||numberOfRounds>99);






        return numberOfRounds;


    }
}
