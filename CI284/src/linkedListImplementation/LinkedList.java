package linkedListImplementation;

//adapted from https://www.youtube.com/watch?v=ch1uQeu0PVY

public class LinkedList {
	//root pointer
	Node root;
	//size of list
	int size;
	
	//constructor
	public LinkedList() {
		//create empty node as root
		root = null;
		size = 0;
	}
	
	//add a node
	public void insertNode(int priority, String owner, String creator) {
		size++;
		//creates a new node with a priority, owner and creator and sets its next node to the root
		Node newNode = new Node(priority, owner, creator, root);
		//node to store prev
		Node prevNode = null;
		//node to store current
		Node currNode = root;
		
		//cycle thru the nodes til either the priority is higher or current is null
		while (currNode != null && priority >= currNode.getPriority()) {
			prevNode = currNode;
			currNode = currNode.getNextNode();
		}
		if (prevNode == null) {
			newNode.setNextNode(root);
			root = newNode;
		}
		else {
			prevNode.setNextNode(newNode);
			newNode.setNextNode(currNode);
		}		
	}
	
	//remove node
	public void removeFirstNode() {
		if (root != null ) {
			size--;
			root = root.getNextNode();		
		}
	}
	
	//find node
	public Node findNodeByID(int id) {
		Node tmpNode = this.root;
		
		while (tmpNode != null) {
			if (tmpNode.getID() == id) {
				return tmpNode;
			}
			tmpNode = tmpNode.getNextNode();
		}
		return null;
	}
	
	public void display() {
		Node currNode = root;
		
		while (currNode != null) {
			currNode.displayNodeData();
			currNode = currNode.getNextNode();
		}
	}
	
	public void displayRootNode() {
		root.displayNodeData();
	}
	
	public int getSize() {
		return size;
	}
	
	
}
