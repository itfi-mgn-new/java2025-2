package lesson5;

import java.util.Arrays;

import javax.lang.model.element.NestingKind;

public class NEstedClassesTEst {
	int x = 10;
	static double y = Math.random();

	void print() {
	}
	
	static void sttaticPrint() {
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class	cl = InnerCLass.class;
		
		System.err.println("Fields: "+Arrays.toString(cl.getDeclaredFields()));
		System.err.println("Constructors: "+Arrays.toString(cl.getDeclaredConstructors()));
	
		NEstedClassesTEst	owner = new NEstedClassesTEst();
		InnerCLass ic = /*owner.*/new InnerCLass(/*owner*/);
	}

	private static class InnerCLass {
		/* NestedClassTEst this$0*/
		int	innerX = 10;
		double innerY = Math.random();

		/*
		 * public InnerCLass(NestedClassTEst){....}
		 */
		
		void print() {
			int zzz = 0;
			sttaticPrint();
			System.err.println("sum="+// /*this$0.*/x+
					/*NEstedClassesTEst.*/y+
					innerX+innerY+zzz);
			/*NEstedClassesTEst.this.*//*this$0*/print();
		}
		
		static void sttaticPrint() {
		}
	}
	
}
