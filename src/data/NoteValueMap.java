package data;

import java.util.HashMap;

public class NoteValueMap {
	protected static final HashMap<String,Integer> noteMap = new HashMap<String,Integer>();
	static
	{
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
	}
}
