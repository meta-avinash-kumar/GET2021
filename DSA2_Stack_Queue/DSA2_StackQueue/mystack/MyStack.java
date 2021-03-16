package mystack;
/**
 * MyStack interface
 * @author avinash.kumar_metacu
 *
 */
public interface MyStack<T> {
	/**
	 * Check wether Stack is empty or not
	 * @return boolean
	 */
	boolean isEmpty();
	
	/**
	 * Add an object of type T into the top of this mystack
	 * @param o the object to be pushed in mystack
	 * @return boolean whether object pushed or not
	 * @throws StackOverflowError if mystack is full
	 */
	boolean push(T o);

	/**
	 * Remove an object of type T from the top of this mystack &
	 * @return the object of type T from top of this mystack
	 * @throws EmptyStackException if mystack is empty
	 */
	T pop();
	
	/**
	 * return item from available at top of 
	 * the mystack without removing it
	 * @return the object of type T from top of this mystack
	 * @throws EmptyStackException if mystack is empty
	 */
	T peek();
}
