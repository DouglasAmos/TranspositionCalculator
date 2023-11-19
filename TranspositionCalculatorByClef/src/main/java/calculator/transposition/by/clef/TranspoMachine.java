package calculator.transposition.by.clef;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class TranspoMachine {


    private PrintWriter out;
    private Scanner in;

    // Need: clef set-up for both transpo by interval and transpo by key
    // First select transpo by interval or transpo by key
    // Then, input -- transpomachine -- output clef and changed key
    // SO I need a key distance calculator and a clef calculator


    public TranspoMachine(InputStream input, OutputStream output){
        this.out = new PrintWriter(output);
        this.in = new Scanner(input);
    }






}
