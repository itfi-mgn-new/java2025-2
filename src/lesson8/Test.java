package lesson8;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		try(final InputStream is = new FileInputStream("c:/users/student/desktop/test.txt");
			final Reader	rdr = new InputStreamReader(is);
			final BufferedReader	brdr = new BufferedReader(rdr);
			final OutputStream os = new FileOutputStream("c:/users/student/desktop/test2.txt");
			final PrintStream	ps = new PrintStream(os)) {
			
			String	line;
			int	sum = 0;
			int	 count = 0;
			while ((line = brdr.readLine()) != null) {
				final String[] pieces = line.trim().split(",");
				sum += Integer.valueOf(pieces[1].trim());
				count++;
				
				ps.print(normalize(pieces[0]));
				ps.print(',');
				ps.println(pieces[1].trim());
			}
			System.err.println("Avg = "+(1.0 * sum / count));
			ps.flush();
		}
	}

	private static String normalize(String s) {
		StringBuilder sb = new StringBuilder();
		
		for(String item : s.split("\\s+")) {
			sb.append(' ').append(Character.toUpperCase(item.charAt(0)));
			for(int i = 1; i < item.length(); i++) {
				sb.append(Character.toLowerCase(item.charAt(i)));
			}
		}
		return sb.substring(1);
	}

}
