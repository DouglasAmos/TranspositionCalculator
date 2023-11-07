package calculator.transposition;

import java.util.Scanner;

public class Main {
   static Notes notes = new Notes();


   public void run(){

       while(true) {
           Scanner inputScanner = new Scanner(System.in);

           System.out.println("Please enter your starting note:");

           String userInputStartNote = inputScanner.nextLine();

           System.out.println("Please enter your desired interval to transpose using lowercase for minor and uppercase for major: ");

           String userInputInterval = inputScanner.nextLine();

           notes.intervalFinder(userInputInterval);
           notes.noteFinder();


           System.out.println("Are you transposing upward (U), or downward (D)?");

           String userInputDirection = inputScanner.nextLine();
           notes.intervalFinder(userInputInterval);
           notes.getTranspositionDirection();
           notes.noteFinder();

           System.out.println(notes.noteFinder());

       }
   }


    public static void main(String[] args) {

       Main main = new Main();

       main.run();



    }


}
