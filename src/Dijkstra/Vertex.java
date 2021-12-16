package Dijkstra;

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
