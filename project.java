import java.util.*;

import java.util.Random;

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

    Game() {
        Random rnd = new Random();
        this.number = rnd.nextInt(100);

    }

    void takeUserInput() {
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
        // return inputNumber;

    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber == number) {
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
        /*
         * Create a class game , which allow the user to play "guess the number"
         * 1. Consttructor to generate thw random number
         * 2. takeUserInput() to take a input of the number
         * 3. isCorrectNumber() to detect whether the number entered by user is true
         * 4. getter and setter for noOfGuesses
         * use the properties such as noOfGuesses(int),
         */
        Game gm = new Game();
        boolean b = false;
        while (!b) {
            gm.takeUserInput();
            b = gm.isCorrectNumber();

        }
    }

}
