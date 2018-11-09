package linkedListImplementation;

public class PriorityQueue {
	private LinkedList list;
	
	//constructor
	public PriorityQueue() {
		list = new LinkedList();
	}
	
	public void insert(int priority, String owner, String creator) {
		list.insertNode(priority, owner, creator);
	}
	
	public void remove() {
		list.removeFirstNode();
	}
	
	public void displayQueue() {
		System.out.printf("%8s | %3s | %10s | %10s\n", "Priority", "ID", "Owner", "Creator");
		list.display();
	}
	
	public void displayRoot() {
		list.displayRootNode();
	}
	
	public int displaySize() {
		return list.getSize();
	}
	
	public void displayDataByID(int id) {
		if (list.findNodeByID(id) != null) {
			System.out.printf("%8s | %3s | %10s | %10s\n", "Priority", "ID", "Owner", "Creator");
			list.findNodeByID(id).displayNodeData();
		} else {
			System.out.println("ID " + id + " not found.");
		}
	}
}
