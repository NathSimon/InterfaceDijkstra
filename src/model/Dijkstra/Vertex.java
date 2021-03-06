/**
 * Classe des vertex. Permet l'assiociation d'un numéro a chaque vertex.
 * 
 * @author Nathanael SIMON
 * 
 * @see Dijkstra.java
 * 
 * @since TP09
 */

package model.Dijkstra;

public class Vertex implements VertexInterface {

	private int vertexNumber;
	
	public Vertex(int vertexNumber) {
		this.vertexNumber = vertexNumber;
	}
	
	public void setVertexNumber(int number) {
		vertexNumber = number;
	}
	
	public int getVertexNumber() {
		return vertexNumber;
	}

	public String getLabel() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
