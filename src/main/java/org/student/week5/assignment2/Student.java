package org.student.week5.assignment2;

import org.department.week5.assignment2.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student name : Krishnaveni");
	}
	public void studentDept() {
		System.out.println("Student Department : B.Sc CS");
	}
	
	public void studentId() {
		System.out.println("Student ID : 1265");
	}
public static void main(String[] args) {
	Student studentDetail=new Student();
	studentDetail.collegeName();
	studentDetail.collegeCode();
	studentDetail.collegeRank();
	studentDetail.deptName();
	studentDetail.studentName();
	studentDetail.studentId();
	studentDetail.studentDept();
	
}	

}
