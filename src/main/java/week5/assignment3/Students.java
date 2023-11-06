package week5.assignment3;

public class Students {
	public void getStudentInfo(int id)
 {
		System.out.println("Student ID : " + id);
	}
	public void getStudentInfo(int id, String name)
 {
		System.out.println("Student Name : " +name + "  Student ID : " +id);
	}
	public void getStudentInfo(String email ,long phoneNumber) {
		System.out.println("Student E-Mail :" + email + "   Student MobileNumber :" +phoneNumber );
	}
	
	
	public static void main(String[] args) {
		Students details=new Students();
		details.getStudentInfo(1045, "kumar");
		details.getStudentInfo(1045);
		details.getStudentInfo("kumar12@gmail.com", 9685741023l);
		
	}
}
