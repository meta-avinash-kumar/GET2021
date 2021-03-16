package myqueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Queue Implementation
 * @author avinash.kumar_metacu
 *
 */
public class ListQueue<T> implements MyQueue<T> {

	private final int HEAD = 0; 
	private final int MAX = 100;
	private final List<T> dataArr;
	private int size;

	/**
	 * Constructor
	 */
	public ListQueue() {
		this.dataArr = new ArrayList<T>(MAX);
		this.size = -1;
	}

	/**
	 * @return true if mystack empty, false otherwise
	 */
	@Override
	public boolean isEmpty() {
		return this.size<0;
	}

	/**
	 * @param o object to push into mystack
	 * @return true if added to mystack, false otherwise
	 */
	@Override
	public boolean add(T o) {
		if(size<MAX){
			dataArr.add(o);
			this.size++;
			return true;
		}
		return false;
	}

	/**
	 * remove and retuns object from size of mystack
	 * @return value at size of mystack
	 */
	@Override
	public T poll() {
		T temp = null;
		if(this.size>=0){
			temp = dataArr.get(HEAD);
			dataArr.remove(HEAD);
			this.size--;
		}
		return temp;
	}

	/**
	 * @return value at size of mystack
	 */
	@Override
	public T peek() {
		if(size<HEAD){
			return null;
		}
		return dataArr.get(HEAD);
	}

	/**
	 * Returns the number of elements in this queue
	 * @return size
	 */
	public int size(){
		return this.size;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return Arrays.toString(dataArr.toArray());
	}
	
	//public void sortBy()
}
