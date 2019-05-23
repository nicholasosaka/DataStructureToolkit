public class LinkedQueue<E> {

	private E first;
	private E last;
	private int size;

	LinkedQueue(){
		first = null;
		last = null;
		size = 0;
	}

	public boolean isEmpty(){
		return first == null;
	}

	public int size(){
		return size;
	}
}