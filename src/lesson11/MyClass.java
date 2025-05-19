package lesson11;

public class MyClass<Type1 extends Number, Type2> {
	
//	public static Type1 x;
	
	public Type1	val1;
	public Type2	val2;
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class	cl = MyClass.class;
		
		MyClass<Integer,Object> z;
		MyClass<Long,Object> z2;
		MyClass<Double,Object> z3;
//		MyClass<String,Object> z4;
		
		System.err.println("F: "+cl.getField("val1"));
		
		if (getValue("true",boolean.class)) {
			
		}
		
		add(new Integer[] {1,2,3}, new Integer[] {4,5});
//		add(new Double[] {1.0,2.0,3.0}, new String[] {"",""});
	}
	
//	public static <T> T[] add(T[]... arrays) {
//		return null;
//	}
	
	public static <T extends Number> T[] add(T[] arg1, T[] arg2) {
		return null;
	}
	
	public static <T> T getValue(String source, Class<T> awaiited) {
		return null;
	}

	public static <Type1, Type2> void zzz(Type1 t1, Type2 t2) {{
		
	}
	
}
