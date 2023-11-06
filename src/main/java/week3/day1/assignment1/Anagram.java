package week3.day1.assignment1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1 = "stops";
			String text2 = "potss"; 
			if(text1.length()==text2.length()) {
				char[] char1=text1.toCharArray();
				Arrays.sort(char1);
				char[] char2=text2.toCharArray();
				Arrays.sort(char2);
				int count=0;
				for(int i=0; i<char1.length; i++) {
					if(char1[i]==char2[i]) 
						count++;
				}
				if(count==char1.length) {
					System.out.println("True");
				}	else
					System.out.println("False");
			} else
				System.out.println("False");
	}

}
