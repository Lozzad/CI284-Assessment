package arrayImplementation;

public class Ticket {
	//set up the variables
	private static int numberOfTickets = 0;
	
	private int priority;
	private int uniqueID;
	private String owner;
	private String creator;
	
	
	//make the ticket object after being given a priority
	public Ticket(String creator, String owner, int newPriority) {
		numberOfTickets++;
		this.uniqueID = numberOfTickets;
		this.creator = creator;
		this.owner = owner;
		this.priority = newPriority;
		
	}
	
	//getters and setters (if needed)
	public int GetTicketID() {
		return uniqueID;
	}
	
	public int GetPriority() {
		return priority;
	}
	
	public String GetOwner() {
		return owner;
	}
	
	public String GetCreator() {
		return creator;
	}
	
	
}
