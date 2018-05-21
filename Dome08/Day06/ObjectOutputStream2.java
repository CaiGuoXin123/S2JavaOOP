package Day06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectOutputStream2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		InputStream iStream=new FileInputStream("save.bin");
          ObjectInputStream oStream=new ObjectInputStream(iStream);
          List<Book> list=(List<Book>)oStream.readObject();
          for (Book book : list) {
			System.out.println(book.getName());
		}
	}

}
