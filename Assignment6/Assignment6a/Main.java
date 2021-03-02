import java.util.Scanner;
/**
 * 
 * @author avinash.kumar_metacu
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		MyStringOps string = new MyStringOps();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
	
		System.out.println("Are both Strings equal = "+string.compare(s1,s2));
		
		System.out.println("Reverse of first String is = "+string.getReverse(s1));
		System.out.println("Reverse of second String is = "+string.getReverse(s2));
		
		System.out.println("After changing case of string 1 = "+string.swapCase(s1));
		System.out.println("After changing case of string 2 = "+string.swapCase(s2));
		
		System.out.println("Largest word in string 1 = "+string.largestWord(s1));
		System.out.println("Largest word in string 2 = "+string.largestWord(s2));
		
		sc.close();
	}

}