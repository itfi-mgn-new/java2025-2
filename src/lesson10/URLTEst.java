package lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class URLTEst {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final URI	uri = URI.create("file:/DFInstall.log");
		final URL	url = uri.toURL();
		final HttpURLConnection	conn = (HttpURLConnection)url.openConnection();
		
		conn.setRequestMethod("POST");
		conn.setRequestProperty("accept","s'.;dksajdlkkjasd");
		
		try(final InputStream	is = conn.getInputStream();//.openStream();
			final Reader		rdr = new InputStreamReader(is);
		    final BufferedReader		brdr = new BufferedReader(rdr))  {
			
			System.err.println("Line = "+brdr.readLine());
			
		}
		
	}

}

