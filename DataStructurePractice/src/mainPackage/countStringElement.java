package mainPackage;

public class countStringElement {
	public int[] countLetters(String s) {
	    int[] arr = new int[26];  // Create an array to hold counts for each letter a-z
	    for (int i = 0; i < s.length(); i++) {
	        arr[s.charAt(i) - 'a']++;  // Increment the count for the current character
	    }
	    return arr;  // Return the array of counts
	    
	}
}
