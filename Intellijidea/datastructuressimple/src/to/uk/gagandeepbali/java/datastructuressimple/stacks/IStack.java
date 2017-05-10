package to.uk.gagandeepbali.java.datastructuressimple.stacks;

import to.uk.gagandeepbali.java.datastructuressimple.nodes.Node;

public interface IStack {
	
	boolean isEmptyStack ();
	void push ( Node node );
	Node pop ();
	int size ();
	void display ();
}
