package lesson6;

import java.io.IOException;

public class EXceptionTEst {
	static void error(int errno) throws RuntimeException, Exception, Throwable {
		switch (errno) {
			case 0 : throw new RuntimeException("Runtime!!!");
			case 1 : throw new Exception("Exception!!!");
			case 2 : throw new Throwable("Throwable!!!");
			case 3 :
				return;
		}
	}
	
	static void nestedError(int errno) throws Throwable {
		try {
			error(errno);
		} catch (Exception e1) {
			System.err.println("Nested exception");
			e1.printStackTrace();
		} finally {
			System.err.println("++++++++++");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throwable	t = new Throwable("Something wrong!!!");
		
		for (int errno = 0; errno <= 3; errno++) {
			try {
				System.err.println("Begin");
				nestedError(errno);
				System.err.println("Success");
			} catch (RuntimeException e) {
				System.err.println("RUntime detected");
				e.printStackTrace();
			} catch (Exception e) {
				System.err.println("EXception detected");
				e.printStackTrace();
			} catch (Throwable e) {
				System.err.println("Throwable detected");
				e.printStackTrace();
			} finally {
				System.err.println("----------");
			}
		}
		
		
//		try {
//			// lfsjgkldkfgl;fkdflgkl;dfg
//			throw t;
//		} catch (Throwable e) {
//			// process exception....
//		} finally {
//			// Mandatory final block
//		}
		
	}

}
