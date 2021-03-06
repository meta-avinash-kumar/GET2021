import java.util.ArrayList;
import java.util.List;

/**
 * @author avinash.kumar_metacu
 *
 */
public final class IntSet {

	private final int[] intSet;

	/**
	 * class constructor (Parameterized)
	 * @param arr
	 */
	public IntSet(int[] arr) {
		List<Integer> newArr = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(!newArr.contains(arr[i])){
				newArr.add(arr[i]);
			}
		}
		this.intSet = new int[newArr.size()];
		for (int i = 0; i < newArr.size(); i++) {
			intSet[i] = newArr.get(i);
		}
	}

	/**
	 * @return the arrSet
	 */
	public int[] getIntSet() {
		return intSet;
	}
	
	/**
	 * check whether x is a member of the set
	 * @param value
	 * @return a boolean value
	 */
	public boolean isMember(int value){
		for (int i = 0; i < intSet.length; i++) {
			if(intSet[i] == value){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * @return the size of the IntSet
	 */
	public int size(){
		return intSet.length;
	}
	
	/**
	 * check whether s is a subset of the set
	 * @param s
	 */
	public boolean isSubSet(IntSet s){
		for (int i : s.getIntSet()) {
			if(!this.isMember(i)){
				return false;
			}
		}
		return true;
	}

	/**
	 * return the union of this and s
	 * 
	 * @param s
	 * @return Union of this and s
	 */

	public int[] union(IntSet s){
		List<Integer> newList = new ArrayList<Integer>();
		for (int i : this.intSet) {
			newList.add(i);
		}
		for (int i : s.getIntSet()) {
			if(!this.isMember(i)){
				newList.add(i);
			}
		}
		int[] union = newList.stream().mapToInt(i->i).toArray();
		return union;
	}
	
	/**
	 * return the complement set
	 * @assumption:
	 * 		-> 1..1000 is the universal set
	 * @return the complement set
	 */

	public int[] getComplement(){
		int n = this.intSet.length;
		int[] complementSet = new int[1000 - n];
		int index = 0;
		for (int i = 1; i < 1000; i++) {
			if(!this.isMember(i)){
				complementSet[index++] = i;
			}
		}
		return complementSet;
	}
}
