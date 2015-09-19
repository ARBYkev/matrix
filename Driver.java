import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {


		
		
		try {
			Scanner input = new Scanner ( new FileInputStream ("matrixA.dat"));
			Scanner input2 = new Scanner ( new FileInputStream ("matrixB.dat"));
		    
		    
			while ( input.hasNextLine() )
			{
				System.out.println(input.nextLine());
				
				
				
				
			}	
			input.close();
			System.out.println(" ");
			
			while ( input2.hasNextLine() )
			{
				System.out.println(input2.nextLine());
									
				
			}	
			
			input2.close();
			
			
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		
		
		

	}

}
