package to.uk.gagandeepbali.java.datastructures.stacks;
/**
 * Purpose: Interface for Stack Implementation.
 * Author: Gagandeep Bali
 * Date: 15th Oct., 2016.
 */
import to.uk.gagandeepbali.java.datastructures.nodes.*;
 
public interface IStack < T > {
	
	public boolean isEmptyStack ();
	public boolean isFullStack ();
	public boolean push ( Node < T > node );
	public Node < T > pop ();
	public int size ();
	public void display ();
} 