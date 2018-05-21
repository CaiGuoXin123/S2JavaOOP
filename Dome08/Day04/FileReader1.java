package Day04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class FileReader1 {

	public static void main(String[] args) throws Exception {
		Reader reader=new FileReader("F:\\Íí×ÔÏ°.txt");
		BufferedReader vReader=new BufferedReader(reader);
		String linr=vReader.readLine();
		System.out.println(linr);
		vReader.close();
		reader.close();
	}

}
