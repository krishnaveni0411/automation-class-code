package week1.day2.assignment1;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 7364735733899l;
	boolean isPunctured = false;
	String bikeName = "KTM DUKE 200";
	double runningKM = 400;
	public static void Mileage() {
		System.out.println("Mileage = 35kmpl (approx.)");
	}
    public void fuelCapacity() {
	System.out.println("fuelCapacity = 13.5 liters");
}
    public static void Bike() {
    	String topSpeed ="142 kmph (approx.)";
    	String engineType = "Single cylinder, liquid cooled";
    	String Displacement = "199.5 cc";
    	String kerbWeight = "159 kg";
    	String Price = "1,85,600";
    	System.out.println("topSpeed =142 kmph (approx.)");
    	System.out.println("engineType = Single cylinder, liquid cooled");
    	System.out.println("Displacement = 199.5 cc");
    	System.out.println("kerbWeight = 159 kg");
    	System.out.println("Price = 1,85,600");
    }
    public static void main(String[] args) {
	TwoWheeler bike=new TwoWheeler();
	System.out.println(bike.bikeName);
	System.out.println(bike.noOfMirrors);
	System.out.println(bike.noOfWheels);
	System.out.println(bike.chassisNumber);
	System.out.println(bike.isPunctured);
	System.out.println(bike.runningKM);
	Mileage();
	bike.fuelCapacity();
	Bike(); 
    }
}
