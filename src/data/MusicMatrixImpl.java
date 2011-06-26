package data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/**
 *
 * @author mdeblase
 */
public class MusicMatrixImpl implements MusicMatrix{

    private int[][] matrix;

    private ArrayList<String> starting;

    public MusicMatrixImpl(ArrayList<String> firstRow) {
        this.starting = firstRow;
        matrix = new int[starting.size()][starting.size()];
    }

    public int[] getRow(int rowNum) {
        if (rowNum > this.getNumRows() || rowNum < 0) {
            throw new ArrayIndexOutOfBoundsException("Index" + rowNum +"not found");
        } else {
            return matrix[rowNum];
        }
    }

    public void setStartingRow(ArrayList<String> startingRow) {
        this.starting = startingRow;
        this.construct();
    }

    /**
     * Build the matrix
     * For starting size n there are n-1 differences(d)
     * Each value in row j is the value in row j-1 subtracted by difference d(j-1)
     * Ex. starting row 0 1 3 4
     *     differences d0=1(0,1), d1=2(1,3) d3=1(3,4)
     *     next row use d0 yeilds 11 0 2 3
     *     next row use d1 yeilds 9 10 0 1
     *     last row use d2 yeilds 8 9 11 0
     */
    private void construct() {
        //Convert starting arraylist to int values
    	for (int i = 0; i < starting.size();i++) {
        	matrix[0][i] = NoteValueMap.noteMap.get(starting.get(i));
        }
    	int[] diff = this.getDifferences();
    	for(int i = 1; i < starting.size(); i++) {
    		for (int j = 0; j < starting.size(); j++) {
    			matrix[i][j] = this.subtract(diff[i-1], matrix[i-1][j]);
    		}
    	}
    }
    
    
    private int[] getDifferences() {
        int[] diff = new int[starting.size() - 1];
        for (int i = 0; i < starting.size() -1;i++) {
        	diff[i] = Math.abs(matrix[0][i] - matrix[0][i+1]);
        }
        return diff;
    }

    private int subtract(int num1, int num2) {
        int result = num2 - num1;
        if (result < 0)
        	return result + 12;
        else
        	return result;
    }

    public int getNumRows() {
        return matrix.length;
    }

    public int getNumCols() {
        return matrix[0].length;
    }

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < starting.size(); i++) {
    		for (int j = 0; j < starting.size(); j++) {
    			String note = NoteValueMap.numberMap.get(matrix[i][j]);
    			sb.append(note);
    			if(note.length() == 2)
    				sb.append(" ");
    			else
    				sb.append("  ");
    		}
    		sb.append("\n");
    	}
		return sb.toString();
	}

}
