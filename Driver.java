import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {


		Scanner input;
		
		try {
			input = new Scanner ( new File ("matrixA.dat"));
		
			while ( input.hasNextInt() )
			{
				System.out.println(input.nextInt());
				
				
			}	
				
			
			
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		
		
		

	}

}
