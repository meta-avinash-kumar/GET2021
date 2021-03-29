/**
 * @author avinash.kumar_metacu
 *
 */
public interface PriorityQ {
	/**
	 * inserts element in PriorityQ
	 * @param element
	 */
	void enqueue(int element);

	/**
	 * removes highest priority element from PriorityQ
	 */
	void deQueue();

	/**
	 * return the highest priority element from PriorityQ
	 * @return
	 */
	int peek();

	/**
	 * displays all the elements in PriorityQ
	 */
	void show();
}
