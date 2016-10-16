package to.uk.gagandeepbali.java.datastructures.nodes;
/**
 * Purpose: Implementation of Generic Node ( an abstract class )
 *			as SimpleNode with only Generic data.
 * Author: Gagandeep Bali
 * Date: 15th Oct., 2016.
 */
public class SimpleNode < T > extends Node < T > {
	
	@Override
	public T getData () {
		return data;
	}
	
	@Override
	public void setData ( T data ) {
		this.data = data;
	}
	
	@Override
	public String toString () {
		return ( String.format ( "[ SimpleNode: {0} ]", super.toString () ) );
	}
} 