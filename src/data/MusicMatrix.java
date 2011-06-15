/*
 * Interface for MusicMatrix objects
 */

package data;

import java.util.ArrayList;

/**
 *
 * @author mdeblase
 */
public interface MusicMatrix {

    int[] getRow(int rowNum);

    int getNumRows();

    int getNumCols();

    void setStartingRow(ArrayList<String> startingRow);
    
}
