package week5.day5.assignment;

public class FindCharacterOccurance {
	/*
	 * Declare a string as word="Testleaf" and int a count=0;
	 * convert the string into toCharArray and store in CharArray variable;
	 * iterate incremental for loop of CharArray;
	 * check if(charArray[i]=='e') the increse the count;
	 * once all the Character are checked, print the number of 'e' Character occurrance;
	 */
	public static void main(String[] args) {
		String word="Testleaf";
		int count=0;
		char[] charArray = word.toCharArray();
		for(int i=0; i<charArray.length; i++) {
			if(charArray[i]=='e') {
				count++;
			}
		}
		System.out.println("The character occurance of e is "+count);
	}
}
