package PreFinals;

import java.util.Map;
import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		
//empty hashmap that handles keys and value that are both string types		
		Map<String,String> programs = new HashMap<>();

//mapping the following pairs
//                    KEYS                     VALUES 
 		programs.put("BSIT", "Bachelor of Science in Information Technology");
		programs.put("BSCS", "Bachelor of Science in Computer Science");
		programs.put("BSIS", " Bachelor of Science in Information Systems");

//Display keys in a single line		
	    System.out.println("Keys : " + programs.keySet());
	    
//Delete the first entry
	    programs.remove("BSIT");

//Check whether the map contains the key "BSCpE"
	    System.out.println("The map contains BSCpE : " + programs.containsKey("BSCpE"));

	}

}
