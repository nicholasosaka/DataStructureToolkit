package HashTables;

import java.util.Hashtable;

/*
	@author Nikko Osaka

	Implementation of Cuckoo Hashing (Pagh, et al. 2003)
	Simple dictionary with worst case constant lookup time

 */
public class Cuckoo<K, V> {

	//two tables for hashing
	Hashtable<K, V> T1;
	Hashtable<K, V> T2;

	//fields
	private int r = 10;
	private int size;

	public Cuckoo(){
		T1 = new Hashtable<>();
		T2 = new Hashtable<>();

	}

	public boolean lookup(K key){
		return T1.get(key) == key || T2.get(key) == key;
	}

}
