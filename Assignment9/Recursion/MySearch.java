/**
 * to search for an element in an array
 * using Linear Search & Binary Search
 * 
 * @author avinash.kumar_metacu
 *
 */
public class MySearch {

	/**
	 * utility function for Perform Linear Search
	 * @param array
	 * @param numberToSearch
	 * @return index of numberToSearch in array
	 */
	public static int linearSearch(int[] array,int numberToSearch, int index)
	{
		//value found
		if(array[index]==numberToSearch)
			return index;
		else if(index<array.length-1)
		{
			index++;
			return linearSearch(array, numberToSearch, index+1);
		}
		return -1; //not found
	}
	
	/**
	 * Perform Linear Search
	 * @param array
	 * @param numberToSearch
	 * @return index of numberToSearch in array
	 */
	public static int linearSearch(int[] array,int numberToSearch)
	{
		return linearSearch(array, numberToSearch, 0);
	}
	
	/**
	 * Perform Binary Search
	 * 
	 * @param array
	 * @param firstIndex
	 * @param lastIndex
	 * @param numberTosearch
	 * @return index of numberToSearch in array
	 */
	public static int binarySearch(int[] array,int firstIndex,int lastIndex,int numberTosearch)
	{
		int low = 0;
		if (lastIndex >= firstIndex) { 
			int mid = firstIndex + (lastIndex - firstIndex) / 2;
			//value found
			if (array[mid] == numberTosearch){
				return mid;
			}
			if (array[mid] > numberTosearch){
				return binarySearch(array, low, mid - 1, numberTosearch); 
			}
			return binarySearch(array, mid + 1, lastIndex, numberTosearch); 
		}
		return -1; //not found
	} 
}
