package lesson5;

import java.util.Arrays;

public class EnumTEst {
	public static void main(String[] args) {
		MyEnum	z = MyEnum.FRIDAY;
		
		System.err.println("Ordinal: "+z.ordinal());
		System.err.println("Name: "+z.name());
		System.err.println("Russian: "+z.getRussianName());
		System.err.println("Values: "+Arrays.toString(MyEnum.values()));
		
		System.err.println("Z == SUNDAY "+(z == MyEnum.SUNDAY));
		
		switch (z/*.ordinal()*/) {
			case FRIDAY/*.ordinal()*/ :
				System.err.println("YES!!!");
				break;
			case MONDAY :
				System.err.println("NO!!!");
				break;
			default :
				System.err.println("jdsfklsdjdfgkljksldfk");
		}
		
		Class	cl = EnumTEst.class;
		
		System.err.println("MEthods: "+Arrays.toString(cl.getDeclaredMethods()));
		
	}
}
