package calculator.transposition;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Ultimately, this is going to work much better as a separate class.  I'm working on it here for proof-of-concept


        Scanner inputScanner = new Scanner(System.in);
        final String[] notesInScale = new String[]{"C", "C#/Db", "D", "D#/Eb", "E", "F", "F#/Gb", "G", "G#/Ab", "A", "A#/Bb", "B", "C", "C#/Db", "D", "D#/Eb", "E", "F", "F#/Gb", "G", "G#/Ab", "A", "A#/Bb", "B", "C", "C#/Db", "D", "D#/Eb", "E", "F", "F#/Gb", "G", "G#/Ab", "A", "A#/Bb", "B"};

        final String[] intervalString = new String[]{"", "m2", "M2", "m3", "M3", "P4", "TT", "P5", "m6", "M6", "m7", "M7"};

        System.out.println("Would you like transpose a note? (yes/no)");

        String userAnswer = inputScanner.nextLine();

        String log = "Log.txt";

        File logFile = new File(log);


        while (userAnswer.equals("yes")) {


            System.out.println("Please enter your starting note:");
            String userInputStartNote = inputScanner.nextLine();

            while (!userInputStartNote.matches(Arrays.toString(notesInScale))) {
                System.out.println("Please enter a valid starting note");
                userInputStartNote = inputScanner.nextLine();
            }


            System.out.println("Are you transposing upward (U), or downward (D)?");
            String userInputDirection = inputScanner.nextLine().toUpperCase();

            while (!userInputDirection.equals("U") && !userInputDirection.equals("D")) {
                System.out.println("Please enter a valid option U or D");
                userInputDirection = inputScanner.nextLine().toUpperCase();

            }

            System.out.println("Please enter your desired interval to transpose using lowercase for minor and uppercase for major: ");
            String userInputInterval = inputScanner.nextLine();

            /*
            while (!userInputInterval.matches(Arrays.toString(intervalString))) {
                System.out.println("Please enter a valid interval");
                userInputInterval = inputScanner.nextLine();
            }

             */


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

                        writer.println("Starting note: " + userInputStartNote + " Goal note: " + goalNote);

                    } catch (Exception ex) {
                        System.out.println("There was an error printing to the log");
                    }
                }


            }

            System.out.println("Would you like to transpose another note? (yes/no)");
            userAnswer = inputScanner.nextLine();


        }

        System.out.println("Goodbye!");

    }
}
