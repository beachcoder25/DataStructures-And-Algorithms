package reverseString;

public class reverseStringSolution {
	
	public static void main(String[] args) {
		
		//
		String forwardString = "Apple";
		String reverseString = "";
		
		for(int i= forwardString.length() - 1; i >= 0; i--) {
			reverseString = reverseString + forwardString.charAt(i);
			//char x = forwardString.charAt(forwardString.length() - 1 - i);
			
		}
		
		System.out.println("Original String: " + forwardString + "\nReversed String: " + reverseString);
		
	}
}
