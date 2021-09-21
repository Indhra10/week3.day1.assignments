package week3.day1.assignments;

public class ReplaceChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String sentence="I am working with Java8";
            char[] senchar=sentence.toCharArray();
            
            for (int i=5;i<=8;i++)
            {
            	
            	System.out.print(senchar[i]);
            }
            
            System.out.println();
            
            for(int i=0;i<senchar.length;i++)
            {
            	
              for(int j=5;j<=8;j++) {
            	  
            	  senchar[j]='#';
              }
              System.out.print(senchar[i]);
             
            }
            
            
           
	}

}
