package week3.day1.assignment1;

public class CharOccurance {
public static void main(String[] args) {
	String str = "welcome to chennai";
	int count=0;
	char[] charArray = str.toCharArray();
	for(int i=0; i<charArray.length; i++) {
		if(charArray[i]=='e') {
			count++;
		}
	}
	System.out.println(count);
}
}
