package lesson1;

import java.lang.*;
import lesson1.*;

public class HelloWorld /*extends java.lang.Object*/ {
	public static int	x = 10;
	
	public int			y = 20; 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int		z = 909;
		
		byte	b1 = 100, b2 = 100, b3 = (byte)(b1 + b2);
		
		System.err.println("b3="+b3);
		
		int		i1 = 10, i2 = 0xbf0e, i3 = 0b0010, i4 = 077;
		long	long1 = 123_456_7_8__900_1234_45L;
		float	f2 = 1.5f;
		double	d1 = 1.5e22d;
		char	c1 = 13, c2 = '\n', c3 = '\015', c4 = '\u24FE';
		
		
		long	val1 = 12345, val2 = 54321;
		double	vald1 = 10, vald2 = 20;
		
		boolean	bool1 = true, bool2 = false;
		
		int		zzz = (bool1 ? (10) : (-10));
		
		
		
		
//		System.err.println("Hello world");
	}

}
