/**
 * A class that perform following operations on Strings, without using Java APIs. Assume strings to be not null and case sensitive.
 * Compare two strings and return 1 if equals else 0. Take two string inputs, compare them and return values accordingly.
 * Return the reverse of any string.
 * Receive a string as parameter and replace lowercase characters with uppercase and vice-versa.
 * Return the largest word of a string. If two words are of same length then return last word.
 * 
 * @author avinash.kumar_metacu
 *
 */
public class MyStringOps {

	
	/**
	 * Compare two this and string, and return values accordingly.
	 * @param str
	 * @return 1 if equals else 0
	 */
	public int compare(String str1, String str2) {
		if(str1.length() != str2.length()){
			return 0;
		}
		for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) != str2.charAt(i)){
				return 0;
			}
		}
		return 1;
	}
	/**
	 * Return the reverse of any string.
	 * @param str String
	 * @return reverse of String
	 */
	public String getReverse(String str) {
		//empty string to store the reverse of the string 
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse+=str.charAt(i);

		}
		return reverse;
	}
	/**
	 * Receive a string as parameter and replace lowercase characters with uppercase and vice-versa. 
	 */
	public String swapCase(String str){
		//empty string to store the swapCase of the string 
		String swapCaseStr = "";
		for (int i = 0; i < str.length(); i++) {
			int ascii=(int)str.charAt(i);
			if(ascii>=97&&ascii<=122)
			{
				swapCaseStr+=(char)((int)str.charAt(i)-32); //lower to upper case

			}
			else if(ascii>=65&&ascii<=90)
			{
				swapCaseStr+=(char)((int)str.charAt(i)+32); //upper to lower case
			}
			else
				swapCaseStr+=str.charAt(i);
		}
		return swapCaseStr;
	}
	
	/**
	 * Return the largest word of a string. If two words are of same length then return last word.
	 */
	public String largestWord(String str){

		String arrayOfAllWords[];

		int noOfWords=1;
		//for calculating no of words
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
				noOfWords++;
		}

		int index=0;

		arrayOfAllWords=new String[noOfWords];
		arrayOfAllWords[0]=""; //Initializing array with empty string
		for(int i=0;i<str.length();i++)
		{	
			if(str.charAt(i)!=' ')
			{
				arrayOfAllWords[index]+=str.charAt(i);
			}
			else{
				index++;
				arrayOfAllWords[index]="";  // Initializing array with empty string
			}

		}


		int max=0;
		for(int i=0;i<noOfWords;i++)
		{
			if(arrayOfAllWords[i].length()>=arrayOfAllWords[max].length())
				max=i;

		}

		return arrayOfAllWords[max];
		
	}

}
