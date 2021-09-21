package week3.day1.assignments;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S1="I am learning java? ";
		String S2="I am learning Java";
		
		if (S1.equals(S2))
		{
			System.out.println("They are same strings");
		}
		else
		{
			System.out.println("They are different strings");
		}
		String S3="Learning Java";
		String S4="learning java";
		
		if(S3.equalsIgnoreCase(S4))
		{
			System.out.println("S3 and S4 are same strings ignoring the case");
		}
	}

	
}
