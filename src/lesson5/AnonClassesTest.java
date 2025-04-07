package lesson5;

import java.util.Arrays;

public class AnonClassesTest {
	static int z = 10;
	int y = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20;
		
		MyINterface mi = new MyINterface(/*x*/) {
							{
								System.err.println("ldkfkjgklkdjflkgj");

							}
			
						@Override
						public void print() {
							// TODO Auto-generated method stub
							System.err.println("Sum"+/*val$*/x+/*y*/+z);
						}
					};
		MyINterface mi2 = new MyINterface(/*x*/) {
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.err.println("Sum"+/*val$*/x+/*y*/+z);
			}
		};

		//x = 20;
		Class cl = mi.getClass();
		System.err.println("Name="+cl.getName());
		System.err.println("Name="+cl.getCanonicalName());

		System.err.println("Fields="+Arrays.toString(cl.getDeclaredFields()));
		System.err.println("Constructor="+Arrays.toString(cl.getDeclaredConstructors()));

		new AnonClassesTest().test();
	}

	void test() {
		int x = 100;
		
		MyINterface mi = new MyINterface(/*x*/) {
			{
				System.err.println("ldkfkjgklkdjflkgj");

			}

		@Override
		public void print() {
			// TODO Auto-generated method stub
			
			System.err.println("Sum"+/*val$*/x+/*AnonClassTest.this.*/y+z);
		}
	};
	Class cl = mi.getClass();
	System.err.println("Name="+cl.getName());
	System.err.println("Name="+cl.getCanonicalName());

	System.err.println("Fields="+Arrays.toString(cl.getDeclaredFields()));
	System.err.println("Constructor="+Arrays.toString(cl.getDeclaredConstructors()));
	}
	
}

interface MyINterface {
	void print();
}

class ZZZ implements MyINterface {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}
