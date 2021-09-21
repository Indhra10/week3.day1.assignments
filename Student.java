package week3.day1.Student;

import week3.day1.org.Department.Department;

public class Student extends Department{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String StudentName,  StudentDepartment, StudentId;
		
		Student st=new Student();
		
		
		StudentName="Indhra";
		StudentId="IS18392";
	 st.deptName();
	 st.deptName("IT");
	st.deptName(StudentName,"Mechanical", "Anjalai ammal");	
	
	st.collegeCode();
	st.collegeName();
	st.collegeRank();

	}

}
