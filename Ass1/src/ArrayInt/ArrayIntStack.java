package ArrayInt;

public class ArrayIntStack extends AbstractIntCollection implements IntStack {

	public ArrayIntStack() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void push(int n) {
		// TODO Auto-generated method stub
		values[size++] = n;
	}

	@Override
	public int pop() throws IndexOutOfBoundsException {
		return values[size--];
	}

	@Override
	public int peek() throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return values[size-1];
	}
	
	@Override
	public int size() {
		return size;
	}
	
	@Override
	public boolean isEmpty() {

		if (size == 0 ) { return true;}
		else return false;
	}



}
