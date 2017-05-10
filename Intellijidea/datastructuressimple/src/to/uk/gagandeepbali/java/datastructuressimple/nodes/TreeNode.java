package to.uk.gagandeepbali.java.datastructuressimple.nodes;

import to.uk.gagandeepbali.java.utility.Constant;

/**
 * Created by nipal_000 on 10/23/2016.
 */
public class TreeNode extends Node {
	
	private TreeNode leftChild;
	private TreeNode rightChild;
	
	@Override
	public char getData () {
		return data;
	}
	
	@Override
	public void setData ( char data ) {
		this.data = data;
	}
	
	public TreeNode getLeftChild () {
		return leftChild;
	}
	
	public void setLeftChild ( TreeNode leftChild ) {
		this.leftChild = leftChild;
	}
	public TreeNode getRightChild () {
		return rightChild;
	}
	
	public void setRightChild ( TreeNode rightChild ) {
		this.rightChild = rightChild;
	}
	
	@Override
	public String toString () {
		String classString = "LeftChild: " + leftChild;
		classString += " Data: " + super.toString();
		classString += " RightChild: " + rightChild;
		
		return String.format ( "[ TreeNode: %s ]" + Constant.NEWLINE, classString );
	}
}

