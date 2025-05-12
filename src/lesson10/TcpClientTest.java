package lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClientTest {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		try(final Socket	s = new Socket("localhost",10000);
			final InputStream	is = s.getInputStream();
			final Reader		rdr = new InputStreamReader(is);
		    final BufferedReader		brdr = new BufferedReader(rdr);				
			final OutputStream os = s.getOutputStream();
			final PrintStream	ps = new PrintStream(os)) {
		
			ps.println("Hello world!");
			ps.flush();
			System.out.println("Result: "+brdr.readLine());
		}
	}

}
