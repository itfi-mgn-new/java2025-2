package lesson4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import lesson3.ChildLifeTEst;

class Parent {
	public int	x1 = 10;
	static int y1 = 200;
}


public class REflectionTest extends Parent {
	public int	x = 10;
	static int y = 200;
	
	public void print(final int xxxxx) {
		System.err.println("XXXXX="+xxxxx);
	}

	public void print(final int xxxxx, final int yyyyy) {
		System.err.println("XXXXX="+(xxxxx+yyyyy));
	}
	
	public void print(final double xxxxx) {
		System.err.println("XXXXX="+xxxxx);
	}
	
	public static void main(final String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
		test(new REflectionTest());
//		test(new ChildLifeTEst());
	}
	
	static void test(final Object obj) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
		Class	cl = obj.getClass();
		// int.class;
				
		System.err.println("Name: "+cl.getName());
		System.err.println("Name: "+cl.getCanonicalName());
		System.err.println("Short name: "+cl.getSimpleName());
		System.err.println("Package: "+cl.getPackage());
		
		System.err.println("Fields: "+java.util.Arrays.toString(cl.getFields()));
		System.err.println("Fields: "+java.util.Arrays.toString(cl.getDeclaredFields()));
		System.err.println("Super class: "+cl.getSuperclass());
		System.err.println("Super class fields: "+java.util.Arrays.toString(cl.getSuperclass().getDeclaredFields()));
	
		Field f1 = cl.getField("x");
		System.err.println("Field type: "+f1.getType());
		System.err.println("Field value: "+f1.getInt(obj));
		
	//	f1.setInt(obj, 150);
	//	System.err.println("New field value: "+((REflectionTest)obj).x);

		Field f2 = cl.getDeclaredField("y");
		System.err.println("Field type: "+f2.getType());
		
		f2.setAccessible(true);
		System.err.println("Field value: "+f2.getDouble(obj));
		
		f2.setInt(obj, 1000);
//		System.err.println("New field value: "+((REflectionTest)obj).x);
	
		System.err.println("MEthods: "+Arrays.toString(cl.getMethods()));
		
		Method pm = cl.getMethod("print", int.class, int.class);

		System.err.println("Parmeters: "+Arrays.toString(pm.getParameters()));
		System.err.println("Return type: "+pm.getReturnType());
		
		pm.invoke(obj, 10, 20);
		
		System.err.println("COnstructors: "+Arrays.toString(cl.getConstructors()));
		
		Constructor pc = cl.getConstructor();
		
		System.err.println("Parmeters: "+Arrays.toString(pc.getParameters()));

		Object result = pc.newInstance();
		
		System.err.println("REsult: "+result);

		((REflectionTest)result).print(100,200);
	}
}
