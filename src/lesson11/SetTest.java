package lesson11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String>	s = new HashSet<>();
		
		System.err.println("Suze="+s.size());

		s.add("petya");
		s.add("vassya");
		s.add("vassya");
		s.add("vassya");
		System.err.println("Suze="+s.size());
		System.err.println("Contains="+s.contains("sdlfjlsdjfklj"));
		System.err.println("Contains="+s.contains("vassya"));

		for (String item : s) {
			System.err.println("Item="+item);
		}
		
		s.addAll(Arrays.asList("masha","vassya"));
		System.err.println("S U S2="+s);

		s.retainAll(Arrays.asList("masha","vassya"));
		System.err.println("S ^ S2="+s);

		s.removeAll(Arrays.asList("masha"));
		System.err.println("S - S2="+s);
		
		System.err.println("REmove="+s.remove("vassya"));
		System.err.println("REmove="+s.remove("vassya"));

		
		
	}

}
