package mainPackage;

public class DataStructureMain {

	public static void main(String[] args) {
		
		countStringElement counter = new countStringElement();
		
		// Call the countLetters method
        String input = "hello";
        int[] letterCounts = counter.countLetters(input);			
        
        // Print the results
        for (int i = 0; i < letterCounts.length; i++) {
            if (letterCounts[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + letterCounts[i]);
            }
        }
	}

}
