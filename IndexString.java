package week3.day1.assignments;

public class IndexString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "Java Exercise";
		char[] textarray= text.toCharArray();
		
		for (int i=0;i<textarray.length;i++)
		{
			if (textarray[i]== 'E')
			{
				System.out.println("The position of E is " +(i+1));
							}
			if (textarray[i]=='s')
			{
				System.out.println("The position of s is" +(i+1));
			}

		}
		

	}

}
