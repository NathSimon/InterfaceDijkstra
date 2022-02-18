/**
 * Interface de la classe Previous.
 * 
 * @author Nathanael SIMON
 * 
 * @see Previous.java
 * 
 * @since TP06
 */

package Dijkstra;

import java.util.ArrayList;

public interface PreviousInterface {
	public void setValue (VertexInterface vertex, VertexInterface value);
	public VertexInterface getVertex(VertexInterface vertex);
	public boolean containsVertex(VertexInterface vertex);
}
