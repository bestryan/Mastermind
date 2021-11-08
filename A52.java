import java.util.Random;
import java.util.Scanner;

public class A52 {
    public static void main(String[] args) {
        // game introduction
        System.out.println("""
                Welcome to Mastermind.The computer will think of 4 secret numbers.
                You try to guess what numbers are in the code and what order they are in.
                After making a guess the result will be displayed.
                Every time you make a guess you get feedback

                If you have guessed the right number in the right place you get a Sun️️️
                If you have guessed the right number in the wrong place you get a Moon
                If you have guessed the wrong number you get no feedback.
                """);
        Random random = new Random(); // computer select random numbers
        int a = random.nextInt(10);
        int b = random.nextInt(10);
        int c = random.nextInt(10);
        int d = random.nextInt(10);
        int[] computer_list = {a, b, c, d}; // computerised random arraylist

        int A, B, C, D; // player guess numbers by input int
        System.out.println("Please enter your 1st number(0 to 9): ");
        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        System.out.println("2nd number(0 to 9): ");
        input = new Scanner(System.in);
        B = input.nextInt();
        System.out.println("3rd number(0 to 9): ");
        input = new Scanner(System.in);
        C = input.nextInt();
        System.out.println("last number(0 to 9): ");
        input = new Scanner(System.in);
        D = input.nextInt();
        int[] guess_list = {A, B, C, D}; // player guess random arraylist

        System.out.format("\nYour guess numbers [%d, %d, %d, %d]", A, B, C, D); // display players num
        System.out.format("\nComputer numbers: [%d, %d, %d, %d]", a, b, c, d); // display computer num

        int sun = 0; // loop check correct number in correct place
        for (int i = 0; i < computer_list.length; i++) {
            if (guess_list[i] == computer_list[i]) {
                sun++;
            }
        }
        System.out.println("\nTotal 🌞: " + sun);

        int moon = 0; // loop check correct numbers in wrong place
        for (int i = 0; i < computer_list.length; i++) {
            if (guess_list[i] == computer_list[(i + 1) % 4]) {
                moon++;
            }
            if (guess_list[i] == computer_list[(i + 2) % 4]) {
                moon++;
            }
            if (guess_list[i] == computer_list[(i + 3) % 4]) {
                moon++;
            }
        }
        System.out.println("Total 🌘: " + moon);
    }
}

