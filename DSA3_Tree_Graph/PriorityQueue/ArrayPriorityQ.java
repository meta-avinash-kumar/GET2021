/**
 * @author avinash.kumar_metacu
 *
 */
public class ArrayPriorityQ implements PriorityQ {

	private int[] priorityQueue;
	private int front = -1,rear = -1;
	
	/**
	 * Constructor
	 * @param size
	 */
	public ArrayPriorityQ(int size) {
		priorityQueue = new int[size];
	}

	/**
	 * Puts highest priority element at the front of the queue
	 * @param element
	 */
	@Override
	public void enqueue(int element) {
		if(front > rear && front != -1){
			System.out.println("OverFlow");
			return;
		}
		if(front == -1){
			priorityQueue[++rear] =  element;
			front = 0;
		}
		else{
			int index = getInsertIndex(element);
			int tempRear = rear++;
			while(index<=tempRear){
				priorityQueue[tempRear+1] = priorityQueue[tempRear];
				tempRear--;
			}
			priorityQueue[index] = element;
		}
	}

	/**
	 * Returns the index where the new element should be inserted
	 * @param element
	 * @return index
	 */
	private int getInsertIndex(int element){
		int index = front;
		if(front == -1) return 0;
		while(element < priorityQueue[index]){
			index++;
			if(index>rear){
				return index;
			}
		}
		return index;
	}

	/**
	 * Removes the highest priority element of queue
	 */
	@Override
	public void deQueue() {
		if(front > rear) {
			System.out.println("UnderFlow");
		}
		front++;
	}

	/**
	 * Returns element at front of the queue, highest priority element
	 */
	@Override
	public int peek() {
		return priorityQueue[front];
	}

	/**
	 * Prints the queue to output console
	 *
	 */
	@Override
	public void show() {
		for (int i = 0; i < priorityQueue.length; i++) {
			System.out.print(priorityQueue[i]+" ");
		}
		System.out.println();
	}
	
	/**
	 * Display the queue for virat kohli problem
	 *
	 */
	public void displayForKohli(int ball){
		for(int index = front;index<=rear;index++){
			int playBall = priorityQueue[index]<ball?priorityQueue[index]:ball;
			System.out.println("Bowler with "+priorityQueue[index]+" left: "+playBall);
			ball -= priorityQueue[index];
		}
		System.out.println();
	}
}
