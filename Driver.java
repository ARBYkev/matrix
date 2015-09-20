import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {


		
		
		try {
			
			FileInputStream matrixA = new FileInputStream ("matrixA.dat");
			FileInputStream matrixB = new FileInputStream ("matrixB.dat");
			
			Scanner input = new Scanner ( matrixA );
			Scanner input2 = new Scanner ( matrixB);
		    
			int matA[][] = new int[input.nextInt()][input.nextInt()];
		    
			
		
			
			
			
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		

	}

}
