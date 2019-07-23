package minAndMaxInList;

/* My solution to finding both the minimum and maximum in a list */
		
public class minOrMaxInList {

	static int max = 0, min = 0;

	public minOrMaxInList() {

		max = 0;
		min = 0;

	}

	public int getMax(int[] a) {

		for(int i=0; i < a.length; i++) {

			// Made mistake of putting i > max
			if(a[i] > max) {

				max = a[i];
			}
		}
		
		return max;
	}
	
	public int getMin(int[] a) {

		min = a[0]; // 11 
		
		for(int i=0; i < a.length; i++) {

			int temp = a[i]; // 11 -> 5 -> 7
			
			if(temp < min) { // 11 < 11 -> 5 < 11 -> 7 < 5

				// DNC = Does Not Change
				min = a[i]; // DNC -> 5 -> DNC
			}
		}
		
		return min;
	}


	
	public static void main(String[] args) {


		int[] a = {11,5,7,8,5,55,89,23};
		
		minOrMaxInList m = new minOrMaxInList();
		
		System.out.println(m.getMax(a));
		
		System.out.println(m.getMin(a));

	}
}
