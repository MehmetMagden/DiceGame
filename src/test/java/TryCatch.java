import java.util.Scanner;

public class TryCatch {


    public static int tryCatch() {

        int numberOfRounds=0;

        // Creating scan object to receive number of rounds from the user
        Scanner scan = new Scanner(System.in);

        do {
            try {
                numberOfRounds = scan.nextInt();
                scan.nextLine();
                break;

            } catch (Exception e) {
                System.out.println("Please enter a number");
                tryCatch();
                break;
            }
        } while (false);

        return numberOfRounds;

}
}
