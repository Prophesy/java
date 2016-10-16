package to.uk.gagandeepbali.java.datastructures.simple.stacks;
/**
 * Purpose: ArrayStack is a simple Stack implementation with Arrays.
 * Author: Gagandeep Bali
 * Date: 15th Oct., 2016.
 */
import java.util.Arrays;
 
import to.uk.gagandeepbali.java.datastructures.simple.nodes.*;
import to.uk.gagandeepbali.java.datastructures.simple.utility.*;
 
public class ArrayStack implements IStack {
	
	private Node [] stack;
	private int capacity;
	private int top;
	
	public ArrayStack ( int capacity ) {
		this.capacity = capacity;
		stack = new SimpleNode [ capacity ];
		top = -1;
	}
	
	@Override
	public boolean isEmptyStack () {
		return ( top == -1 );
	}
	
	@Override
	public boolean isFullStack () {
		return ( top == ( capacity - 1 ) );
	}
	
	@Override
	public boolean push ( char data ) {
		if ( !isFullStack () ) {
			Node node = new SimpleNode ();
			node.setData ( data );
			++top;
			stack [ top ] = node;
			return true;
		}
		return false;
	}
	
	@Override
	public char pop () {
		Node node = null;
		if ( !isEmptyStack () ) {
			node = stack [ top ];
			--top;
			return node.getData ();
		}
		return '\0';
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
			System.out.print ( stack [ i ] + " " );
		}
		// Arrays.toString ( stack );
		System.out.println ( Constant.NEWLINE + Constant.BORDER );
	}
} 