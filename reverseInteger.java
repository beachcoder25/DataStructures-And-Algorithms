package reverseInteger;

public class reverseInteger {

	public int reverse(int x) {

		int reversed = 0;
		
		// x = 789

		while(x != 0) {

			// x%10 Is adding in remainder
			// reversed*10, we keep multiplying by 10 so we can properly add together for our answer
			int temp = reversed * 10 + x % 10; // temp = 9 -> temp = 9*10 + 8 = 98 -> temp = 98*10 + 7 = 987

			// If temp/10 doesnt match reversed we are done...
			if (temp / 10 != reversed) {// temp = 9/10 = 0 && reversed = 0 (Because int division!) 
				 						// temp = 98/10 = 9 && reversed = 9  
										// temp = 987/10 = 98 && reversed = 98
				return 0;
			}
			reversed = temp; // reversed = 9 -> reversed = 98 -> reversed = 987
			x = x / 10; // x = 789/10 = 78 -> x = 78/10 = 7 -> x = 9/10 = 0 (Breaks while loop)
		}
		
		return reversed; // reversed = 987
	}
}
