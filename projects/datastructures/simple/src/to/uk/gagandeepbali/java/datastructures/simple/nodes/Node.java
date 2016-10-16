package to.uk.gagandeepbali.java.datastructures.simple.nodes;
/**
 * Purpose: An Abstract Node ( An abstract class )
 * Author: Gagandeep Bali
 * Date: 15th Oct., 2016
 */
public abstract class Node {
	
	protected char data;
	
	public abstract char getData ();
	public abstract void setData ( char data );
	
	@Override
	public String toString () {
		return ( String.format ( "{0}", data ) );
	}
} 