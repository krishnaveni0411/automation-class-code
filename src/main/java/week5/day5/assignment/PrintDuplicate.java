package week5.day5.assignment;

public class PrintDuplicate {
	/*
	 * Declare an Array as number in integer type;
	 * iterate using the nested incremental for loop;
	 * check if number[i]==number[j] if its same print the number[i];
	 */
	
	public static void main(String[] args) {
		int[] number={11,22,33,44,55,66,22,77,11};
		for(int i=0; i<number.length; i++) {
			for(int j=i+1; j<number.length; j++) {
				if(number[i]==number[j])
					System.out.println(number[i]);
			}
		}
	}
}
