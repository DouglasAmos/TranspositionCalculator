package calculator.transposition;

public class Notes {

    private String selectedNote;
    private String transpositionDirection;
    private String goalNote;
    private static final String[] notesInScale = new String[]{"C", "C#/Db", "D", "D#/Eb", "E", "F", "F#/Gb", "G", "G#/Ab", "A", "A#/Bb", "B", "C", "C#/Db", "D", "D#/Eb", "E", "F", "F#/Gb", "G", "G#/Ab", "A", "A#/Bb", "B","C", "C#/Db", "D", "D#/Eb", "E", "F", "F#/Gb", "G", "G#/Ab", "A", "A#/Bb", "B"};

    // if transpositionNumber > the length of the string depending on where you are starting then:
    // if tranpositionAmount > notesInScale[i] - selectedNote: then


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

    public Notes(){

    }

    public void noteFinder(String selectedNote){

        for(int i = 12; i < 24; i++){
            if(notesInScale[i].equals(selectedNote)){
               goalNote = notesInScale[i + getTranspositionDirection()];
            }
        }


    }






}
