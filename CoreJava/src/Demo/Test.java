package Demo;

public class Test {

	public static void main(String[] args) {
		
		{
		 
		        int age = 35;
		        char gender = 'F'; // M - Male, F - Female
		        
		        if( age > 35 ) // outer if
		        {
		            if( gender == 'M' )    // LINE A
		            {
		                System.out.println("Man");
		            }
		            else
		            {
		                System.out.println("Woman");
		            }
		        }
		        else
		        {
		            if( gender == 'M' )    // LINE B
		            {
		                System.out.println("Boy");
		            }
		            else
		            {
		                System.out.println("Girl");
		            }
		        
		        }
		    
		    }
		}}