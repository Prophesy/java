package to.uk.gagandeepbali.java.datastructuressimple.nodes;

/**
 * Purpose: An Abstract Node ( An abstract class )
 * Author: Gagandeep Bali
 * Date: 15th Oct., 2016
 */
public abstract class Node {
	
	char data;
	
	public abstract char getData ();
	public abstract void setData ( char data );
	
	@Override
	public String toString () {
		return ( String.format ( "%s", data ) );
	}
}
