package to.uk.gagandeepbali.java;

import to.uk.gagandeepbali.java.datastructuressimple.nodes.NodeType;
import to.uk.gagandeepbali.java.datastructuressimple.nodes.SimpleNode;
import to.uk.gagandeepbali.java.datastructuressimple.queues.ArrayQueue;
import to.uk.gagandeepbali.java.datastructuressimple.queues.IQueue;
import to.uk.gagandeepbali.java.datastructuressimple.stacks.ArrayStack;
import to.uk.gagandeepbali.java.datastructuressimple.stacks.IStack;
import to.uk.gagandeepbali.java.datastructuressimple.trees.BinaryTree;
import to.uk.gagandeepbali.java.datastructuressimple.trees.ITree;

public class Main {
	
	private void performTask () {
		IStack stack = new ArrayStack ( 5, NodeType.SIMPLE_NODE );
		stack.push ( new SimpleNode ( 'a' ) );
		System.out.println ( "SIZE: " + stack.size () );
		stack.push ( new SimpleNode ( 'b' ) );
		System.out.println ( "SIZE: " + stack.size () );
		stack.display ();
		System.out.println ( "POP: " + stack.pop () );
		System.out.println ( "SIZE: " + stack.size () );
		stack.display ();
		
		ITree tree = new BinaryTree ();
		tree.insert ( 'm' );
		tree.insert ( 'j' );
		tree.insert ( 'o' );
		tree.insert ( 'n' );
		tree.insert ( 'l' );
		tree.insert ( 'a' );
		tree.allPathsToLeaf ();
		System.out.println ( "TOTAL NODES: " + tree.size () );
		tree.inorderRecursive ();
		tree.inorderIterative ();
		tree.levelorderTraversal ();
//		( ( BinaryTree ) tree ).getMirrorImage ();
		( ( BinaryTree ) tree ).convertToMirror ();
		tree.levelorderTraversal ();
		
		IQueue queue = new ArrayQueue ( 5, NodeType.SIMPLE_NODE );
		queue.enqueue ( new SimpleNode ( 'a' ) );
		System.out.println ( "SIZE: " + queue.size () );
		queue.enqueue ( new SimpleNode ( 'b' ) );
		System.out.println ( "SIZE: " + queue.size () );
		queue.enqueue ( new SimpleNode ( 'c' ) );
		System.out.println ( "SIZE: " + queue.size () );
		queue.display ();
		queue.dequeue ();
		System.out.println ( "SIZE: " + queue.size () );
		queue.dequeue ();
		System.out.println ( "SIZE: " + queue.size () );
		queue.display ();
	}
	
	public static void main ( String [] args ) {
		new Main ().performTask ();
	}
}
