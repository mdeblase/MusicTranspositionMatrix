/*
 * Interface for MusicMatrix objects
 */

package matrix;

import java.util.ArrayList;

/**
 *
 * @author mdeblase
 */
public interface MusicMatrix {

    public int[] getRow(int rowNum);

    public int getNumRows();

    public int getNumCols();
    
    public int getNoteValue(int x, int y);
    
    public String getNoteString(int x, int y);

    public void setStartingRow(ArrayList<String> startingRow);
    
}
