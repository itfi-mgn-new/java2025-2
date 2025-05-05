package lesson9;

import java.io.*;
import java.util.Arrays;

public class DataTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Location	l = new Location("lenina", 68);

		try(final OutputStream		os = new FileOutputStream("c:/users/student/test.txt");
			final ObjectOutputStream	dos = new ObjectOutputStream(os)) {
			
			dos.writeBoolean(true);
			dos.writeBoolean(false);
			dos.writeInt(123);
			dos.writeDouble(123.456);
			dos.writeUTF("test string");
			dos.writeObject(new int[] {1,2,3,4,5});
			
			
			dos.writeObject(new Person("ivanov","i","i",21,l));
			
			dos.reset();
			
			dos.writeObject(new Person("petrov","p","p",25,l));
			dos.flush();
		}
		
		try(final InputStream		is = new FileInputStream("c:/users/student/test.txt");
			final ObjectInputStream	dis = new ObjectInputStream(is)) {
			
			System.err.println("Boolean: "+dis.readBoolean());
			System.err.println("Boolean: "+dis.readBoolean());
			System.err.println("Int: "+dis.readInt());
			System.err.println("Double: "+dis.readDouble());
			System.err.println("UTF: "+dis.readUTF());
			
			int[] value = (int[])dis.readObject();
			
			System.err.println("Object: "+Arrays.toString(value));

			Person	p1 = (Person)dis.readObject();
			Person	p2 = (Person)dis.readObject();
			
			System.err.println("Person[1]: "+p1);
			System.err.println("Person[2]: "+p2);
			System.err.println("Location: "+(p1.l == p2.l));
			System.err.println("Location: "+(l == p2.l));
			
			
			
//			System.err.println("UTF: "+dis.readUTF());
		}
		
	}

}
