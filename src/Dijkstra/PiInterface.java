package Dijkstra;

public interface PiInterface {
	//int findMin(ASetInterface ASet);
	public void setValue(VertexInterface vertex, int weight);
	public int getValue(VertexInterface vertex);

}
//	default int findMin(ASetInterface ASet) {
//		int min = Integer.MAX_VALUE;
//		int indexSommet = -1;
//		
//		for(int i = 0; i < ASet.size(); i++) {
//			if(ASet.get(i).getValue() < min) {
//				min = ASet.get(i).getValue();
//				indexSommet = i;
//			}
//		}
//		return indexSommet;
//	}
//}
