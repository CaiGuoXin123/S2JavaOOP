package Day06;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStream1 {

	public static void main(String[] args) throws IOException {
		OutputStream os=new FileOutputStream("save.bin");
		ObjectOutputStream ob=new ObjectOutputStream(os);
		List<Book> list=new ArrayList<Book>();
		Book b1=new Book("大话设计模式", 52);
		Book b2=new Book("大话数据结构", 62);
		list.add(b1);
		list.add(b2);
		
		ob.writeObject(list);
		System.out.println("serialize success");
	}

}
