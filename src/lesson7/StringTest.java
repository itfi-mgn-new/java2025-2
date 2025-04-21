package lesson7;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder	sb = new StringBuilder();
		
		sb.append("x=").append(20).toString();
		System.err.println("X="+20/*new StringBuilder().append("x=").append(20).toString()*/);
	}
}
