package week1.day1.assignment1;

public class Car {
	public void applyBreak() {
		System.out.println("Apply Break");
	}
	public void applyGear() {
		System.out.println("Apply Gear");
	}
	public void switchOnAc() {
		System.out.println("Switch On Ac");
	}
	public void applyAcclerate() {
		System.out.println("Apply Acclerate");
	}
	public static void main(String[] args) {
		Car A=new Car();
		A.applyBreak();
		A.applyGear();
		A.switchOnAc();
		A.applyAcclerate();
		
	}
}
