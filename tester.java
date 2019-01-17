package twoSum;

public class tester {

	public static void main(String[] args) {

		int[] a = {2, 7, 11, 15};

		int[] b = twoSumSecondBestCase.twoSum(a, 9);
		int[] c = twoSumWorstCase.twoSum(a, 9);

		for(int i=0; i < b.length; i++) {

			System.out.println(b[i]);
		}

		for(int i=0; i < c.length; i++) {

			System.out.println(c[i]);
		}
	}
}
