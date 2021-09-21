package week3.day1.org.Department;

import week3.day1.org.College.College;

public class Department extends College {
	String DepartmentName="CSC";
	public void deptName( )
	{
		System.out.println("The Department name is " + DepartmentName);
	}
	
	public void deptName(String S)
	{
		System.out.println("The Department name is " + S );
	}
	public void deptName(String s1,String s2,String s3)
	{
		
		System.out.println("The student " +s1);
		System.out.print(" is Studying in the Department " +s2);
		System.out.print("in the college named " +s3);
		
	}
}
