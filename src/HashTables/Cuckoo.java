package HashTables;

import java.util.ArrayList;

/*
	@author Nikko Osaka

	Implementation of Cuckoo Hashing (Pagh, et al. 2003)
	Simple dictionary with worst case constant lookup time

 */
public class Cuckoo<E> {

	//two tables for hashing
	ArrayList<E> T1 = new ArrayList<E>();
	ArrayList<E> T2 = new ArrayList<E>();

	//fields
	private int num = 10;
	private int size;

	public Cuckoo(){

	}
}
