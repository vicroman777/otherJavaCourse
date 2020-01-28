
public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringQueue s = new StringQueue();
		System.out.println(s.size());

		s.push("asd");
		s.push("lmao");
		System.out.println(s.size());
		System.out.println(s.pop());
		System.out.println(s.size());
		System.out.println(s.pop());
		s.pop();
		s.push("lel");
		s.push("lul");
		s.push("hurr");
		System.out.println(s.peek());
		System.out.println(s.size());
		s.pop();
		System.out.println(s.size());
		
}

}
