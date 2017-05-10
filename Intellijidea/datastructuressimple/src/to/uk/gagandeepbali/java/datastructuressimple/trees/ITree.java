package to.uk.gagandeepbali.java.datastructuressimple.trees;

import to.uk.gagandeepbali.java.datastructuressimple.nodes.TreeNode;

public interface ITree {
	
	void insert ( char data );
	int size ();
	void inorderRecursive ();
	void inorderIterative ();
	void levelorderTraversal ();
	void allPathsToLeaf ();
}
