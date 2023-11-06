package week5.day4.assignment2;

public class AxisBank extends BankInfo {
	
	public void deposit(int amount) {
		System.out.println("deposit : "+amount);
		
	}
	
	public static void main(String[] args) {
		AxisBank bank=new AxisBank();
		bank.deposit(10000);
		bank.fixed(20500);
		bank.saving(60000);
		
		
		
	}
}
