package mystack;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Stack Implementation
 * @author avinash.kumar_metacu
 *
 */
public class ListStack<T> implements MyStack<T> {

	private final int MAX = 100;
	private final List<T> dataArr;
	private int top;

	/**
	 * Constructor
	 */
	public ListStack() {
		this.dataArr = new ArrayList<T>(MAX);
		this.top = -1;
	}

	/**
	 * @return true if mystack empty, false otherwise
	 */
	@Override
	public boolean isEmpty() {
		return this.top<0;
	}

	/**
	 * @param o object to push into mystack
	 * @return true if added to mystack, false otherwise
	 */
	@Override
	public boolean push(T o) {
		if(top<MAX){
			dataArr.add(o);
			this.top++;
			return true;
		}
		return false;
	}

	/**
	 * remove and retuns object from top of mystack
	 * @return value at top of mystack
	 * @throws EmptyStackException if mystack is empty
	 */
	@Override
	public T pop() {
		T temp = null;
		if(top<0){
			temp = dataArr.get(this.top);
			dataArr.remove(this.top);
			this.top--;
		}
		return temp;
	}

	/**
	 * @return value at top of mystack
	 * @throws EmptyStackException if mystack is empty
	 */
	@Override
	public T peek() {
		if(top<0){
			throw new EmptyStackException();
		}
		return dataArr.get(this.top);
	}


}
