import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        while(true){ //boolean game set always true
            System.out.println(""" 
                    Welcome to the Mastermind. The computer will think of 4 secret numbers.
                    You try to guess what numbers are in the code and what order they are in.
                    After making a guess the result will be displayed.
                    Every time you make a guess you get feedback

                    If you have guessed the right number in the right place you get a Sun️️️
                    If you have guessed the right number in the wrong place you get a Moon
                    If you have guessed the wrong number you get no feedback.
                    """); // game introduction
            Scanner userInput = new Scanner(System.in); // player choose numbers arraylist
            ArrayList<Integer> num1 = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                System.out.println("Please enter the number (0 to 9): ");
                num1.add(userInput.nextInt()); // player choose numbers
            }System.out.println("\nYour chosen numbers are " + num1);

            ArrayList<Integer> num2 = new ArrayList<>(); // computerised random arraylist
            for (int i = 0; i < 4; i++) {
                Random random = new Random();
                num2.add(random.nextInt(10)); // computer select random numbers
            }System.out.println("The secret numbers are " + num2);

            int sun = 0; int moon = 0;

            for (int i = 0; i < num2.size(); i++) { // loop check correct number in correct place
                if (num1.get(i).equals(num2.get(i))) { sun++; }
            }System.out.println("\nTotal 🌞: " + sun);

            for (int i = 0; i < num2.size(); i++) { // loop check correct numbers in wrong place
                if (num1.get(i).equals(num2.get((i + 1) % 4))) { moon++; }
                if (num1.get(i).equals(num2.get((i + 2) % 4))) { moon++; }
                if (num1.get(i).equals(num2.get((i + 3) % 4))) { moon++; }
            }System.out.println("Total 🌘: " + moon);

            System.out.println("\nWould you like to play another game?('1' for Yes or other numbers to quit): ");
            Scanner input = new Scanner(System.in);
            if (input.nextInt() == 1) { continue; } // continue the game
            else{ System.out.println("Thanks and Goodbye !!!\n"); break; } // quit the game
        }
    }
}

