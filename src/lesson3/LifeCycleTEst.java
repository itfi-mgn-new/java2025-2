package lesson3;

public class LifeCycleTEst {
	static final int	x = 10;
	static final double	y = Math.random();
	
	/* 
	 * public static void <clnit>() {
	 *    y = Math.random();
	 *    System.err.println("slkkdfjklkjfgklj"); 
	 * }
	 * 
	 */

	static {
		System.err.println("slkkdfjklkjfgklj");
	}
	
	final int 		z = 100;
	final double	t = Math.random();
	
	{
		System.err.println("Constructor");
	}
	
	/* 
	 * public static void <init>() {
	 * 	super.<init>();
		this.z = 100;
		this.t = Math.random();
	    System.err.println("Constructor");
	 * }
	 */
	
	public LifeCycleTEst() {
//		this.z = 100;
//		this.t = Math.random();
//	    System.err.println("Constructor");
		System.err.println("URA!!!!!!");
	}

	public LifeCycleTEst(int sssss) {
//		this.z = 100;
//		this.t = Math.random();
//	    System.err.println("Constructor");
		System.err.println("URA!!!!!! "+sssss);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Hello world!");
		
		LifeCycleTEst t = new LifeCycleTEst();
		
		LifeCycleTEst.staticPrint();
		t.print();
		
	}

	static void staticPrint() {
		System.err.println("Static print!");
	}
	
	void print() {
		System.err.println("NON-Static print!");
	}
	
	static {
		System.err.println("ew858903");
	}

}
