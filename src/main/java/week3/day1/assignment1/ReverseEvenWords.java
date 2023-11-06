package week3.day1.assignment1;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] split=test.split(" ");
		for(int i=0; i<split.length; i++) {
			if(i%2!=0) {
				String rev="";
				for(int j=split[i].length()-1; j>=0; j--) {
					rev=rev+split[i].charAt(j);
				}
				split[i]=rev;
				System.out.print(rev);
			} else 
				System.out.print(split[i]);
			System.out.print(" ");
		}
	}

}
