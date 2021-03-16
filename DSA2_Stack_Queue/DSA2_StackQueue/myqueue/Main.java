package myqueue;
/**
 * @author avinash.kumar_metacu
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListQueue<String> queue = new ListQueue<>();
		queue.add("I");
		queue.add("love");
		queue.add("java");
		System.out.println("Original queue: "+ queue.toString());
		System.out.println("peek: "+ queue.peek());
		System.out.println("remove: "+ queue.poll());
		System.out.println("After removing: "+ queue.toString());
	}

}
