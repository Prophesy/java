package to.uk.gagandeepbali.java.datastructures.simple.stacks;
/**
 * Purpose: ArrayStack is a simple Stack implementation with Arrays.
 * Author: Gagandeep Bali
 * Date: 15th Oct., 2016.
 */
import java.util.ArrayList;
import java.util.List;

import to.uk.gagandeepbali.java.datastructures.simple.nodes.*;
import to.uk.gagandeepbali.java.datastructures.simple.utility.*;

public class ArrayStack < T > implements IStack < T > {

    private final List < Node < T > > stack;
    private final int capacity;
    private int top;

    public ArrayStack ( int capacity ) {
        this.capacity = capacity;
        stack = new ArrayList < Node < T > > ( capacity );
        top = -1;
    }

    private boolean isEmptyStack () {
        return ( top == -1 );
    }

    private boolean isFullStack () {
        return ( top == ( capacity - 1 ) );
    }

    @Override
    public void push ( T data ) {
        if ( !isFullStack () ) {
            Node < T > node = new SimpleNode < T > ();
            node.setData ( data );
            ++top;
            stack.add ( top, node );
        } else {
	        System.out.println ( "STACK is Full\n" );
        }
    }

    @Override
    public Node < T > pop () {
        Node < T > node;
        if ( !isEmptyStack () ) {
            node = stack.get ( top );
            --top;
            return node;
        }
        return null;
    }

    @Override
    public int size () {
        return ( top + 1 );
    }

    @Override
    public void display () {
        System.out.println ( Constant.BORDER );
        System.out.println ( "STACK" );
        System.out.println ( Constant.BORDER );
        for ( int i = 0; i <= top; ++i ) {
            System.out.print ( stack.get ( i ) + " " );
        }
        // Arrays.toString ( stack );
        System.out.println ( Constant.NEWLINE + Constant.BORDER );
    }
}