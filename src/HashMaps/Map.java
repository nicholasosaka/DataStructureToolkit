package HashMaps;

import java.util.ArrayList;

public class Map<K,V> {
	ArrayList<HashNode<K,V>> table = new ArrayList<>();
	int num = 10;
	int size;

	public Map(){
		for(int i = 0; i < num; i++){
			table.add(null);
		}
	}

	public int size(){
		return size;
	}

	public boolean isEmpty(){
		return size == 0;
	}
}