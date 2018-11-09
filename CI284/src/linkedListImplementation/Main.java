package linkedListImplementation;

public class Main {

	public static void main(String[] args) {
		//instantiate queue
		PriorityQueue queue = new PriorityQueue();
		
		//testing variables
		int maxpriority = 4;
		int minpriority = 1;
		int queueSize = 100;
		String owner = "owner";
		String creator = "creator";
		
		//populate queue
		System.out.println("Creating Queue...");
		for (int i = 0; i < queueSize; i++) {
			//create random priority between min and max
			int priority = minpriority + (int)(Math.random()*((maxpriority-minpriority)+1)); 
			
			//create the node
			queue.insert(priority, creator+String.valueOf(i+1), owner+String.valueOf(i+1));	
		}
		//show queue
		queue.displayQueue();
		System.out.println("Queue created with " + queueSize + " nodes in ascending order of priority." );
		
		//show root node
		System.out.println("\nThe data of the root node (front of the queue) is:");
		System.out.printf("%8s | %3s | %10s | %10s\n", "Priority", "ID", "Owner", "Creator");
		queue.displayRoot();
		
		//remove root node
		System.out.println("\nRemoving first node...");
		queue.remove();
		queueSize = queue.displaySize();
		System.out.println("Queue now contains " + queueSize + " nodes.");
		System.out.println("The data of the new root node is:");
		System.out.printf("%8s | %3s | %10s | %10s\n", "Priority", "ID", "Owner", "Creator");
		queue.displayRoot();
		
		//demonstrate find
		System.out.println("\nDisplaying node with ID 32.");
		queue.displayDataByID(32);
		System.out.println("\nDisplaying node with ID 100.");
		queue.displayDataByID(100);
		System.out.println("\nDisplaying node with ID 101.");
		queue.displayDataByID(101);
		System.out.println("\nDisplaying node with ID -10.");
		queue.displayDataByID(-10);
		
	}

}
