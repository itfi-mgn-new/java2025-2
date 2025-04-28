package lesson8;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try(final OutputStream	os = new FileOutputStream("c:/Users/Student\\Desktop\\New ZIP.zip");
			final ZipOutputStream	zos = new ZipOutputStream(os)) {

			ZipEntry	ze = new ZipEntry("folder/part1");
			ze.setMethod(ZipEntry.DEFLATED);
			zos.putNextEntry(ze);
			
			PrintStream	ps = new PrintStream(zos);
			
			ps.println("test string");
			ps.flush();
			
			zos.closeEntry();
		
			ze = new ZipEntry("folder/part2");
			ze.setMethod(ZipEntry.DEFLATED);
			zos.putNextEntry(ze);
			
			PrintStream	ps2 = new PrintStream(zos);
			
			ps2.println("test string 2");
			ps2.flush();
			
			zos.closeEntry();
		}
		
		
		
		try(final InputStream	is = new FileInputStream("c:\\Users\\Student\\Desktop\\New ZIP.zip");
			final ZipInputStream	zis = new ZipInputStream(is)) {
			
			ZipEntry	ze;
			
			while ((ze = zis.getNextEntry()) != null) {
				Reader	rdr = new InputStreamReader(zis);
				BufferedReader	brdr = new BufferedReader(rdr);
				
				System.err.println("Name="+ze.getName()+", content="+brdr.readLine());
			}
			
			
		}
		
	}

}
