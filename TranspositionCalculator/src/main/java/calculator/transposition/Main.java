package calculator.transposition;

import java.util.Scanner;

public class Main {





    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Please enter your starting note:");

        String userInput = inputScanner.nextLine();

        Notes notes = new Notes();

        String userGuess = notes.getSelectedNote();

        String[] noteArray = notes.getNotesInScale();

        System.out.println(noteArray);














    }


}
