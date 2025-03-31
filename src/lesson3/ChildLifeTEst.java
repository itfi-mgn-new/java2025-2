package lesson3;

public class ChildLifeTEst extends LifeCycleTEst {
	public static final int	x = 100;
	final double	y = 100 + Math.random();

	static {
		System.err.println("CHILD slkkdfjklkjfgklj");
	}
	
	final int 		z = 1000;
	final double	t = 1000+Math.random();
	int		value = 0;
	
	{
		System.err.println("CHILD Constructor");
	}
	
	public ChildLifeTEst() {
		super(3213212);
		System.err.println("URA!!!!!!");
	}	
	
	public ChildLifeTEst(int value) {
		this.value = value;  
	}
	
	public static void main(String[] args) {
		System.err.println("Hello world!");
		
		ChildLifeTEst cl = new ChildLifeTEst(/*cl*/);
		
		System.err.println("x="+LifeCycleTEst.x);
		System.err.println("z="+((LifeCycleTEst)cl).z);
		
		ChildLifeTEst cl1 = new ChildLifeTEst(123);
		ChildLifeTEst cl2 = new ChildLifeTEst(456);
		
		System.err.println("value1="+cl1.value);
		System.err.println("value2="+cl2.value);
		
		LifeCycleTEst.staticPrint();
		((LifeCycleTEst)cl1).print(/*cl1*/);
		((LifeCycleTEst)cl2)/*ChildLifeTEst*/.print(/*cl2*/);
		
	}
	
	static void staticPrint() {
		System.err.println("CHILD Static print!");
	}
	
	void print(/*ChildLifeTEst this*/) {
		super.print();
		System.err.println("CHILD NON-Static print! "+this.value);
	}
	
	//					this		VMT
	// invokestatic		-			-		High
	// invokevirtual	+			+
	// invokespecial	+			-
	// invokeinterface	+			+		Low
	
	
}
