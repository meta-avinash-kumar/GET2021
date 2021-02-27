/**
 * Driver Code
 * @author avinash.kumar_metacu
 *
 */
public class Main {

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		int p[][] = {{0,10},{6,20},{60,10},{110,5}};
		JobSchedulerFCFS fcfs = new JobSchedulerFCFS(p);
		int ct[] = fcfs.getCompletionTime();
		int tat[] = fcfs.getTurnAroundTime();
		int wt[] = fcfs.getWaitingTime();
		float awt = fcfs.getAvgWaitTime();
		int maxwt = fcfs.maxWaitTime();
		
		//print all values
		System.out.println("S.No\t"
				+ "AT\t"
				+ "BT\t"
				+ "CT\t"
				+ "TAT\t"
				+ "WT");
		System.out.println("***********************************************");
		for (int i = 0; i < p.length; i++) {
			System.out.println(Integer.toString(i+1)+"\t"
					+ p[i][0]+"\t"
					+ p[i][1]+"\t"
					+ ct[i]+"\t"
					+ tat[i]+"\t"
					+ wt[i]+"");
		}
		System.out.println("Average waiting time: "+ awt);
		System.out.println("Max waiting time: "+ maxwt);
	}

}
