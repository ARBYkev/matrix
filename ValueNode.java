import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ValueNode implements Node {

	
		try {
	
			FileInputStream matrixA = new FileInputStream ("matrixA.dat");
			FileInputStream matrixB = new FileInputStream ("matrixB.dat");
	
	
			Scanner input = new Scanner (matrixA);
			Scanner input2 = new Scanner (matrixB);
	
	
	
	
			int row = input.nextInt();
			int colum = input.nextInt();
			int value = input.nextInt();
	
     
		}catch ( FileNotFoundException e){
    
			e.printStackTrace();
	

		}	

     
	}

