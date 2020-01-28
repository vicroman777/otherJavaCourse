/**
 * ListMain.java
 * Date: 27 feb 2008
 * Author: Jonas Lundberg
 */
package Example;

import java.util.Iterator;

/**
 * @author jonasl
 *
 */
public class ListMain {


	public static void main(String[] args) {
		IntList al = new ArrayIntList();
		testList(al);
		
//		IntList ll = new LinkedIntList();
//		testList(ll);

	}

	private static void testList(IntList list) {
		System.out.println("Testing "+list.getClass().getName());
		for (int i=0;i<10;i++)
			list.add(i*10);
		System.out.println(list);
		System.out.println("Size = "+list.size());
		System.out.println("At pos 5: = "+list.get(5));
		System.out.println("At pos 0: = "+list.get(0));
		System.out.println("At pos 9: = "+list.get(9));
		
		list.remove(9);  // last
		list.remove(0);  
		list.remove(4); 
		System.out.println(list);
		list.addAt(99,0);  
		list.addAt(99,3); 
		list.addAt(99,9);  //last
		System.out.println(list);
		System.out.println("Size = "+list.size());
		System.out.println("Index of 99: = "+list.indexOf(99));
		System.out.println("Index of 40: = "+list.indexOf(40));
		System.out.println("Index of 555: = "+list.indexOf(555));
		
		Iterator<Integer> it = list.iterator();
		while (it.hasNext())
			System.out.print("  "+it.next());
		System.out.println("\n\n");		
	}
}
