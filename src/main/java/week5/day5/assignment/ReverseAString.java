package week5.day5.assignment;

import java.util.Scanner;

public class ReverseAString {
	/*
	 * Declare a variable as scan using scanner and get the input in runtime;
	 * store the value in string variable as org;
	 * convert the string into toCharArray and store in charArray variable;
	 * iterate the decremental for loop;
	 * Then print the reverse string character by character;
	 */
	
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your input");
	String org=scan.nextLine();
	char[] reverse=org.toCharArray();
	for(int i=reverse.length-1; i>=0; i--) {
		System.out.println(reverse[i]);
	}

}
}
