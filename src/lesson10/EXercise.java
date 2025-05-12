package lesson10;

import java.io.Reader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class EXercise {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try(final Reader	rdr = new InputStreamReader(System.in);
			final BufferedReader	brdr = new BufferedReader(rdr);) {
		
			String	line;
			
			while ((line = brdr.readLine()) != null) {
				System.err.println("Line: "+line.toUpperCase());
			}
		}
	}

}
