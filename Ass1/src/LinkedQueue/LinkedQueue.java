package LinkedQueue;

import java.util.Iterator;

/**
 * @author Victor Roman
 *
 */
public class LinkedQueue implements IntQueue {

	private int size;
	private Node first;
	private Node last;
	
	private class Node {
		private int item;
		private Node next;
	}

	/**Constructor
	 * 
	 */
	public LinkedQueue() {
		// TODO Auto-generated constructor stub
		first = null;
		last = null;
		size=0;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new QueueIterator();
		// TODO Auto-generated method stub
	}
	
	private class QueueIterator implements Iterator<Integer> {
		private Node curr = first;
		/** Returns current if current is not null
		 *
		 */
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return curr != null;
		}

		/**Iterates through the nodes
		 *@throws Error if empty
		 */
		@Override
		public Integer next() {
			if (!hasNext()) throw new IllegalArgumentException("Empty");
			int c = curr.item;
			curr = curr.next;
			return c;
		}
		
	}
	/**Checks size of list
	 *@return Int with value of list size
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	/**Checks if list is empty 
	 *@return Boolean value of whether it is empty or not
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (first == null) {return true;} else {return false;}
	}

	/**Creates a new node with the given int and links it to the list.
	 *@param element An int element to enqueue
	 *
	 */
	@Override
	public void enqueue(int element) {
		Node old = last;
		last = new Node();
		last.item = element;
		last.next = null;
		if (isEmpty()) {first = last;}
		else {old.next = last;}
		size++;
	}
		
	

	/**Dequeues the last item and returns it
	 * @throws IllegalArgumentException exception for empty queue
	 *@return dequeued item
	 */
	@Override
	public int dequeue() {
		if (isEmpty()) {throw new IllegalArgumentException("Empty");}
		int item = first.item;
		first = first.next;
		if(isEmpty()) {last=null;}
		size--;
		return item;
		
	}

	/**Returns item (int) of first node in queue
	 *@return First node int
	 */
	@Override
	public int first() {
		// TODO Auto-generated method stub
		return first.item;
	}

	/**Returns item (int) of last node in queue
	 *@return Last node int
	 */
	@Override
	public int last() {
		// TODO Auto-generated method stub
		return last.item;
	}
	/** Iterates through list and appends int of each node to a String which is then returned
	 *
	 */
	@Override
	   public String toString() {
		   Node current = first;
		   StringBuilder s = new StringBuilder();
		   System.out.println(first.next);
		   while (current != null) {
			s.append(current.item + "  ");
			current = current.next;
		   }
		   return s.toString();
	   }

}
