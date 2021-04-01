import java.util.Scanner;

/**
 * @author avinash.kumar_metacu
 *
 */
public class MainEmp {
	public static void main(String[] args) {
		EmployeeList empList = new EmployeeList();
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("1.Enter Employee node");
			System.out.println("2.Sort");
			System.out.println("3.display list");
			System.out.println("4.Exit");
			int choice = sc.nextInt();
			switch(choice){
			case 1:
				System.out.println("Enter Employee salary");
				int salary = sc.nextInt();
				System.out.println("Enter Employee age");
				int age = sc.nextInt();
				empList.insert(salary,age);
				break;
			case 2:
				empList.sort();
				empList.display();
				break;
			case 3:
				empList.display();
				break;
			case 4:
				sc.close();
				return;
			default:
				System.out.println("Wrong input");
				break;
			}
		}
	}
}
