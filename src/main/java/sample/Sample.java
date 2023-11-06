package sample;

public class Sample {
	// Function in java
public void hello() {
	System.out.println("HELLO to the Sample program");
}
	public static void main(String[] args) {
		
		// calling the hello function 
		Sample S=new Sample();
		System.out.println("Hello Function : ");
		S.hello();
		
		// IF Statement 
		System.out.print("\n IF Statement \n"); 
		int pr=10;
		if (pr<11) {
			System.out.println(pr);
		}
		
		// IF else Statement 
				System.out.print("\n IF Else Statement \n"); 
				int rp=10;
				if (rp<11) {
					System.out.println(rp);
				}else {
					System.out.println("invalid");
				}
		
				// if else if statement.
				System.out.print("\n IF Else IF Statement \n");
				int mark = 67;
				if (mark<50) {
					System.out.println("Fail");
				}
				else if (mark>=50 && mark<65) {
					System.out.println("D Grad");
				}
				else if (mark>=65 && mark<75) {
					System.out.println("C Grad");
				}
				else if (mark>=75 && mark<90) {
					System.out.println("B Grad");
				}
				else if (mark>=90 && mark<=100) {
					System.out.println("A Grad");
				}
				else {
					System.out.println("Invalid");
				}
		
				//for loop 
				System.out.print("\n For Loop \n");
   for(int n=0; n<5; n++) {
	   System.out.println(n);
   }
   
				// nested for loop
				System.out.print("\n For Loop \n");
		int m=5;
		for (int i=0; i<m; i++)
		{
			for (int j=0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			System.out.println();
		}
		
		// while loop
		System.out.print("\n While Loop \n");
		int pqr= 10;
		while (pqr<=10) {
			System.out.println(pqr);
			++pqr;
		}
		
		// do while loop
		System.out.print("\n Do While Loop \n");
		int prq=10;
		do {
			System.out.println(prq);
		}while(prq<10);
		
		// do while loop
				System.out.print("\n Do While Loop \n");
				int qrp=5;
				do {
					System.out.println(qrp);
					++qrp;
				}while(prq<10);
				
		// arithmetic operators ( +,-,*,/)
		System.out.print("\n Arithmetic Operators \n");
		int a=10;
		int b = 20;
		int c,e,d;
		int f;
		c= a+b;
		d= b-a;
		e=a*b;
		f=b/a;
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	
		// relational operators (<,>,==,!=)
		System.out.print("\n Relational Operators \n");
		int q=10, r=20,s=10;
		int p=20, t=10, u=10;
		System.out.println(q<p);
        System.out.println(r>s);
	    System.out.println(t==u);
	    System.out.println(t!=u);
	    
	// logical operators (AND - &&, OR - || )
	System.out.print("\n Logical Operators \n");
	boolean w=true;
	boolean y=false;
	System.out.println(w&&y);
	System.out.println(w||y);
	
	// array in java
	System.out.print("\n array in java \n");
	char[] v=new char[4];
	v[0]='s';
	v[1]='t';
	v[2]='a';
	v[3]='r';
	for(int i=0; i<4; i++) {
		System.out.println(v[i]);
	}
	
	// create another array where we are also inserting the value inside the array with the for loop
	System.out.print("\n Creating another array where we are also inserting the value inside the array with the for loop \n");
	int[] z=new int[10];
	for(int i=0; i<10; i++) {
		z[i] = i;
	}
	for(int i=0; i<10; i++) {
		System.out.println(z[i]);
	}
	int ab[] = new int[5];
	int ba[] =new int[5];
	int abc[] =new int[5];
	int num = 5;
	for (int i=0; i<5; i++) {
		ab[i]=i;
	}
	for (int i=0; i<5; i++) {
		ba[i]=num;
		++num;
	}
	System.out.print("\nValues of array 'AB'  : ");
	for (int i=0; i<5; i++) {
		System.out.print(ab[i]+ " ");
	}
	System.out.print("\nValues of array 'BA'  : ");
	for (int i=0; i<5; i++) {
		System.out.print(ba[i]+ " ");
	}
	for (int i=0;i<5;i++) {
		abc[i] = ab[i] + ba[i] ;
	}
	System.out.print("\nValues of array 'ABC' : ");
	for (int i=0; i<5; i++) {
		System.out.print(abc[i]+ " ");
	}
	
	// Multi-dimensional array.
	System.out.print("\n\n Multi-Dimensional Array\n");
	int [][] pq =new int[3][3];
	int numb=1;
	for(int i=0; i<3; i++) {
		for(int j=0; j<3;j++) {
			pq[i][j] = numb;
			++numb;
		}
	}
	for(int i=0;i<3;i++) {
		for (int j=0; j<3; j++) {
			System.out.print(pq[i][j] + " ");
		}
		System.out.println(" ");
	}
	
	// Functions in java 
	System.out.print("\n Functions in java \n");
	int num1 = 10;
	int num2 = 20;
	add(num1,num2);
	

	// Function with return value int,char,boolean,float,string,short,long,double,byte types
	System.out.println("\n Function with return value \n");
	Sample obj=new Sample();
	
	System.out.print(" Function with return value with int type \n");
	int Y=10;
	int X=20;
	int result=obj.integer(X,Y);
	System.out.println(result);
	
	System.out.println("\n Function with return value with char type \n" );
	char ac='s';
	char ca='k';
	char result2=obj.charcter(ac,ca);
	System.out.println(result2);
	
	System.out.println("\n Function with return value with byte type \n" );
	byte cb=1;
	byte bc=2;
	byte result3=obj.bite(cb,bc);
	System.out.println(result3);
	
	System.out.println("\n Function with return value with boolean type \n" );
	boolean cv=true;
	boolean vc=false;
	boolean result4=obj.boo(cv,vc);
	System.out.println(result4);
	
	System.out.println("\n Function with return value with float type \n" );
	float bv=12.5f;
	float vb=14.8f;
	float result6=obj.floatingpoint(bv,vb);
	System.out.println(result6);
	
	System.out.println("\n Function with return value with short type \n" );
	short nb=231;
	short bn=123;
	short result7=obj.shortinteger(nb,bn);
	System.out.println(result7);
	
	System.out.println("\n Function with return value with long type \n" );
	long am=1234l;
	long ma=4321l;
	long result8=obj.longinteger(am,ma);
	System.out.println(result8);
	
	System.out.println("\n Function with return value with string type \n" );
	String mn="Ram";
	String nm="Sita";
	String result9=obj.string(mn,nm);
	System.out.println(result9);
	
	System.out.println("\n Function with return value with double type \n" );
	double cn=421.9;
	double nc=124.8;
	double result10=obj.doublefloatingpoint(cn,nc);
	System.out.println(result10);

	// Swapping Values
	System.out.print("\n swapping value with static keyword \n");
	int xy =10;
	int yx =20;
	swapFunction(xy,yx);

	// Swapping Values 
	System.out.print("\n swapping value with static keyword \n");
	Sample obj1=new Sample();
	int yz =10;
	int zy =20;
	obj1.swapFunction1(yz,zy);
	
	////Method over- loading with static keyword
	System.out.println("\n Method over-loading with static keyword \n");
	int n1=10;
	int n2=20;
	int r1= 30;
	int area_rec=area(n1,n2);
	float area_circle = area(r1);
	System.out.println("\n Area of a Rectangle : "+area_rec);
	System.out.println("\n Area of a Circle : "+area_circle);
	
	}

	// Functions in java
	public static void add(int num1, int num2) {
		System.out.println("The value in the add method : ");
		System.out.print(num1+num2);
	}
	
	// Function with return value integer type
	public int integer(int num1,int num2) {
		int result=num1-num2;
		return result;
	}
	
	// Function with return value with char type
		public char charcter(char num1,char num2) {
			char result=(char) (num1&num2);
			return result;
		}
		 
		// Function with return value float type
		public float floatingpoint(float num1,float num2) {
			float result=num1+num2;
			return result;
		}
		
		// Function with return value byte type
		public byte bite(byte num1,byte num2) {
			byte result=(byte) (num1-num2);
			return result;
		}
		
		// Function with return value boolean type
		public boolean boo(boolean num1,boolean num2) {
			boolean result1=num1&&num2;
			return result1;	
		}
		
		// Function with return value short type
		public short shortinteger(short num1, short num2) {
			short result=(short) (num1+num2);
			return result;
		}
		
		// Function with return value long type
		public long longinteger(long num1,long num2) {
			long result=num1+num2;
			return result;
		}
		
		// Function with return value string type
		public String string(String num1,String num2) {
			String result=num1+num2;
			return result;
		}
		
		// Function with return value double type
		public double doublefloatingpoint(double num1,double num2) {
			double result=num1-num2;
			return result;
		}
	
		//Swapping Values with static key word
		public static void swapFunction(int a,int b) {
			System.out.println("Origina values, A :" +a+", B :"+b);
			int c=a;
			a=b;
			b=c;
			System.out.println("After Swapping, A :"+a+", B :"+b);
		}
		
		//Swapping Values without static key word
		public  void swapFunction1(int a,int b) {
			System.out.println("Origina values, A :" +a+", B :"+b);
			int c=a;
			a=b;
			b=c;
			System.out.println("After Swapping, A :"+a+", B :"+b);
		}
			
			//Method over- loading with static keyword
			public static int area(int n1,int n2) {
				int result= n1*n2;
				return result;
			}
			public static float area(int n1) {
				float result= 3.14f*n1*n1;
				return result;
			}
			
			
}
