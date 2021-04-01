/**
 * Class EmployeeList to create Linked List
 * @author avinash.kumar_metacu
 */

public class EmployeeList {

	Node head, tail, sorted;
	
	/**
	 * insert Method to insert a new Node Inside the Linked lIst
	 * @param value
	 */
	void insert(int salary,int age){
		Node node = new Node(salary,age);
		if(head == null){
			head = node;
			tail = node;
		}
		else{
			tail.next = node;
			tail = node;
		}

	}

	/**
	 * print all the values present in the Employee List 
	 */
	public void display(){
		Node tempNode = head;
		while(tempNode != null){
			System.out.println("Salary :"+tempNode.salary+" Age :"+tempNode.age);
			tempNode = tempNode.next;
		}
	}

	/**
	 * Sorts the Employee list using insertion Sort
	 */
	public void sort(){
		sorted = null; 
        Node current = head; 

		// Traverse Employee list
		while (current != null){ 
			// insert current in sorted linked list 
			Node next = current.next;
			sortedInsert(current); 
			// Update current 
			current = next; 
		}
		// Update head to point to sorted linked list 
		head = sorted; 
	}

	private void sortedInsert(Node newNode) {
		//if this is first node
		if (sorted == null || sorted.salary < newNode.salary){ 
			newNode.next = sorted; 
			sorted = newNode;
		}
		else { 
			Node current = sorted; 
			// Locate the node before the point of insertion
			while (current.next != null && (current.next.salary > newNode.salary || 
					(current.next.salary == newNode.salary  && newNode.age > current.next.age ))){ 
				current = current.next; 
			} 
			newNode.next = current.next; 
			current.next = newNode; 
		}
	} 

}
