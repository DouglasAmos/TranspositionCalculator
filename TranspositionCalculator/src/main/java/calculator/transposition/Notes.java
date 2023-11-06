package calculator.transposition;

import java.util.HashMap;
import java.util.Map;

public class Notes {

    private String selectedNote;
    private String transpositionDirection;
    private String goalNote;
    private Integer intervalNumber;
    private final String[] notesInScale = new String[]{"C", "C#/Db", "D", "D#/Eb", "E", "F", "F#/Gb", "G", "G#/Ab", "A", "A#/Bb", "B", "C", "C#/Db", "D", "D#/Eb", "E", "F", "F#/Gb", "G", "G#/Ab", "A", "A#/Bb", "B","C", "C#/Db", "D", "D#/Eb", "E", "F", "F#/Gb", "G", "G#/Ab", "A", "A#/Bb", "B"};

    Map<String, Integer> intervalMap = new HashMap<>();

    public void intervalMap(Map<String, Integer> intervalMap) {
        this.intervalMap = intervalMap;
        intervalMap.put("m2", 1);
        intervalMap.put("M2", 2);
        intervalMap.put("m3", 3);
        intervalMap.put("M3", 4);
        intervalMap.put("P4", 5);
        intervalMap.put("AUG4", 6);
        intervalMap.put("DIM5", 6);
        intervalMap.put("P5", 7);
        intervalMap.put("m6", 8);
        intervalMap.put("M6", 9);
        intervalMap.put("m7", 10);
        intervalMap.put("M7", 11);
    }


    // if transpositionNumber > the length of the string depending on where you are starting then:
    // if transpositionAmount > notesInScale[i] - selectedNote: then



    public String getSelectedNote() {
        return selectedNote;
    }

    public void setSelectedNote(String selectedNote) {
        this.selectedNote = selectedNote;
    }

    public Integer getTranspositionDirection() {
        return Integer.getInteger(transpositionDirection);
    }

    public void setTranspositionDirection(String transpositionDirection) {
        this.transpositionDirection = transpositionDirection;
    }

    public String getGoalNote() {
        return goalNote;
    }

    public void setGoalNote(String goalNote) {
        this.goalNote = goalNote;
    }


    public String[] getNotesInScale() {
        return notesInScale;
    }



    public void intervalFinder(String userInputInterval) {
        for (Map.Entry<String, Integer> entry : intervalMap.entrySet()) {
            if (entry.equals(userInputInterval)) {
                intervalNumber = entry.getValue();
                System.out.println(intervalNumber);

            }
        }
    }


        public void noteFinder(){

            for (int i = 12; i < 24; i++) {
                if (notesInScale[i].equals(selectedNote)) {
                    goalNote = notesInScale[i + intervalNumber];
                    System.out.println(goalNote);
                }
            }


        }





}








/*
    public void intervalFinder(){
        if(userInputInterval.equals("m2")){
            int userIntervalNumber = 1;
        } else if(userInputInterval.equals("M2")){

        }

    }

     */