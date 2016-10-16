package to.uk.gagandeepbali.java.datastructures.simple;
/**
 * Purpose: Class having the main method for running Data-Structure example.
 * Author: Gagandeep Bali
 * Date: 15th Oct., 2016.
 */
import to.uk.gagandeepbali.java.datastructures.simple.stacks.IStack;
import to.uk.gagandeepbali.java.datastructures.simple.stacks.ArrayStack;
 
public class Main {
	
	private IStack stack;
	
	private void performTask () {
		stack = new ArrayStack ( 5 );
		stack.push ( 'a' );
		stack.push ( 'b' );
		stack.display ();
		stack.pop ();
		stack.display ();
	}
	
	public static void main ( String [] args ) {
		new Main ().performTask ();
	}
} 