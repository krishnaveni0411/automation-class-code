 package week5.day5.assignment;

import java.util.Arrays;

public class MissingElement {
	/*
	 * Declare a array as num in integer and declare an integer as j=0;
	 * sort the array ;
	 * iterate an incremental for loop and store in j as j=i+1;
	 * check if (num[i]!=j) then print j and end the loop using break;
	 */
	public static void main(String[] args) {
		int[] num={2,5,6,8,9,1,3,4};
		int j=0;
		Arrays.sort(num);
        for(int i=0; i<num.length; i++) {
			j=i+1;
			if(num[i]!=j) {
				System.out.println(j);
				break;
			}
		}
	}
}
