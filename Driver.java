import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {


		Scanner input;
		
		try {
			input = new Scanner ( new FileInputStream ("matrixA.dat"));
			
		    
		    
			while ( input.hasNextLine() )
			{
				System.out.println(input.nextLine());
				
				
				
				
			}	
				
			
			
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		
		
		

	}

}
