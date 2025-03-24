package lesson3;

public class ChildLifeTEst extends LifeCycleTEst {
	static final int	x = 100;
	static final double	y = 100 + Math.random();

	static {
		System.err.println("CHILD slkkdfjklkjfgklj");
	}
	
	final int 		z = 1000;
	final double	t = 1000+Math.random();
	
	{
		System.err.println("CHILD Constructor");
	}
	
	public ChildLifeTEst() {
		super(3213212);
		System.err.println("URA!!!!!!");
	}	
	
	public static void main(String[] args) {
		System.err.println("Hello world!");
		
		ChildLifeTEst cl = new ChildLifeTEst();
		
		System.err.println("x="+LifeCycleTEst.x);
		System.err.println("z="+((LifeCycleTEst)cl).z);
		
		
		
	}
}
