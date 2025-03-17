package lesson2;

import java.util.Objects;

public class ObjectTest {
 
	int x = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object	x = null, y = new Object(), z = y;

		System.err.println(y);
		
		y = null;
		z = null;

		int[]	ax = null, ay = new int[10], az = ay.clone();
		
		System.err.println("ay[0]="+ay[0]);
		System.err.println("az[0]="+az[0]);
		ay[0] = 10;
		System.err.println("az[0]="+az[0]);
		
		int[][]	aax = new int[][] {new int[2], null, new int[3]};
		
		System.err.println("Length="+aax.length);

	}

}
