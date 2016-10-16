package to.uk.gagandeepbali.java.datastructures.nodes;
/**
 * Purpose: A Generic Node ( An abstract class )
 * Author: Gagandeep Bali
 * Date: 15th Oct., 2016
 */
public abstract class Node < T > {
	
	protected T data;
	
	public abstract T getData ();
	public abstract void setData ( T data );
	
	@Override
	public String toString () {
		return ( String.format ( "[ Node: Data = {0} ]", data ) );
	}
} 