package to.uk.gagandeepbali.java.datastructures.simple.stacks;
/**
 * Purpose: Interface for Stack Implementation.
 * Author: Gagandeep Bali
 * Date: 15th Oct., 2016.
 */
import to.uk.gagandeepbali.java.datastructures.simple.nodes.*;

public interface IStack < T > {
	
	void push ( T data );
    Node < T > pop ();
    int size ();
    void display ();
}