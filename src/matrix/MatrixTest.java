package matrix;


import java.util.ArrayList;

import matrix.impl.MusicMatrixImpl;

/**
 * 
 * @author mdeblase
 *
 * Just a class to run some tests of the data model
 */
public class MatrixTest {

	
	public static void main(String[] args) {
		ArrayList<String> noteList = new ArrayList<String>();
		noteList.add("D");
		noteList.add("G#");
		noteList.add("C");
		noteList.add("E");
		MusicMatrixImpl matrix = new MusicMatrixImpl(noteList);
		System.out.println(matrix.toString());
	}

}
