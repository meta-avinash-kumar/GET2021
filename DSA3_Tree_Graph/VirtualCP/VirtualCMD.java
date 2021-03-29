import java.util.ArrayList;
import java.util.List;


/**
 * @author avinash.kumar_metacu
 *
 */
public class VirtualCMD {

	private DirNode DirSchema;
	DirNode currentDir;
	List<DirNode> dirList;
	
	/**
	 * @param dirSchema
	 * @param currentDir
	 * @param dirList
	 */
	public VirtualCMD() {
		DirSchema = new DirNode("Root:\\", null);
		this.currentDir = DirSchema;
		dirList = new ArrayList<DirNode>();
	}

	/**
	 * Shows tree view of current directory
	 */
	public void showTree() {
		showTreeRecursively(currentDir, 0);
	}

	/**
	 * Recursive utility function to show tree view
	 * @param dir
	 * @param level
	 */
	private void showTreeRecursively(DirNode dir, int level) {
		printSpace(level);
		List<DirNode> curDir = dir.getChild();
		for (DirNode node : curDir) {
			System.out.println("-"+node.getName());
			if(node.getChild().size()>0){
				showTreeRecursively(node, level+1);
			}
		}
	}
	/**
	 * Generates space pattern for tree 
	 * @param level
	 */
	private void printSpace(int level) {
//		if(level != 0){
//			System.out.print("\u2514");
//		}
		for(int i = 0; i<level; i++){
			System.out.print("--");
		}
	}

	/**
	 * Checks if directory exist in given subdirectories
	 * @param dir
	 * @param string
	 * @return true if directory exist, else false
	 */
	public boolean findDir(DirNode dir , String string) {
		dirList.clear();
		List<DirNode> subDirs = dir.getChild();
		if(subDirs.isEmpty()){
			return false;
		}
		for (DirNode node : subDirs) {
			if(string.compareToIgnoreCase(node.getName()) == 0){
				this.dirList.add(node);
			}
		}
		return true;
	}

	/**
	 * shows list of files in current Directory
	 */
	public void showList() {
		List<DirNode> subDir = currentDir.getChild();
		for (DirNode node : subDir) {
			System.out.println(node.getName()+"\t"+node.getDateCreated().toString());
		}
	}

	/**
	 * Changes current working Directory
	 * @param string
	 */
	public void changeDir(String string) {
		if("parent".equalsIgnoreCase(string)){
			if(currentDir.getParent() !=null){
				currentDir = currentDir.getParent();
				return;
			}
		}
		if(findDir(currentDir, string)){
			currentDir = dirList.get(0);
			return ;
		}
		System.out.println("No such folder exist");
	}

	/**
	 * Creates new directory in current Directory
	 * @param string
	 */
	public void createDir(String string) {
		String names[] = string.split("/");
		DirNode temp = currentDir;
		for (String dir : names) {
			if(dir==""){
				throw new IllegalArgumentException("Invalid directory name: "+dir);
			}
			DirNode newDir = new DirNode(dir, temp);
			temp.addChild(newDir);
			temp = newDir;
		}
	}
	
	/**
	 * Returns the path of directory
	 * @param currentDir
	 * @return
	 */
	public String getpath(DirNode currentDir) {
		String path = currentDir.getName();
		while(currentDir.getParent()!=null){
			path = currentDir.getParent().getName() +"\\"+ path;
			currentDir = currentDir.getParent();
		}
		return path;
	}
	
}
