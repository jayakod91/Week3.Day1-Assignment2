package org.Student;

import org.college.College;
import org.department.Department;

public class Student {
	
	public void studentName() {
		System.out.println("Jaya");
	}
	public void studentID() {
		System.out.println("ID 00120");
	}
	public void studentDepartment() {
		System.out.println("Depatment ISM ");
	}
	public static void main1(String[] args) {
		College college = new College();
		Department department = new Department();
		Student stud = new Student();
		college.collegeCode();
		college.collegeName();
		college.collegeRank();
		department.deptName();
		stud.studentDepartment();
		stud.studentID();
		stud.studentName();
	}
}
