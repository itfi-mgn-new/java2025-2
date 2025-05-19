package lesson11;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String>	m = new HashMap<>();
		
		System.err.println("Size="+m.size());
		System.err.println("Put="+m.put("vassya","123"));
		System.err.println("Put="+m.put("vassya","456"));
		System.err.println("Remove="+m.remove("vassya"));

		m.put("vassya","123");
		m.put("petya","123");
		
		for (Entry<String, String> item : m.entrySet()) {
			System.err.println(item.getKey()+"="+item.getValue());
		}
		
	}

}
