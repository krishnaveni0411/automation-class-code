package week2.day2.assignment1;

public class PrimeNumber {
	public static void main(String[] args) {
		int a=13;
		boolean flag= false;
	for (int i = 2; i <=a/2; i++) {
		// % this is modulos which takes reminder.
		if (a%i==0) {
			flag=true;
			
		}
	}
		if (flag==false){
			System.out.println("13 is a Prime Number");
			}else {
				System.out.println("13 is not a Prime Number");
			}
	}	
	}

