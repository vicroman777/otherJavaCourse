
public class StringQueue implements StringStack {

	String arr[] = new String[5];
	int size = 0;
	int last = 0;
	int lastfull = 0;
	@Override
	public int size() {
		size = 0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i] != null) {
				size++;
			}
		}
		return size;
	}

	@Override
	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		}
		else return false;
	}

	@Override
	public void push(String element) {
		// TODO Auto-generated method stub
		try {
		arr[last] = element;
		lastfull = last;
		last++;}
		catch (Exception e ) {
			System.out.println(e + "stack is full");
		}
	}

	@Override
	public String pop() {
	try {
		String temp = arr[lastfull];
		arr[lastfull] = null;
		lastfull--;
		last--;
		return temp;
	}
	catch (Exception e) {
		System.out.println("probably empty");
	}
	return null;
	}

	@Override
	public String peek() {
		String temp = null;
		try {
			temp = arr[lastfull];
			return temp;
		}
		catch (Exception e) {
			System.out.println("probably empty");
		}
		return temp;
	}

	public void printArr() {
		for (int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
		}
	}
	
	
}
