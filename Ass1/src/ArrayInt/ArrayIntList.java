package ArrayInt;

public class ArrayIntList extends AbstractIntCollection implements IntList {

	private int size = 0;
	public ArrayIntList() {
		// TODO Auto-generated constructor stub
	
	}

	@Override
	public void add(int n) {
		// TODO Auto-generated method stub
		values[size++] = n;
		if (size == values.length) {
			resize();
		}
	}

	@Override
	public void addAt(int n, int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub

	}

	@Override
	public int get(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int indexOf(int n) {
		// TODO Auto-generated method stub
		return 0;
	}

}
