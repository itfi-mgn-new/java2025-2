package lesson10;

import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
 
import java.io.OutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
 
public class HttpServerTest{

		public static void main(String[] args) throws Exception {
	        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
	        server.createContext("/", new MyHandler());
	        server.setExecutor(null); // creates a default executor
	        server.start();
	    }
	 
	    static class MyHandler implements HttpHandler {
	        @Override
	        public void handle(HttpExchange t) throws IOException {
	            String response = "Hello, World!";
	            t.sendResponseHeaders(200, response.length());
	            OutputStream os = t.getResponseBody();
	            os.write(response.getBytes());
	            os.close();
	        }
	    }
}
