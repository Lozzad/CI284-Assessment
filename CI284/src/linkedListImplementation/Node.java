package linkedListImplementation;

//start line 69
public class Node {
	private static int nodeCount;
	
	private Node nextNode;
	private int uniqueID;
	private int priority;
	private String owner;
	private String creator;
	
	
	//3 diff constructors
	public Node() {}
	
	public Node(int p, String o, String c) {
		nodeCount++;
		uniqueID = nodeCount;
		owner = o;
		creator = c;
		priority = p;
	}
	
	public Node(int p, String o, String c, Node next) {
		nodeCount++;
		uniqueID = nodeCount;
		owner = o;
		creator = c;
		priority = p;
		nextNode = next;
	}
	
	//getters/setters
	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String c) {
		this.creator = c;
	}
	public int getID() {
		return this.uniqueID;
	}
	public void setID(int id) {
		this.uniqueID = id;
	}
	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String o) {
		this.owner = o;
	}
	public int getPriority() {
		return this.priority;
	}
	public void setPriority(int p) {
		this.priority = p;
	}
	public Node getNextNode() {
		return this.nextNode;
	}
	public void setNextNode(Node n) {
		this.nextNode = n;
	}
	
	public void displayNodeData() {
		System.out.printf("%8d | %3d | %10s | %10s", priority, uniqueID, owner, creator);
		System.out.println();
		
	}
	
	
	
}
