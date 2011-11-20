package matrix;


import java.util.ArrayList;

import matrix.impl.MusicMatrixListImpl;

/**
 * 
 * @author mdeblase
 *
 * Just a class to run some tests of the data model
 */
public class MatrixTest {

	
	public static void main(String[] args) {
		ArrayList<String> noteList = new ArrayList<String>();
		noteList.add("C");
		noteList.add("F");
		noteList.add("D#");
		noteList.add("E");
		noteList.add("B");
		MusicMatrixListImpl matrix = new MusicMatrixListImpl(noteList);
		System.out.println(matrix.toString());
	}

}
