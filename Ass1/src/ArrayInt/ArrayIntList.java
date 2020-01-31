package ArrayInt;

public class ArrayIntList extends AbstractIntCollection implements IntList {

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
		checkIndex(index, size+1);
		for (int i=size; i>index; i--) {
			values[i] = values[i-1];}
			size++;
			values[index] = n;
		
		if (size == values.length) {
			resize();
		}
		
	}

	@Override
	public void remove(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		checkIndex(index,size);
		for (int i=index;i<size;i++) {
			values[i] = values[i+1];}
		size--;
	}

	@Override
	public int get(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		checkIndex(index, size);
		return values[index];
	}

	@Override
	public int indexOf(int n) {
		// TODO Auto-generated method stub
		for (int i=0;i<size;i++) {
			if (values[i]==n) {
				return i;}
		}
		return -1;
	}

	
}
