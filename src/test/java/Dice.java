import java.util.Random;

public class Dice {


    public static int dice(){

        // Created random object to create random numbers
        Random random = new Random();

        // 1-6 random dice number // added +1 to receive a number between [1-6]
        int intDice =random.nextInt(6)+1;

        //Returned the random number
        return intDice;
    }
}
