package lesson3;

public class INterfaceTEst implements MyInterface1, MyInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		INterfaceTEst	it = new INterfaceTEst();
		MyInterface1 	mi = it;
		MyInterface2 	mi2 = it;
		Parent p = mi;
		p = mi2;
		call(it);
		call(new ZZZZZ());
	}
	
	static void call(MyInterface1 mi) {
		mi.print();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print2() {
		// TODO Auto-generated method stub
		
	}

}

interface Parent {
/* public static final */	int	x = (int)Math.random();
	/*public abstract*/void print();
}

/*abstract */ interface MyInterface1 extends Parent {
//	/*public abstract*/void print();
}

/*abstract */ interface MyInterface2 extends Parent {
//	/*public abstract*/void print();
	/*public abstract*/void print2();
}

class ZZZZZ implements MyInterface1 {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}

