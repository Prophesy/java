package to.uk.gagandeepbali.java.datastructures;
/**
 * Purpose: Class having the main method for running Data-Structure example.
 * Author: Gagandeep Bali
 * Date: 15th Oct., 2016.
 */
import to.uk.gagandeepbali.java.datastructures.stacks.IStack;
import to.uk.gagandeepbali.java.datastructures.stacks.ArrayStack;
 
public class Main {
	
	private IStack stack;
	
	private void performTask () {
		stack = new ArrayStack ( 5 );
	}
	
	public static void main ( String [] args ) {
		new Main ().performTask ();
	}
} 