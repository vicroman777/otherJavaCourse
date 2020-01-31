package ArrayInt;

public class AbstractMain {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayIntStack s = new ArrayIntStack();
		ArrayIntList l = new ArrayIntList();
		//try {s.pop();}
		//catch (Exception e) {System.out.println(e);}
		s.push(5);
		s.push(3);
		s.push(6);
		System.out.println(s.peek());
		System.out.println(s.toString());
		s.pop();
		System.out.println(s.toString());
		s.push(7);
		System.out.println(s.toString());
		
		l.add(2);
		l.add(5);
		l.add(1);
		l.add(3);
		System.out.println(l.toString());
		l.addAt(0, 1);
		System.out.println(l.toString());
		l.addAt(0,3);
		System.out.println(l.toString());
		l.remove(1);
		System.out.println(l.toString());
		System.out.println(l.indexOf(2));
		System.out.println(l.get(0));

	}

}
