package arrays;

import java.util.Arrays;

public class SquaresOfSortedArray {
	
	public int[] sortedSquares(int[] A) {
		
        for(int i=0; i < A.length; i++) {
        	A[i] = A[i]*A[i];
        	}
        
        Arrays.parallelSort(A);	
		return A;       
    }
	
	

	public static void main(String[] args) {
		 int[] array = {-4,-1,0,3,10};
		 SquaresOfSortedArray sq = new SquaresOfSortedArray();
		 int[] ans = (sq.sortedSquares(array));
		 
		 for(int i=0; i < ans.length; i++) {
			 System.out.println(ans[i]);
		 }

	}

}
