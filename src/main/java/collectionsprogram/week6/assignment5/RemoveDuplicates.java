package collectionsprogram.week6.assignment5;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
public static void main(String[] args) {
	String text="PayPal India";
	char[] charArray=text.toCharArray();
	Set<Character> charSet=new LinkedHashSet<Character>();
	
	for (int i = 0; i < charArray.length; i++) {
		charSet.add(charArray[i]);
	}
 System.out.println(charSet);
 
 throw new RuntimeException();
}
}
