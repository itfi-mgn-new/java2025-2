package lesson4;

import java.lang.reflect.Field;

import lesson3.ChildLifeTEst;

public class Exercise {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		System.err.println("Sum="+calclSum(new ChildLifeTEst()));
	}

	static int calclSum(final Object something) throws IllegalArgumentException, IllegalAccessException {
		// TODO: seek all int fields and calculate theirs sum
		Class	cl = something.getClass();
		int		sum = 0;
		
		while (cl != null) {
			for(Field f : cl.getDeclaredFields()) {
				if (f.getType() == int.class) {
					f.setAccessible(true);
					sum += f.getInt(something);
				}
			}
			cl = cl.getSuperclass();
		}
		return sum;
	}
}
