import java.util.Scanner;

public class NumberOfRounds {




    public static int numberOfRoundsMethod(){

        int numberOfRounds=0;

        // Creating scan object to receive number of rounds from the user
        Scanner scan = new Scanner(System.in);

        do {

            // giving message to inform the user
            System.out.print("Enter Number of Rounds: ");

            // Receiving the number of the rounds from the user

                numberOfRounds = scan.nextInt();
                scan.nextLine();

        }
        while (numberOfRounds<1||numberOfRounds>99);






        return numberOfRounds;


    }
}
