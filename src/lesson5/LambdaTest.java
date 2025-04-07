package lesson5;

import java.util.Arrays;

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.err.println("Val="+execute(
//					new TestInterface() {
//						@Override
//						public int calculate(int x, int y) {
//							return x + y;
//						}
//					}
//				));
		System.err.println("Val="+execute(LambdaTest::ttttt));
		System.err.println("Val="+execute((x,y)->x-y));
		
		Class cl = LambdaTest.class;
		System.err.println("OWNER MEthods="+Arrays.toString(cl.getDeclaredMethods()));
		
	}
	
//	typedef int (*ref)(int,int);
//	
//	ref x;
//	
//	(*x)(3,5);
	
	
	static int zzzzz(int x, int y) {
		return x + y;
	}

	static int ttttt(int x, int y) {
		return x - y;
	}
	
	static int execute(final TestInterface subj) {
		Class	cl = subj.getClass();
		
		System.err.println("Name="+cl.getName());
		System.err.println("MEthods="+Arrays.toString(cl.getDeclaredMethods()));
		
		
		return subj.calculate(3, 5);
	}
}

@FunctionalInterface
interface TestInterface {
	int calculate(int x, int y);
	default int calculate(double x, double y) {return calculate((int)x,(int)y);}
}