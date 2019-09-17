
public class UseQueue {

	
public static void main(String[] args) {
		
		CS112QueueInterface myQ = new CS112Queue();
		
		myQ.enqueue(1);
		myQ.writeQueue();

		myQ.enqueue(2);
		myQ.writeQueue();

		myQ.enqueue(7);
		myQ.writeQueue();

		myQ.enqueue(18);
		myQ.writeQueue();
		
		int head = myQ.dequeue();
		System.out.println("Removed element "+head);
		head = myQ.dequeue();
		System.out.println("Removed element "+head);
		myQ.writeQueue();
		
		myQ.enqueue(9);
		myQ.writeQueue();
		
		myQ.dequeue();
		myQ.writeQueue();

	}


}
