const notesInScale = ["C", "C#/Db", "D", "D#/Eb", "E", "F", "F#/Gb", "G",
"G#/Ab", "A", "A#/Bb", "B", "C", "C#/Db", "D", "D#/Eb", "E", "F", "F#/Gb", "G", "G#/Ab", "A", "A#/Bb",
"B", "C", "C#/Db", "D", "D#/Eb", "E", "F", "F#/Gb", "G", "G#/Ab", "A", "A#/Bb", "B"];

const intervals = ["U", "m2", "M2", "m3", "M3", "P4", "TT", "P5", "m6", "M6", "m7", "M7"]




function transpose(startingNote, direction, interval){


    let intervalNum = 0;
    for (let i = 0; i < intervals.length; i++){
        if(interval === intervals[i]){
            intervalNum = i;
        }
    }

    if(direction === "D"){
        intervalNum *= -1;
    }

    for(let i = 12; i < 24; i++){
        if(notesInScale[i] === startingNote){
            let goalNote = notesInScale[i + intervalNum];

            return goalNote;
        }
    }

    



}


