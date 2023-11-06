package week3.day1.assignment1;

public class Palindrome {
	public static void main(String[] args) {
		String orginal = "madam";
		String rev ="";
		for(int i= orginal.length()-1; i>=0; i--)
		{
			rev = rev+orginal.charAt(i);
		}
		if(orginal.equals(rev)) {
			System.out.println("The given string is Palindrome" );
		} else 
			System.out.println("The given string is not a plaindrome");
	}

}
