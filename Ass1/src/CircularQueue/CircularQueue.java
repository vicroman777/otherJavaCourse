package CircularQueue;

import java.util.Iterator;

import LinkedQueue.IntQueue;

public class CircularQueue extends AbstractIntCollection implements IntQueue {

	int first = 0;
	int last = 0;
	int size = 0;
	int[] q = new int[5];
	public CircularQueue() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enqueue(int element) {
		// TODO Auto-generated method stub
		if (!checkIndex(size, size+1)) {
			System.out.println("a");
			resize();}
		System.out.println("a");

		q[size] = element;
		size++;
		first++;
		
	}

	@Override
	public int dequeue() {
		// TODO Auto-generated method stub
		if (isEmpty()) {throw new IllegalArgumentException("Empty");}
		if (last == first) {
			
		}
		int lastn = q[last];
		last++;
		return lastn;
	}

	@Override
	public int first() {
		// TODO Auto-generated method stub
		return q[first];
	}

	@Override
	public int last() {
		// TODO Auto-generated method stub
		return q[last];
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (int i = first; i!=last; i = (i+1)%size) {
			System.out.println(i);
			s.append(q[i] + " ");
		}
		return s.toString();
	}

}
