package myqueue;
/**
 * myqueue interface
 * @author avinash.kumar_metacu
 *
 */
public interface MyQueue<T> {
	/**
	 * Check wether Queue is empty or not
	 * @return boolean
	 */
	boolean isEmpty();
	
	/**
	 * Add an object of type T into the top of this queue
	 * @param o the object to be added in queue
	 * @return boolean whether object added or not
	 */
	boolean add(T o);

	/**
	 * Remove an object of type T from the top of this queue &
	 * @return the object of type T from top of this queue
	 */
	T poll();
	
	/**
	 * return item from available at top of 
	 * the queue without removing it
	 * @return the object of type T from top of this queue
	 */
	T peek();
}
