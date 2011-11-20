package matrix.impl;

import java.util.ArrayList;
import java.util.List;

import util.NoteValueMap;

import matrix.MusicMatrix;
import matrix.MusicMatrixList;

/**
 * MusicMatrixListImpl
 * @author mdeblase
 *
 * Taking a list of notes as a constructor, creates a list of 12 matrices.
 * Create each matrix, by incrementing notes from the original list by one
 * for each matrix
 *
 */
public class MusicMatrixListImpl implements MusicMatrixList {
    private ArrayList<MusicMatrix> list;
    private ArrayList<String> startingNotes;
    
    
    public MusicMatrixListImpl(ArrayList<String> startingNotes) {
        this.startingNotes = startingNotes;
        list = new ArrayList<MusicMatrix>();
        this.fillList();
    }

    @Override
    public List<MusicMatrix> getMatrixList() {
        return list;
    }

    @Override
    public MusicMatrix getMatrixAt(int i) {
        return list.get(i);
    }
    
    @Override
    public void setStartingNotes(ArrayList<String> startingNotes) {
        this.startingNotes = startingNotes;   
    }
    
    @Override
    public void refreshList() {
        list = new ArrayList<MusicMatrix>();
        this.fillList();  
    }
    
    public String toString() {
        return list.toString();
    }
    
    private void fillList() {
       for (int i=0; i <= 11; i++) {
           list.add(new MusicMatrixImpl(this.incrementNoteList(this.startingNotes, i)));
       }
    }
    
    private ArrayList<String> incrementNoteList(ArrayList<String> noteList, int delta) {
        ArrayList<String> newList = new ArrayList<String>();
        for(String note: noteList) {
            int value = NoteValueMap.noteMap.get(note);
            value += delta;
            if (value > 11) {
                value -= 12;
            }
            newList.add(NoteValueMap.numberMap.get(value));
        }
        return newList;
    }

   

    

}
