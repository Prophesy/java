package to.uk.gagandeepbali.java.datastructuressimple.trees;

import to.uk.gagandeepbali.java.datastructuressimple.nodes.NodeType;
import to.uk.gagandeepbali.java.datastructuressimple.nodes.TreeNode;
import to.uk.gagandeepbali.java.datastructuressimple.queues.ArrayQueue;
import to.uk.gagandeepbali.java.datastructuressimple.queues.IQueue;
import to.uk.gagandeepbali.java.datastructuressimple.stacks.ArrayStack;
import to.uk.gagandeepbali.java.datastructuressimple.stacks.IStack;

public class BinaryTree implements ITree {
	
	private IStack stack;
	private TreeNode root;
	private TreeNode mirrorRoot;
	
	@Override
	public void insert ( char data ) {
		TreeNode treeNode = createTreeNode ( data );
		if ( root == null ) {
			root = treeNode;
		} else {
			TreeNode currentNode = root;
			TreeNode previousNode = root;
			while ( currentNode != null ) {
				if ( data < currentNode.getData () ) {
					previousNode = currentNode;
					currentNode =  currentNode.getLeftChild ();
				} else if ( data >= currentNode.getData () ) {
					previousNode = currentNode;
					currentNode = currentNode.getRightChild ();
				}
			}
			currentNode = previousNode;
			if ( data < currentNode.getData () ) {
				currentNode.setLeftChild ( treeNode );
			} else if ( data >= currentNode.getData () ) {
				currentNode.setRightChild ( treeNode );
			}
		}
	}
	
	@Override
	public int size () {
		TreeNode currentNode = root;
		return size ( currentNode );
	}
	
	private int size ( TreeNode root ) {
		int totalNodes = 0;
		if ( root == null ) {
			return totalNodes;
		}
		totalNodes = size ( root.getLeftChild () ) + 1 + size ( root.getRightChild () );
		return totalNodes;
	}
	
	private TreeNode createTreeNode ( char data ) {
		TreeNode treeNode = new TreeNode ();
		treeNode.setLeftChild ( null );
		treeNode.setData ( data );
		treeNode.setRightChild ( null );
		
		return treeNode;
	}
	
	@Override
	public void inorderRecursive () {
		System.out.println ( "INORDER RECURSIVE" );
		inorderRecursive ( root );
	}
	
	private void inorderRecursive ( TreeNode root ) {
		if ( root == null ) {
			return;
		}
		inorderRecursive ( root.getLeftChild () );
		System.out.println ( root );
		inorderRecursive ( root.getRightChild () );
	}
	
	@Override
	public void inorderIterative () {
		System.out.println ( "INORDER ITERATIVE" );
		inorderIterative ( root );
	}
	
	private void inorderIterative ( TreeNode root ) {
		TreeNode currentNode = root;
		IStack stack = new ArrayStack ( 5, NodeType.TREE_NODE );
		while ( true ) {
			while ( currentNode != null ) {
				stack.push ( currentNode );
				currentNode = currentNode.getLeftChild ();
			}
			if ( stack.isEmptyStack () ) {
				break;
			}
			currentNode = ( TreeNode ) stack.pop ();
			System.out.println ( currentNode );
			currentNode = currentNode.getRightChild ();
		}
	}
	
	@Override
	public void levelorderTraversal () {
		System.out.println ( "LEVELORDER TRAVERSAL" );
		levelorderTraversal ( root );
	}
	
	private void levelorderTraversal ( TreeNode root ) {
		TreeNode currentNode = root;
		if ( currentNode != null ) {
			IQueue queue = new ArrayQueue ( 5, NodeType.TREE_NODE );
			queue.enqueue ( currentNode );
			while ( !queue.isEmptyQueue () ) {
				currentNode = ( TreeNode ) queue.dequeue ();
				System.out.println ( currentNode );
				TreeNode child = currentNode.getLeftChild ();
				if ( child != null ) {
					queue.enqueue ( child );
				}
				child = currentNode.getRightChild ();
				if ( child != null ) {
					queue.enqueue ( child );
				}
			}
		}
	}
	
	@Override
	public void allPathsToLeaf () {
		System.out.println ( "ALL PATHS FROM ROOT TO LEAF NODES: \n" );
		stack = new ArrayStack ( 5, NodeType.TREE_NODE );
		allPathsToLeaf ( root );
	}
	
	private void allPathsToLeaf ( TreeNode root ) {
		if ( root == null ) {
			return;
		}
		stack.push ( root );
		allPathsToLeaf ( root.getLeftChild () );
		allPathsToLeaf ( root.getRightChild () );
		if ( root.getLeftChild () == null && root.getRightChild () == null ) {
			stack.display ();
		}
		stack.pop ();
	}
	
	public void getMirrorImage () {
		getMirrorImage ( root );
	}
	
	private void getMirrorImage ( TreeNode root ) {
		System.out.println ( "MIRROR IMAGE" );
		TreeNode currentNode = root;
		TreeNode previousNode = null;
		IStack stack = new ArrayStack ( 5, NodeType.TREE_NODE );
		while ( true ) {
			while ( currentNode != null ) {
				stack.push ( currentNode );
				previousNode = currentNode;
				currentNode = currentNode.getLeftChild ();
				createMirroredTree ( previousNode, currentNode, true );
			}
			if ( stack.isEmptyStack () ) {
				break;
			}
			currentNode = ( TreeNode ) stack.pop ();
			previousNode = currentNode;
			currentNode = currentNode.getRightChild ();
			createMirroredTree ( previousNode, currentNode, false );
		}
		
		System.out.println ( "MIRROR IN ORDER TRAVERSAL" );
		inorderIterative ( mirrorRoot );
	}
	
	private void createMirroredTree ( TreeNode previousNode, TreeNode currentNode, boolean isLeftChild ) {
		if ( mirrorRoot == null ) {
			mirrorRoot = createTreeNode ( currentNode.getData () );
		} else {
			TreeNode tempNode = mirrorRoot;
			IStack stack = new ArrayStack ( 5, NodeType.TREE_NODE );
			boolean isPresent = false;
			while ( true ) {
				while ( tempNode != null ) {
					stack.push ( tempNode );
					tempNode = tempNode.getLeftChild ();
				}
				if ( stack.isEmptyStack () ) {
					break;
				}
				tempNode = ( TreeNode ) stack.pop ();
				if ( currentNode != null && ( tempNode.getData () == previousNode.getData () ) ) {
					if ( isLeftChild ) {
//						System.out.println ( "PREVIOUS NODE: " + previousNode + " CURRENT NODE: " + currentNode + " TEMP NODE: " + tempNode );
						tempNode.setRightChild ( createTreeNode ( currentNode.getData () ) );
					} else {
						tempNode.setLeftChild ( createTreeNode ( currentNode.getData () ) );
					}
					break;
				}
				tempNode = tempNode.getRightChild ();
			}
		}
	}
	
	public void convertToMirror () {
		convertToMirror ( root );
	}
	
	private void convertToMirror ( TreeNode currentNode ) {
		if ( currentNode == null ) {
			return;
		}
		TreeNode temp = currentNode.getLeftChild ();
		currentNode.setLeftChild ( currentNode.getRightChild () );
		currentNode.setRightChild ( temp );
		
		convertToMirror ( currentNode.getLeftChild () );
		convertToMirror ( currentNode.getRightChild () );
	}
}
