package calculator.transposition;

public class Notes {

    private String selectedNote;
    private String transpositionDirection;
    private String goalNote;

    public String getSelectedNote() {
        return selectedNote;
    }

    public void setSelectedNote(String selectedNote) {
        this.selectedNote = selectedNote;
    }

    public String getTranspositionDirection() {
        return transpositionDirection;
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

    private String[] notesInScale = new String[]{"C", "C#/Db", "D", "D#/Eb", "E", "F", "F#/Gb", "G", "G#/Ab", "A", "A#/Bb", "B"};

    public String[] getNotesInScale() {
        return notesInScale;
    }






}
