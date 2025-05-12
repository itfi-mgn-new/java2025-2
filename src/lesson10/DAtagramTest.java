package lesson10;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class DAtagramTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try(final DatagramSocket	ds = new DatagramSocket(10000)) {
			final byte[]	content = "hello world".getBytes();
			final DatagramPacket	dp = new DatagramPacket(
									content, 
									content.length, 
									new InetSocketAddress("localhost", 9999));
			
			ds.send(dp);
			System.err.println("Completed");
		}
	}

}
