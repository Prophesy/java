package to.uk.gagandeepbali.java.datastructures.nodes;
/**
 * Purpose: Implementation of Generic Node ( an abstract class )
 *			as TreeNode having references to Left/Right Child.
 * Author: Gagandeep Bali
 * Date: 15th Oct., 2016.
 */
public class TreeNode < T > extends Node < T > {
	
	private Node < T > leftChild;
	private Node < T > rightChild;
	
	@Override
	public T getData () {
		return data;
	}
	
	@Override
	public void setData ( T data ) {
		this.data = data;
	}
	
	public Node < T > getLeftChild () {
		return leftChild;
	}
	
	public void setLeftChild ( Node < T > leftChild ) {
		this.leftChild = leftChild;
	}
	
	public Node < T > getRightChild () {
		return rightChild;
	}
	
	public void setRightChild ( Node < T > rightChild ) {
		this.rightChild = rightChild;
	}
	
	@Override
	public String toString () {
		return ( String.format ( 
		"[ TreeNode: Left-Child = {0} {1} Right-Child = {2} ]",
						leftChild, super.toString (), rightChild ) );
	}
} 