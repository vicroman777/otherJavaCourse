/*
 * File: ArrayIntList.java
 * Author: Jonas Lundberg
 * Date: 3 mar 2009
 */
package Example;

import java.util.Iterator;


public class ArrayIntList implements IntList {
	private int size = 0;
	private int[] values;
	
	public ArrayIntList() {values = new int[8];}
	
	@Override
	public void add(int n) {
		values[size++] = n;
		if (size == values.length) { // increase size
			resize();
		}
	}
	
	@Override
	public void addAt(int n, int index) throws IndexOutOfBoundsException {
		checkIndex(index,size+1);
		/* Shift right and add new value*/
		for (int i=size;i>index;i--) 
			values[i] = values[i-1];
		size++;
		values[index] = n;
		
		/* resize? */
		if (size == values.length) { // increase size
			resize();
		}
	}
	
	@Override
	public void remove(int index)  throws IndexOutOfBoundsException {
		checkIndex(index,size);
		for (int i=index;i<size;i++)
			values[i] = values[i+1];
		size--;
	}
	
	@Override
	public int get(int index) throws IndexOutOfBoundsException {
		checkIndex(index, size);
		return values[index];
	}
	
	@Override
	public int size() {return size;}
	
	@Override
	public int indexOf(int n) {
		for (int i=0;i<size;i++) {
			if (values[i]==n)
				return i;
		}
		return -1;
	}
	
	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("[");
		for (int i=0;i<size;i++) {
			buf.append(" "+values[i]);
		}

		buf.append(" ]");
		return buf.toString();
	}
	
	@Override
	public Iterator<Integer> iterator() {
		return new ListIterator();
	}
	
	/* 
	 * Private class members considered as implementation details. 
	 * 
	 */
	private void  resize() {
		int[] tmp = new int[2*values.length];
		System.arraycopy(values,0,tmp,0,values.length); 
		values = tmp;
	}
	
	private void checkIndex(int index, int upper) throws IndexOutOfBoundsException {
		if (index < 0 || index >= upper) {
			String msg = "Index = "+index+", Upper boundary = "+upper;
			throw new IndexOutOfBoundsException(msg);
		}
	}
	
	class ListIterator implements Iterator<Integer> {
		private int count = 0;
		public Integer next() {return values[count++];}
		
		public boolean hasNext() {return count<size;}
		
		public void remove() {
			throw new RuntimeException("remove() is not implemented");
		}
	}
}