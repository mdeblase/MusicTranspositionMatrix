package matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * MusicMatrixList
 * @author mdeblase
 *
 * Taking a list of notes as a constructor, creates a list of 12 matrices.
 * Create each matrix, by incrementing notes from the original list by one
 * for each matrix
 *
 */
public interface MusicMatrixList {
    
    public void setStartingNotes(ArrayList<String> startingNotes);
    
    public void refreshList();

    public List<MusicMatrix> getMatrixList();
    
    public MusicMatrix getMatrixAt(int i);
}
