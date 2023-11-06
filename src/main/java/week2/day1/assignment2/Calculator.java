package week2.day1.assignment2;

public class Calculator {
	public int additionTwoNumber(int a,int b) {
		int c=a+b;
		return c;
	}
	public int subractionTwoNumber(int e,int f) {
	int d=e-f;
		return d;
	}
	public double multipleTwoNumber(double i,double j) {
		double g=i*j;
		return g;
	}
	public float divideTwoNumber(float x,float y) {
		float h=x/y;
		return h;
	}
	public static void main(String[] args) {
		System.out.println("Calculator Simple Function");
		Calculator claci=new Calculator();
		int k= claci.additionTwoNumber(23,89);
		System.out.println("\nAddition of Two Number :"+k);
		int l= claci.subractionTwoNumber(40,23);
		System.out.println("Subraction of Two Number :"+l);
		double m= claci.multipleTwoNumber(45.99,55.87);
		System.out.println("Multiple of Two Number :" +m);
		float n= claci.divideTwoNumber(34.89f, 54.98f);
		System.out.println("division of Two Number :"+n);
		int o= claci.additionTwoNumber(23,89);
		System.out.println("\nAddition of Two Number :"+o);
		int p= claci.subractionTwoNumber(49,27);
		System.out.println("Subraction of Two Number :"+p);
		double q= claci.multipleTwoNumber(43.89,58.67);
		System.out.println("Multiple of Two Number :"+q);
		float r= claci.divideTwoNumber(48.69f, 53.97f);
	    System.out.println("Division of Two Number :"+r);
	}

}
