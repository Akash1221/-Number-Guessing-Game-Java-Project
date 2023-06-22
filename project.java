
import java.util.*;

import java.util.Random;

// Create a class game , which allow the user to play "guess the number"

class Game {
    public int number;

    public int inputNumber;

    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    // 1. Consttructor to generate thw random number

    Game() {
        Random rnd = new Random();
        this.number = rnd.nextInt(100);

    }

    // 2. takeUserInput() to take a input of the

    void takeUserInput() {
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();

    }
    // 3. isCorrectNumber() to detect whether the number entered by user is true

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber == number) {

            // format is used for to showing the guessed number and number of attempts

            System.out.format("The number is correct , it was %d\n you Guessed it in %d attempts  ", number,
                    noOfGuesses);
            return true;
        } else if (inputNumber < number) {
            System.out.println("Too Low");
        } else if (inputNumber > number) {
            System.out.println("Too High");
        }
        return false;

    }
}

public class project {
    public static void main(String[] args) {

        Game gm = new Game();
        boolean bool = false;
        while (!bool) {
            gm.takeUserInput();
            bool = gm.isCorrectNumber();

        }
    }

}
