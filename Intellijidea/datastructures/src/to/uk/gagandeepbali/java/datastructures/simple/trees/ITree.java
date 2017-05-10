package to.uk.gagandeepbali.java.datastructures.simple.trees;

import to.uk.gagandeepbali.java.datastructures.simple.nodes.Node;

/**
 * Created by nipal_000 on 10/23/2016.
 */
public interface ITree < T > {

    void insert ( Node < T > node );
    void inorderRecursive ( Node< T > root );
    void inorderIterative ( Node < T > root );
}
