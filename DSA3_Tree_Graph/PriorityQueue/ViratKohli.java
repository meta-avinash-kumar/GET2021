import java.util.Scanner;

/**
 * @author avinash.kumar_metacu
 *
 */
public class ViratKohli {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total number of bowlers: ");
		int bowlers = sc.nextInt();
		if(bowlers < 0){
			sc.close();
			return;
		}
		PriorityQ queue = new ArrayPriorityQ(bowlers);
		System.out.print("Total number of bowls virat going to play: ");
		int totalBowl = sc.nextInt();
		System.out.println("Enter quota of each bowler");
		int p = 1;
		int tempTotal = totalBowl;
		while(tempTotal > 0){
			System.out.print("Quota of bowler "+ p+++": ");
			int bowlLeft = sc.nextInt();
			queue.enqueue(bowlLeft);
			tempTotal -= bowlLeft;
		}
		sc.close();
		((ArrayPriorityQ) queue).displayForKohli(totalBowl);
	}
	
}
