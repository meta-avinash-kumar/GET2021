import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Generic Node class
 * @author avinash.kumar_metacu
 *
 */
public class DirNode {
	private String name;
	private DirNode parent;
	private final List<DirNode> child;
	private final LocalDateTime DateCreated;

	/**
	 * @param name
	 * @param parent
	 */
	public DirNode(String name, DirNode parent) {
		this.name = name;
		this.parent = parent;
		this.child = new ArrayList<DirNode>();
		this.DateCreated = LocalDateTime.now();
	}

	/**
	 * @return the parent
	 */
	public DirNode getParent() {
		return parent;
	}
	/**
	 * @param parent the parent to set
	 */
	public void setParent(DirNode parent) {
		this.parent = parent;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String data) {
		this.name = data;
	}

	/**
	 * Adds new Directory node
	 * @param newNode
	 * @return
	 */
	public boolean addChild(DirNode newNode){
		for (int i = 0; i < child.size(); i++) {
			if(child.get(i).name.equalsIgnoreCase((newNode.name))){
				//throw new AssertionError("Directory already exists");
				System.err.println("Directory already exists");
				return false;
			}
		}
		child.add(newNode);
		return true;
	}

	/**
	 * @return the sub Directory List
	 */
	public List<DirNode> getChild() {
		return child;
	}

	/**
	 * @return the dateCreated
	 */
	public LocalDateTime getDateCreated() {
		return DateCreated;
	}

}
