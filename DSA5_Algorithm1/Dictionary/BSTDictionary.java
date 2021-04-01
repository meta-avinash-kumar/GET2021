import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.json.JsonObject;
import javax.json.JsonValue;

/**
 * @author avinash.kumar_metacu
 *
 */
public class BSTDictionary implements MyDictionary<String, String> {

	private BSTNode root;
	private int len;
	List<BSTNode> sorted;


	/**
	 * Constructor
	 */
	public BSTDictionary() {
		this.root = null;
		this.len = 0;
		this.sorted = new ArrayList<BSTNode>();
	}

	/**
	 * Constructor
	 * @param obj :JsonObject
	 */
	public BSTDictionary(JsonObject obj) {
		this.len = 0;
		this.sorted = new ArrayList<BSTNode>();
		try {
			//get the set of the keys and values from JSON file
			Iterator<String> keys= obj.keySet().iterator();
			Iterator<JsonValue> values = obj.values().iterator();

			while (keys.hasNext()) {
				//System.out.println(keys.next()+":"+values.next().toString());
				put(keys.next(),values.next().toString());
				this.len++;

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Check wether Dictionary is empty or not
	 * @return boolean
	 */
	public boolean isEmpty(){
		return this.len==0;
	}

	/**
	 * Add a key-value pair to Dictionary
	 * @param k key
	 * @param v value
	 */
	public void put(String key, String val){
		root =  put(root, key, val);
	}

	/**
	 * Utility funtion to insert Node to the binary tree 
	 * contains key value pair ,required key and value
	 * @param rootNode
	 * @param key
	 * @param value
	 * @return Node
	 */
	private BSTNode put(BSTNode rootNode, String key, String value){
		if(rootNode == null){
			rootNode = new BSTNode(key, value);
			return rootNode;
		}
		if(key.compareTo(rootNode.getKey())> 0){
			rootNode.setRightChild(put(rootNode.getRightChild(),key,value));
		}
		else{
			rootNode.setLeftChild(put(rootNode.getLeftChild(),key,value));
		}
		return rootNode;
	}

	/**
	 * Removes the node if key exist in MyDictionary
	 * @param k key
	 * @throws IllegalArgumentException if key not found
	 */
	public void delete(String key){
		root = delete(root, key);
	}

	/**
	 * Delete node from the BST
	 * @param root
	 * @param key
	 * @return node
	 */
	private BSTNode delete(BSTNode root, String key)
	{
		/* Base Case: If the tree is empty */
		if (root == null){
			return root;
		}

		/* Otherwise, recur down the tree */
		if (key.compareTo(root.getKey()) < 0){
			root.setLeftChild(delete(root.getLeftChild(), key));
		}
		else if (key.compareTo(root.getKey()) > 0){
			root.setRightChild(delete(root.getRightChild(), key));
		}

		// if key is same as root's 
		// key, then This is the
		// node to be deleted
		else {
			// node with only one child or no child
			if (root.getLeftChild() == null)
				return root.getRightChild();
			else if (root.getRightChild() == null)
				return root.getLeftChild();

			// node with two children: Get the inorder
			// successor (smallest in the right subtree)
			root.setKey(minValue(root.getRightChild()));

			// Delete the inorder successor
			root.setRightChild(delete(root.getRightChild(), root.getKey()));
		}

		return root;
	}

	/**
	 * Returns the value if key exist in Dictionary
	 * @param k key
	 * @return value for provided key
	 * @throws NullPointerException if Dictionary is empty
	 * @throws IllegalArgumentException if key not found
	 */
	public String get(String key){
		if(root == null){
			throw new NullPointerException("Dictonary is empty");
		}
		BSTNode temp = root;
		while(temp!=null){
			if(temp.getKey().compareTo(key) == 0){
				return temp.getValue();
			}
			else if(key.compareTo(temp.getKey()) < 0){
				temp = temp.getLeftChild();
			}
			else {
				temp = temp.getRightChild();
			}
		}
		throw new IllegalArgumentException("Key not found: "+key);
	}

	/**
	 * checks if key exist in Dictionary or not
	 * @param key to check
	 * @return true if key exist, else null
	 */
	public boolean containsKey(String key){
		BSTNode temp = root;
		while(temp!=null){
			if(temp.getKey().compareTo(key) == 0){
				return true;
			}
			else if(key.compareTo(temp.getKey()) < 0){
				temp = temp.getLeftChild();
			}
			else {
				temp = temp.getRightChild();
			}
		}
		return false;
	}

	/**
	 * Returns size of Dictionary
	 * @return size
	 */
	public int size(){
		return this.len;
	}

	/**
	 * Returns sorted list of Key value pairs
	 * @return List of sorted Key value pairs
	 */
	public List<BSTNode> sort(){
		sorted.clear();
		sort(root);
		return sorted;
	}


	private void sort(BSTNode root) {
		if(root == null){
			return;
		}
		else{
			sort(root.getLeftChild());
			sorted.add(root);
			sort(root.getRightChild());
		}
	}

	/**
	 * Returns sorted list of Key value pairs between range
	 * @param k1 starting key range
	 * @param k2 end key range
	 * @return List of sorted Key value pairs
	 */
	public List<BSTNode> sortBetweenValues(String k1,String k2){
		sorted.clear();
		sortBetweenValues(root, k1, k2);
		return sorted;
	}

	/**
	 * Utility function for sorting in range
	 * @param node
	 * @param k1
	 * @param k2
	 */
	private void sortBetweenValues(BSTNode node, String k1, String k2) {
		if(node == null){
			return;
		}
		else{
			//Inorder traversal
			sortBetweenValues(node.getLeftChild(), k1, k2);
			if(node.getKey().compareTo(k1) >= 0 && node.getKey().compareTo(k2) <= 0){
				sorted.add(node);
			}
			sortBetweenValues(node.getRightChild(), k1, k2);
		}
	}

	/**
	 * Returns the minValue of the subTree
	 * @param root
	 * @return
	 */
	private String minValue(BSTNode root){
		String min = root.getKey();
		while (root.getLeftChild() != null) 
		{
			min = root.getLeftChild().getKey();
			root = root.getLeftChild();
		}
		return min;
	}

}
