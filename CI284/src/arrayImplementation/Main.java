package arrayImplementation;

public class Main {

	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue(11);
		
		//testing
		int maxpriority = 4;
		int minpriority = 1;
		String owner;
		String creator;
		
		for (int i = 0; i < 5; i++) {
			//select random number between min/maxpriority
			int randomNum = minpriority + (int)(Math.random()*((maxpriority-minpriority)+1)); 
			System.out.println("Enter ticket creator name (3 letters)");
			creator = BIO.getString();
			System.out.println("Enter ticket owner name (3 letters");
			owner = BIO.getString();
			Ticket ticket = new Ticket(creator, owner, randomNum);
			queue.EnQueue(ticket);
		}
		
		queue.PrintQueue();
	}

}
