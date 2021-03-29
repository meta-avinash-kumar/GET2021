import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main class
 * @author avinash.kumar_metacu
 *
 */
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VirtualCMD vcmd = new VirtualCMD();
		Scanner sc = new Scanner(System.in);
		System.out.println("****Welcome to Virtual Command Prompt****");
		while(true){
			String path = vcmd.getpath(vcmd.currentDir);
			System.out.println(path +"\\>");
			String line = sc.nextLine();
			String cmd[] = line.split(" ",2);
			switch (cmd[0]) {
			case "mkdir":
				if(cmd.length<=1){
					System.err.println("Invalid syntax for: "+cmd[0]);
					break;
				}
				vcmd.createDir(cmd[1]);
				break;
			case "cd":
				if(cmd.length<=1){
					System.err.println("Invalid syntax for: "+cmd[0]);
					break;
				}
				vcmd.changeDir(cmd[1]);
				break;
			case "bk":
				vcmd.changeDir("parent");
				break;
			case "ls":
				vcmd.showList();
				break;
			case "find":
				if(cmd.length<=1){
					System.err.println("Invalid syntax for: "+cmd[0]);
					break;
				}
				vcmd.dirList = new ArrayList<DirNode>();
				vcmd.findDir(vcmd.currentDir, cmd[1]);
				break;
			case "tree":
				vcmd.showTree();
				break;
			case "exit":
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("command does not exist");
				break;
			}
		}
	}

}
