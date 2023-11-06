package week5.day5.assignment;

public class Palindrome {
	/*
	 * Declare a string as "madam" and a empty string;
	 * convert the string "madam" as toCharArray and store it in a charArray variable;
	 * iterate a decremental for loop and store it in the rev string (empty string);
	 * check both the string content if its same print as " the given string is  a palindrome";
	 * or if its not same print as " the given string is not a Palindrome";
	 */
	public static void main(String[] args) {
		String org="madam";
		String rev= "";
		char[] charArray= org.toCharArray();
		for(int i=charArray.length-1; i>=0; i--) {
			rev=rev+charArray[i];
		}
		if(org.equals(rev)) {
			System.out.println("The Given String is Palindrome");
		}else
			System.out.println("The Given String is not a Palindrome"); 
	}
}
