package to.uk.gagandeepbali.java.datastructures.simple.nodes;
/**
 * Purpose: Implementation of Generic Node ( an abstract class )
 *			as SimpleNode with only Generic data.
 * Author: Gagandeep Bali
 * Date: 15th Oct., 2016.
 */
public class SimpleNode extends Node {
	
	@Override
	public char getData () {
		return data;
	}
	
	@Override
	public void setData ( char data ) {
		this.data = data;
	}
	
	@Override
	public String toString () {
		return ( String.format ( "[ SimpleNode: {1} ]", data ) );
	}
} 