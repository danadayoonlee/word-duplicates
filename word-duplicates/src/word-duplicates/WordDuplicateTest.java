package dayoon_lee_exercise2;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;

public class WordDuplicateTest {

	public static void main(String[] args) {
		// create HashMap to store String keys and Integer values
	    Map<String, Integer> map = new HashMap<>();            

	    createMap(map);
	    displayMap(map);
	}
	// create map from user input
	private static void createMap(Map<String, Integer> map) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String input = scanner.nextLine().replaceAll("[^a-zA-Z]", " ");
		
	    // split the input by words
	    String[] words = input.split("\\s+");
	               
	    // process input text
	    for (String w : words) {
	    	String word = w.toLowerCase(); // make into lower case
	                  
	        if (map.containsKey(word)) {
	        	int count = map.get(word); // get current count
	            map.put(word, count + 1); // increment count   
	         } 
	         else {
	            map.put(word, 1); // add new word with a count of 1 to map
	         } 
	    } 
	}
	
	// display map content
	private static void displayMap(Map<String, Integer> map) {
		Set<String> keys = map.keySet();

		System.out.printf("%nMap contains:%nKey\t\tValue%n");

		// generate output for each key in map
		for (String key : keys) {
			System.out.printf("%-10s%10s%n", key, map.get(key));
		}
		
		System.out.printf( "%nNumber of duplication words: %d%n", map.size());
    } 
}
