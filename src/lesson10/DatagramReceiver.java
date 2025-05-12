package lesson10;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class DatagramReceiver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try(final DatagramSocket	ds = new DatagramSocket(9999)) {
			final byte[]	content = new byte[5];
			final DatagramPacket	dp = new DatagramPacket(
									content, 
									content.length);
			
			ds.receive(dp);
			System.err.println("Received: "+new String(content, 0, dp.getLength()));
		}
	}

}
