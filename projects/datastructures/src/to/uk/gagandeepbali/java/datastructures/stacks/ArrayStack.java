package to.uk.gagandeepbali.java.datastructures.stacks;
/**
 * Purpose: ArrayStack is a simple Stack implementation with Arrays.
 * Author: Gagandeep Bali
 * Date: 15th Oct., 2016.
 */
import to.uk.gagandeepbali.java.datastructures.nodes.*;
 
public class ArrayStack < T > implements IStack < T > {
	
	private Node < T > [] simpleNodes;
	private int capacity;
	private int top;
	
	public ArrayStack ( int capacity ) {
		this.capacity = capacity;
		simpleNodes = ( SimpleNode < T > [] ) new Object [ capacity ];
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
	public boolean push ( Node < T > node ) {
		return false;
	}
	
	@Override
	public Node < T > pop () {
		Node < T > data = null;
		
		return data;
	}
	
	@Override
	public int size () {
		return ( top + 1 );
	}
	
	@Override
	public void display () {
		
	}
} 