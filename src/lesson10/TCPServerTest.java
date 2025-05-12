package lesson10;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try(final ServerSocket	ss = new ServerSocket(10000)) {
			for (;;) { 
				final Socket	s = ss.accept();
	
				new Thread(()->{process(s);}).start();
			}
		}
	}
	
	static void process(final Socket s)  {
		try(final InputStream	is = s.getInputStream();
			final OutputStream	os = s.getOutputStream(); 
			final Reader		rdr = new InputStreamReader(is);
		    final BufferedReader		brdr = new BufferedReader(rdr);
			final PrintStream	ps = new PrintStream(os)) {
		
		    System.err.println("Local: "+s.getLocalAddress());
		    System.err.println("Remote: "+s.getRemoteSocketAddress());
		
		    String	line;
		
		    while ((line = brdr.readLine()) != null) {
		    	System.err.println("Line="+line);
		    	ps.println(line.toUpperCase());
		    	ps.flush();
		    }
		    s.close();
		} catch (IOException exc) {
			exc.printStackTrace();
		}
	}
}
