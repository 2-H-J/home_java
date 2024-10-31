package e04_object_io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectReadTest {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		
		try(FileInputStream fis = new FileInputStream("person.dat");
			ObjectInputStream ois = new ObjectInputStream(fis)){
			
			try {
				while(true) {
					//System.out.println(ois.readObject());
					list.add((Person) ois.readObject());
				}
			}catch (EOFException e) {
				System.out.println("파일 읽기 종료");
			}
			list.forEach(t -> System.out.println(t));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}







