package data;

import java.util.HashMap;

public class NoteValueMap {
	protected static final HashMap<String, Integer> noteMap = new HashMap<String, Integer>();
	protected static final HashMap<Integer, String> numberMap = new HashMap<Integer, String>();
	static {
		noteMap.put("C", 0);
		noteMap.put("C#", 1);
		noteMap.put("D", 2);
		noteMap.put("Eb", 3);
		noteMap.put("E", 4);
		noteMap.put("F", 5);
		noteMap.put("F#", 6);
		noteMap.put("G", 7);
		noteMap.put("G#", 8);
		noteMap.put("A", 9);
		noteMap.put("Bb", 10);
		noteMap.put("B", 11);
		numberMap.put(0, "C");
		numberMap.put(1, "C#");
		numberMap.put(2, "D");
		numberMap.put(3, "Eb");
		numberMap.put(4, "E");
		numberMap.put(5, "F");
		numberMap.put(6, "F#");
		numberMap.put(7, "G");
		numberMap.put(8, "G#");
		numberMap.put(9, "A");
		numberMap.put(10, "Bb");
		numberMap.put(11, "B");
	}
}
