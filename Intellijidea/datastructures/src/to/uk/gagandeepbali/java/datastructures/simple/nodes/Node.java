package to.uk.gagandeepbali.java.datastructures.simple.nodes;
/**
 * Purpose: An Abstract Node ( An abstract class )
 * Author: Gagandeep Bali
 * Date: 15th Oct., 2016
 */
public abstract class Node < T > {

    /**
     * T represents the type of data in Node.
     * Access of T is Package Private ( default ).
     */
    T data;

    public abstract T getData ();
    public abstract void setData ( T data );

    @Override
    public String toString () {
        return ( String.format ( "%s", data ) );
    }
}