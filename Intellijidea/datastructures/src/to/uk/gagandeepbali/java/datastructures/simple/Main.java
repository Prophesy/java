package to.uk.gagandeepbali.java.datastructures.simple;
/**
 * Purpose: Class having the main method for running Data-Structure example.
 * Author: Gagandeep Bali
 * Date: 15th Oct., 2016.
 */
import to.uk.gagandeepbali.java.datastructures.simple.stacks.IStack;
import to.uk.gagandeepbali.java.datastructures.simple.stacks.ArrayStack;

class Main {

    private void performTask () {
        IStack < Character > stack = new ArrayStack < Character > ( 5 );
        stack.push ( 'a' );
        System.out.println ( "SIZE: " + stack.size () );
        stack.push ( 'b' );
        System.out.println ( "SIZE: " + stack.size () );
        stack.display ();
        System.out.println ( "POP: " + stack.pop () );
        System.out.println ( "SIZE: " + stack.size () );
        stack.display ();
    }

    public static void main ( String [] args ) {
        new Main ().performTask ();
    }
}
