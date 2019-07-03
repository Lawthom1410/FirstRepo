package qa.com.MorseCode;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class Translator {
	
	public Map<String, String> getMap() {
		
		Map<String, String> letters = new HashMap<>();
		letters.put(".-", "a");
		letters.put("-...", "b");
		letters.put("-.-.", "c");
		letters.put("-..", "d");
		letters.put(".", "e");
		letters.put("..-.", "f");
		letters.put("--.", "g");
		letters.put("....", "h");
		letters.put("..", "i");
		letters.put(".---", "j");
		letters.put("-.-", "k");
		letters.put(".-..", "l");
		letters.put("--", "m");
		letters.put("-.", "n");
		letters.put("---", "o");
		letters.put(".--.", "p");
		letters.put("--.-", "q");
		letters.put(".-.", "r");
		letters.put("...", "s");
		letters.put("-", "t");
		letters.put("..-", "u");
		letters.put("...-", "v");
		letters.put(".--", "w");
		letters.put("-..-", "x");
		letters.put("-.--", "y");
		letters.put("--..", "z");
		letters.put("/", " ");	
		
		return letters;		
	}
	
	public String translate(String morseChar) {
		
		Map<String, String> letters = getMap();
		
		String textChar = letters.get(morseChar);

		return textChar;
	
	}
	
	public static <K, V> K getKey(Map<K, V> map, V value) {
		return map.keySet()
					   .stream()
					   .filter(key -> value.equals(map.get(key)))
					   .findFirst().get();
	}
	
	public String revTranslate(String textChar) {
		
		Map<String, String> letters = getMap();
		
		return getKey(letters, textChar);
		
	}
	
	public String getText(String morse) {
		
		String fullText = "";
		
		String[] characters = morse.split(" ");
		
		for (String i : characters) {
			String textChar = translate(i);
			fullText += textChar;			
		}
		
		return fullText;
	}
	
	public String getMorse(String text) {
		
		String fullText = "";
		
		String[] characters = text.split("");
		
		for (String i : characters) {
			String morseChar = revTranslate(i);
			fullText += morseChar + " ";			
		}
		
				
		return fullText;
		
	}
	
	
	

}
