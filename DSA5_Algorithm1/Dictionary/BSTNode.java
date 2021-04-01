/**
 * Holds the structure for tree nodes
 * @author avinash.kumar_metacu
 *
 */
public class BSTNode {

	private String key;
	private String value;
	private BSTNode leftChild;
	private BSTNode rightChild;

	/**
	 * To initialize a object
	 * @param pairKey dictionary key
	 * @param pairValue dictionary value
	 */
	public BSTNode(Object pairKey, Object pairValue){
		this.key = pairKey.toString();
		this.value = pairValue.toString();
		this.leftChild = null;
		this.rightChild = null;
	}

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the leftChild
	 */
	public BSTNode getLeftChild() {
		return leftChild;
	}

	/**
	 * @param leftChild the leftChild to set
	 */
	public void setLeftChild(BSTNode leftChild) {
		this.leftChild = leftChild;
	}

	/**
	 * @return the rightChild
	 */
	public BSTNode getRightChild() {
		return rightChild;
	}

	/**
	 * @param rightChild the rightChild to set
	 */
	public void setRightChild(BSTNode rightChild) {
		this.rightChild = rightChild;
	}

	
}