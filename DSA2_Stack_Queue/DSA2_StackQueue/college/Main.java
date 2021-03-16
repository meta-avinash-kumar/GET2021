package college;

import java.io.FileNotFoundException;

/**
 * Main class
 * @author avinash.kumar_metacu
 *
 */
public class Main {

	public static void main(String[] args) {
		College colObj = new College();
		try {
			colObj.addStudents("Students.csv");
			colObj.addPrograms("Programs.csv");
			colObj.allocateBranch();
			colObj.show();
		} catch (FileNotFoundException e) {
			System.out.println("File not found: "+ e.getMessage());;
		}
	}
}
