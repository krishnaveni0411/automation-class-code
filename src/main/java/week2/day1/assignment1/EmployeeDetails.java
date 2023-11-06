package week2.day1.assignment1;

public class EmployeeDetails {
	public void printEmployeeName(String empName, int empId) {
		System.out.println("\nEmployee Name : "+empName);
		System.out.println("Employee ID :"+empId);
	}
public void getEmployeeAddress(String empAddress) {
	System.out.println("Employee Address :"+empAddress);
}
public double printEmployeeSalary(double empSalary) {
	double get=empSalary;
	return get;
}
public long printEmployeeMobileNumber(long mobNum) {
	long get= mobNum;
	return get;
}
public static void main(String[] args) {
	System.out.println("Employee Details");
	EmployeeDetails empdet=new EmployeeDetails();
	empdet.printEmployeeName("RAM", 4023);
	empdet.getEmployeeAddress("chennai");
	double getSalary=empdet.printEmployeeSalary(96400.9553);
	System.out.println("Employee Salary :"+getSalary);
	long getPhoneNumber=empdet.printEmployeeMobileNumber(9874561230l);
	System.out.println("Employee Mobile Number :"+getPhoneNumber);
	empdet.printEmployeeName("Sita", 4023);
	empdet.getEmployeeAddress("Tirupur");
	double getSalary1=empdet.printEmployeeSalary(95400.9553);
	System.out.println("Employee Salary :"+getSalary1);
	long getPhoneNumber1=empdet.printEmployeeMobileNumber(9856321477l);
	System.out.println("Employee Mobile Number :"+getPhoneNumber1);

}
}
