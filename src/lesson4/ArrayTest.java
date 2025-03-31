package lesson4;

import java.lang.reflect.Array;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]	x = new int[] {10,20,30};
		
		System.err.println("X[0]="+x[0]);
		System.err.println("X[0]="+Array.getInt(x, 0));
		Array.setInt(x, 0, 123);
		System.err.println("X[0]="+x[0]);
		System.err.println("length: "+x.length);
		System.err.println("length: "+Array.getLength(x));

		int[] y = new int[10], z = (int[])Array.newInstance(int.class, 10);
		
		

	}

}
