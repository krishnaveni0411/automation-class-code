package week1.day2.assignment2;

public class Mobile {
	String mobileBrandName = "Redmi 10";
	char mobileLogo = 'R';
	short noOfMobilePiece = 8;
	int modelNumber = 893342;
	long mobileImeiNumber = 56889547893L;
	float mobilePrice = 10000.5f;
	boolean isDamaged = false;
	float displayInches=6.7F;
	short mobileRam= 4;
	short mobileRom= 64;
	public static void main(String[] args) {
		Mobile phone=new Mobile();
		System.out.println(phone.mobileBrandName);
		System.out.println(phone.mobileLogo);
		System.out.println(phone.displayInches );
		System.out.println(phone.noOfMobilePiece);
		System.out.println(phone.modelNumber);
		System.out.println(phone.mobileImeiNumber);
		System.out.println(phone.mobilePrice);
		System.out.println(phone.isDamaged);
		System.out.println(phone.mobileRam);
		System.out.println(phone.mobileRom);
	}
}
