import java.util.Scanner;

public class TryCatch {


    public static int tryCatch() {

        int numberOfRounds=0;

        // Creating scan object to receive number of rounds from the user
        Scanner scan = new Scanner(System.in);

        //if user enters a letter or unvalid sign, game will ask user to enter a number
        do {
            try {
                //gets a data from user
                numberOfRounds = scan.nextInt();
                scan.nextLine();
                break;

                // if the data is a letter, the game will ask again to enter a number
            } catch (Exception e) {
                System.out.print("Please enter a number: ");
                tryCatch();
                break;
            }
        } while (false);


        // tryCatch will return a valid int
        return numberOfRounds;

    }
}
