package arrayImplementation;

//thanks to https://www.youtube.com/watch?v=mcMXy4EH0MQ

public class PriorityQueue {
	private int arraySize;
	private int queueCapacity;
	Ticket array[];
	
	//create queue with a chosen capacity and no elements
	public PriorityQueue(int capacity) {
		this.queueCapacity = capacity;
		array = new Ticket[this.queueCapacity];
		arraySize = 0;
 	}
	
	//add item to queue
	public void EnQueue(Ticket ticket) {
		//need this after the for loop
		int i;
		//put the first element into the first index
		if (arraySize == 0) {
			array[0] = ticket;
			arraySize++;
			return;
		}
		//if its not the first item
		//for each item in the array starting at the highest priority
		for (i = arraySize - 1; i >= 0; i--) {
			//if the ticket is a higher priority
			if (ticket.GetPriority() > array[i].GetPriority()) {
				//move along to right
				array[i+1] = array[i];
			} else {
				break;
			}
		}
		//put the ticket in where there's now a duplicate amd increase the size
		array[i+1] = ticket;
		arraySize++;
	}
	
	//removes highest priority element
	public Ticket Remove() {
		return array[--arraySize];
	}
	
	//returns true if no. of elements == capacity
	public boolean IsFull() {
		return arraySize==queueCapacity;
	}
	//returns true if no. of elements == 0
	public boolean IsEmpty() {
		return arraySize == 0;
	}
	//return top element
	public Ticket GetTop() {
		return array[arraySize-1];
	}
	//print out the queue
	public void PrintQueue() {
		System.out.println("ID    Creator    Owner    Priority");
		for (int i = 0; i < arraySize; i++) {
			System.out.println(array[i].GetTicketID() + "     " + array[i].GetCreator() + "        " + array[i].GetOwner() + "      " + array[i].GetPriority() );
		}
	}
}
