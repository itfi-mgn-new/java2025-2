package lesson8;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class IOTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[]	content;
		
		try(final OutputStream	os = new ByteArrayOutputStream(); 
				
				//new FileOutputStream("c:\\Users\\Student\\Desktop\\New Text Document (4).txt");
//			final GZIPOutputStream	gzos = new GZIPOutputStream(os);
			final Writer	wr = new OutputStreamWriter(os);
			final PrintWriter	pw = new PrintWriter(wr)) {
			
			pw.println("slkdfkkkl;skd;flk;sldfk");
			pw.println(12345);
			pw.flush();
			content = ((ByteArrayOutputStream)os).toByteArray();
		}
		
		try(final InputStream	is = new ByteArrayInputStream(content); 
				//new FileInputStream("C:\\Users\\Student\\Desktop\\New Text Document (4).txt");
//			final GZIPInputStream	gzis = new GZIPInputStream(is);
			final Reader		rdr = new InputStreamReader(is);
			final BufferedReader	brdr = new BufferedReader(rdr)) {
//			byte[]	buffer = new byte[100];
//			char[]	buffer = new char[100];
//			int	len,  displacement = 0;
//			
//			while ((len = rdr.read(buffer, displacement, buffer.length - displacement)) > 0) {
//				System.err.println("Data=<"+new String(buffer, displacement, len)+">");
//				displacement += len;
//			}
			String	s;
			
			while ((s = brdr.readLine()) != null) {
				System.err.println("line="+s);
			}
		} // finally {
		// is.close();
		// }
		
	}

}
