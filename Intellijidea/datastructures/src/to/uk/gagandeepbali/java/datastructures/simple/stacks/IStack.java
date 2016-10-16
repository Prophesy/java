package to.uk.gagandeepbali.java.datastructures.simple.stacks;
/**
 * Purpose: Interface for Stack Implementation.
 * Author: Gagandeep Bali
 * Date: 15th Oct., 2016.
 */
import to.uk.gagandeepbali.java.datastructures.simple.nodes.*;

public interface IStack {

    public boolean isEmptyStack ();
    public boolean isFullStack ();
    public boolean push ( char data );
    public char pop ();
    public int size ();
    public void display ();
}