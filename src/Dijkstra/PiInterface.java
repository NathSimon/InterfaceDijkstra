/**
 * Interface de la classe Pi.
 * 
 * @author Nathanael SIMON
 * 
 * @see Pi.java
 * 
 * @since TP06
 */

package Dijkstra;

public interface PiInterface {
	public void setValue(VertexInterface vertex, int weight);
	public int getValue(VertexInterface vertex);

}