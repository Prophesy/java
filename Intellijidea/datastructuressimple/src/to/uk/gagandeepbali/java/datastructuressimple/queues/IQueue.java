package to.uk.gagandeepbali.java.datastructuressimple.queues;

import to.uk.gagandeepbali.java.datastructuressimple.nodes.Node;

/**
 * Created by nipal_000 on 10/27/2016.
 */
public interface IQueue {
	
	boolean isEmptyQueue ();
	void enqueue ( Node node );
	Node dequeue ();
	int size ();
	void display ();
}
