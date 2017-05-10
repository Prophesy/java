package to.uk.gagandeepbali.java.datastructuressimple.stacks;

import to.uk.gagandeepbali.java.datastructuressimple.nodes.Node;
import to.uk.gagandeepbali.java.datastructuressimple.nodes.NodeType;
import to.uk.gagandeepbali.java.datastructuressimple.nodes.SimpleNode;
import to.uk.gagandeepbali.java.datastructuressimple.nodes.TreeNode;
import to.uk.gagandeepbali.java.utility.Constant;

/**
 * Purpose: ArrayStack is a simple Stack implementation with Arrays.
 * Author: Gagandeep Bali
 * Date: 15th Oct., 2016.
 */

public class ArrayStack implements IStack {
	
	private Node [] stack;
	private final int capacity;
	private int top;
	
	public ArrayStack ( int capacity, NodeType nodeType ) {
		this.capacity = capacity;
		if ( nodeType == NodeType.SIMPLE_NODE ) {
			stack = new SimpleNode [ capacity ];
		} else if ( nodeType == NodeType.TREE_NODE ) {
			stack = new TreeNode [ capacity ];
		}
		top = -1;
	}
	
	public boolean isEmptyStack () {
		return ( top == -1 );
	}
	
	private boolean isFullStack () {
		return ( top == ( capacity - 1 ) );
	}
	
	@Override
	public void push ( Node node ) {
		if ( !isFullStack () ) {
			++top;
			stack [ top ] = node;
		} else {
			System.out.println ( "STACK is Full\n" );
		}
	}
	
	@Override
	public Node pop () {
		Node node;
		if ( !isEmptyStack () ) {
			node = stack [ top ];
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
			System.out.print ( stack [ i ] + " " );
		}
		// Arrays.toString ( stack );
		System.out.println ( Constant.NEWLINE + Constant.BORDER );
	}
}
