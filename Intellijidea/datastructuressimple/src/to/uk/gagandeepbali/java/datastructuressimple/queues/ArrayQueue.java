package to.uk.gagandeepbali.java.datastructuressimple.queues;

import to.uk.gagandeepbali.java.datastructuressimple.nodes.Node;
import to.uk.gagandeepbali.java.datastructuressimple.nodes.NodeType;
import to.uk.gagandeepbali.java.datastructuressimple.nodes.SimpleNode;
import to.uk.gagandeepbali.java.datastructuressimple.nodes.TreeNode;

/**
 * Created by nipal_000 on 10/27/2016.
 */
public class ArrayQueue implements IQueue {
	
	private Node [] queue;
	private int capacity;
	private int front;
	private int rear;
	
	public ArrayQueue ( int capacity, NodeType nodeType ) {
		this.capacity = capacity;
		switch ( nodeType ) {
			case SIMPLE_NODE:
				queue = new SimpleNode [ capacity ];
				break;
			case TREE_NODE:
				queue = new TreeNode [ capacity ];
				break;
		}
		front = rear = -1;
	}
	
	@Override
	public boolean isEmptyQueue () {
		return ( front == -1 );
	}
	
	private boolean isFullQueue () {
		return ( ( rear + 1 ) % capacity == front );
	}
	
	@Override
	public void enqueue ( Node node ) {
		if ( !isFullQueue () ) {
			rear = ( rear + 1 ) % capacity;
			queue [ rear ] = node;
			if ( front == -1 ) {
				front = rear;
			}
		} else {
			System.out.println ( "Queue is full\nUnable to add: " + node );
		}
	}
	
	@Override
	public Node dequeue () {
		Node node;
		if ( !isEmptyQueue () ) {
			node = queue [ front ];
			if ( front == rear ) {
				front = rear = -1;
			} else {
				front = ( front + 1 ) % capacity;
			}
			return node;
		}
		return null;
	}
	
	@Override
	public int size () {
		return ( front - rear + 1 );
	}
	
	@Override
	public void display () {
		System.out.println ( "QUEUE CONTENT" );
		int i = front;
		if ( !isEmptyQueue () ) {
			do {
				i %= capacity;
				System.out.println ( queue [ i ] );
			} while ( i++ != rear );
		}
	}
}
