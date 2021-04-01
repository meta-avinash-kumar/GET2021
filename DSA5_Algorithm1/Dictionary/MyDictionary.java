import java.util.List;

/**
 * MyDictionary interface
 * @author avinash.kumar_metacu
 *
 * @param <K> key
 * @param <V> value
 */
public interface MyDictionary<K,V> {
	
	/**
	 * Check wether MyDictionary is empty or not
	 * @return boolean
	 */
	public boolean isEmpty();
	
	/**
	 * Add a key-value pair to MyDictionary
	 * @param k key
	 * @param v value
	 */
	public void put(K k, V v);

	/**
	 * Returns the value if key exist in MyDictionary
	 * @param k key
	 * @return value for provided key
	 * @throws IllegalArgumentException if key not found
	 */
	public V get(K k);
	
	/**
	 * Removes the node if key exist in MyDictionary
	 * @param k key
	 * @throws IllegalArgumentException if key not found
	 */
	public void delete(String key);
	
	/**
	 * checks if key exist in MyDictionary or not
	 * @param key to check
	 * @return true if key exist, else null
	 */
	public boolean containsKey(String key);
	
	/**
	 * Returns size of MyDictionary
	 * @return size
	 */
	public int size();
	
	/**
	 * Returns sorted list of Key value pairs
	 * @return List of sorted Key value pairs
	 */
	public List<BSTNode> sort();
	
	/**
	 * Returns sorted list of Key value pairs between range
	 * @param k1 starting key range
	 * @param k2 end key range
	 * @return List of sorted Key value pairs
	 */
	public List<BSTNode> sortBetweenValues(String k1,String k2);
}
