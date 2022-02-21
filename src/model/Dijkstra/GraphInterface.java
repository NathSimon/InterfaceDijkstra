/**
 * Interface de la classe Graph.
 * 
 * @author Nathanael SIMON
 * 
 * @see Graph.java
 * 
 * @since TP06
 */


package model.Dijkstra;

import java.util.ArrayList;

public interface GraphInterface {
	public ArrayList<VertexInterface> getAllVertices();
	public ArrayList<VertexInterface> getSuccessors(VertexInterface vertex);
	public int getWeight(VertexInterface src,VertexInterface dst);
}