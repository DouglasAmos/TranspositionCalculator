package calculator.transposition;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TranspoCalculator {

    private static final Scanner inputScanner = new Scanner(System.in);
    private static final String[] notesInScale = {"C", "C#/Db", "D", "D#/Eb", "E", "F", "F#/Gb", "G",
            "G#/Ab", "A", "A#/Bb", "B", "C", "C#/Db", "D", "D#/Eb", "E", "F", "F#/Gb", "G", "G#/Ab", "A", "A#/Bb",
            "B", "C", "C#/Db", "D", "D#/Eb", "E", "F", "F#/Gb", "G", "G#/Ab", "A", "A#/Bb", "B"};

    private final String[] intervalString = {"U", "m2", "M2", "m3", "M3", "P4", "TT", "P5", "m6", "M6", "m7", "M7"};

    private String log = "Log.txt";

    private File logFile = new File(log);


    public void run() {
        System.out.println("Would you like transpose a note? (yes/no)");
        String userAnswer = inputScanner.nextLine();

        while (userAnswer.equals("yes")) {

            //get rid of while and switch to if and if else
            //run try catch

            System.out.println("Please enter your starting note:");
            String userInputStartNote = inputScanner.nextLine();

            if (!userInputStartNote.matches(Arrays.toString(notesInScale))) {
                System.out.println("Please enter a valid starting note");
                userInputStartNote = inputScanner.nextLine();
            }


            System.out.println("Are you transposing upward (U), or downward (D)?");
            String userInputDirection = inputScanner.nextLine().toUpperCase();

            if (!userInputDirection.equals("U") && !userInputDirection.equals("D")) {
                System.out.println("Please enter a valid option U or D");
                userInputDirection = inputScanner.nextLine().toUpperCase();

            }

            System.out.println("Please enter your desired interval to transpose using lowercase for minor and uppercase for major: ");
            String userInputInterval = inputScanner.nextLine();

            if(!userInputInterval.contains(Arrays.toString(intervalString))) {
                System.out.println("Please enter a valid interval");

                userInputInterval = inputScanner.nextLine();

            }



            int transpoNum = 0;
            for (int i = 0; i < intervalString.length; i++) {
                if (userInputInterval.equals(intervalString[i])) {
                    transpoNum = i;
                }
            }


            if (userInputDirection.equals("D")) {
                transpoNum *= -1;
            }
            for (int i = 12; i < 24; i++) {
                if (notesInScale[i].equals(userInputStartNote)) {
                    String goalNote = notesInScale[i + transpoNum];
                    System.out.println("Your desired note is: " + goalNote);

                    try (PrintWriter writer = new PrintWriter(new FileOutputStream(logFile, true))) {

                        writer.println("Starting note: " + userInputStartNote + " || Transposition Distance: " +
                                userInputInterval + "(" + userInputDirection + ")" + " || Goal note: " + goalNote);

                    } catch (Exception ex) {
                        System.out.println("There was an error printing to the log");
                    }
                }


            }

            System.out.println("Would you like to transpose another note? (yes/no)");
            userAnswer = inputScanner.nextLine();


        }


    }


    public static void main(String[] args) {

        TranspoCalculator transpoCalculator = new TranspoCalculator();

        transpoCalculator.run();


        System.out.println("Goodbye!");

    }
}
