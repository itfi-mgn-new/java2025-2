package lesson11;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Exercise {

	static final String[]	SOURCE = {	"ivanov,10,10000",  
										"petrov,10,20000",
										"sidorov,20,50000"
										};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,int[]>	sums = new HashMap<>();
		
		for (String	item : SOURCE) {
			final String[]	pieces = item.split(",");
			final int		key = Integer.valueOf(pieces[1]);
			final int		value = Integer.valueOf(pieces[2]);
			
			if (!sums.containsKey(key)) {
				sums.put(key, new int[] {0});
			}
			sums.get(key)[0] += value;
		}
		for (Entry<Integer, int[]> item : sums.entrySet()) {
			System.err.println(item.getKey()+"="+item.getValue()[0]);
		}	
	}

}
