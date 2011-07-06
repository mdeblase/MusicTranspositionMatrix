package data;

import java.util.ArrayList;

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
		noteList.add("C#");
		noteList.add("D#");
		noteList.add("E");
		noteList.add("B");
		noteList.add("F");
		MusicMatrixImpl matrix = new MusicMatrixImpl(noteList);
		System.out.println(matrix.toString());
	}

}
