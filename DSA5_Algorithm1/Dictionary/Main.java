import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 * Main class
 * @author avinash.kumar_metacu
 *
 */
public class Main {


	/**
	 * To read JSON value from a file.
	 * @param filePath path of JSON fie
	 * @return dictMap Mapped objects
	 * @throws FileNotFoundException 
	 */
	public static JsonObject readJSON(String filePath) throws FileNotFoundException {
		FileReader fr = new FileReader(filePath);
		JsonReader jr = Json.createReader(fr);
		JsonObject jsonObj =jr.readObject();
		return jsonObj;
	}


	private static void printMessage() {
		System.out.println("1.Enter data"
				+ "\n2.Delete Node"
				+ "\n3.find key"
				+ "\n4.display"
				+ "\n5.Get all key pairs Key>=k1 and <=K2"
				+ "\n6.Exit");
	}


	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {

		JsonObject jsonObj = null;
		BSTDictionary dict = null;
		try {
			jsonObj = readJSON("file.json");
			dict = new BSTDictionary(jsonObj);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
		Scanner sc = new Scanner(System.in);
		String key;
		while(true){
			printMessage();
			int choice = sc.nextInt();
			switch(choice){
			case 1:
				System.out.println("1.Enter key");
				key = sc.next();
				System.out.println("1.Enter value");
				String value = sc.next();
				dict.put(key, value);
				break;
			case 2:
				System.out.println("Enter key to be deleted");
				key = sc.next();
				dict.delete(key);
				break;
			case 3:
				System.out.print("Enter key:");
				key  = sc.next();
				System.out.println(dict.get(key));
				break;
			case 4:
				List<BSTNode> ls =dict.sort();
				for (BSTNode bstNode : ls) {
					System.out.println(bstNode.getKey()+" : "+bstNode.getValue());
				}
				break;
			case 5:
				System.out.println("Enter lower bound");
				String lowerBound = sc.next();
				System.out.println("Enter upper bound");
				String upperBound = sc.next();
				List<BSTNode> ls1 =dict.sortBetweenValues(lowerBound,upperBound);
				for (BSTNode bstNode : ls1) {
					System.out.println(bstNode.getKey()+" : "+bstNode.getValue());
				}
				break;
			case 6:
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Wrong input");
				break;
			}
		}
	}
}
