package LinkedQueue;

public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedQueue a = new LinkedQueue();
		//a.dequeue();
		a.enqueue(2);
		a.enqueue(5);

		a.enqueue(1);
		System.out.println(a.toString());
		System.out.println(a.isEmpty());
		System.out.println(a.first());
		System.out.println(a.last());
		a.enqueue(7);
		System.out.println(a.toString());
		System.out.println(a.last());
		System.out.println("dequeue: " + a.dequeue());
		System.out.println("size: " + a.size());

}

}
