package lesson5;

public class LocalClassTest {
	static int x = 10;
	int y = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z = 30;
		
		class MyClass {
			final static int t = 10;
			int u = 50;
		
			// public MyClass(int z) {}
			
			void print() {
				int a = 123;
				
				System.err.println("Sum="+a+u+t+z+y+z);
			}
		}
		
		MyClass mc = new MyClass();
		
		
	}

	void test() {
		int z = 30;
		
		class MyClass {
			final static int t = 10;
			int u = 50;

			// public MyClass(LocalClassTEst this$0, int z) {}
			
			void print() {
				int a = 123;
				
				System.err.println("Sum="+a+u+t+z+y+z);
			}
		}

		MyClass mc = /*this.*/new MyClass();
	}
	
}
