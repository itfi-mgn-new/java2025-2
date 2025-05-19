package lesson11;

import java.util.ArrayList;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>	l = new ArrayList<>();
		List<String>[]	arr = new List[1]; 
		
		System.err.println("size="+l.size());
		l.add((String)"vassya");
		l.add((String)"petya");
		l.add((String)"ivan");
		l.add(10);
		System.err.println("size="+l.size());

		System.err.println("Value="+((String)l.get(0)));	// l[0]
		for (Object item : l) {
			System.err.println("Value: "+item);	// l[0]
		}
		l.set(1, "12345");	// l[1] = "12345";
		System.err.println("Value="+l.get(1));	// l[1]

		for (Object item : l) {
			l.remove(0);
		}
		
		System.err.println("REmove: "+l.remove(0));
		//l.add(10);
		
		ttt(l);
	}
	
	static void ttt(final List l) {
		l.add(10);
	}

}
