package lesson6;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String	x = "vassya";
//		int xx = "vassya".length();
		
		System.err.println("LEngth="+x.length());
		
		System.err.println("char[0]="+x.charAt(0));

		System.err.println("Equals="+"vassya".equals(x));
		System.err.println("Equals="+x.equalsIgnoreCase("VaSsYa"));
		
		System.err.println("Compare="+"vassya".compareTo(x));
		System.err.println("Compare="+"vassya".compareToIgnoreCase(x));

		System.err.println("Index Of="+x.indexOf("ss", 3));
		System.err.println("Index Of="+x.lastIndexOf("ss"));

		System.err.println("Index Of="+x.indexOf('s', 3));
		
		System.err.println("Starts with: "+x.startsWith("va"));
		System.err.println("Ends with: "+x.endsWith("ya"));
		System.err.println("Contains: "+x.contains("ss"));

		System.err.println("Contains: "+x.substring(3));
		System.err.println("Contains: <"+x.substring(3,3)+">");
		
		System.err.println("Replace: "+x.replace("ss",""));
		System.err.println("Split: "+Arrays.toString(x.split("a")));
		
	}

}
