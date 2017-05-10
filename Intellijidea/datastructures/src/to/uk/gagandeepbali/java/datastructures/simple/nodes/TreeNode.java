package to.uk.gagandeepbali.java.datastructures.simple.nodes;

/**
 * Created by nipal_000 on 10/23/2016.
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
        String classString = "LeftChild: " + leftChild;
        classString += " Data: " + super.toString();
        classString += " RightChild: " + rightChild;

        return String.format ( "{ TreeNode: Ts ]\n", classString );
    }
}
