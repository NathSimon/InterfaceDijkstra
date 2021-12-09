package Dijkstra;

public interface PiInterface {
	int findMin(ASetInterface ASet);
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
