package Day07�ϻ�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileReader1 {

	public static void main(String[] args) {
	try {
		Show();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

	private static void Show() throws IOException {
		Reader reader=new FileReader("F:\\��.txt");
		Writer writer=new FileWriter("E:\\��.txt");
		BufferedReader reader2=new BufferedReader(reader);
		BufferedWriter writer2=new BufferedWriter(writer);
		String lin=null;
		StringBuffer sBuffer=new StringBuffer();
		while ((lin=reader2.readLine())!=null) {
		sBuffer.append(lin);
		System.out.println("�滻ǰ��"+sBuffer);
		String newString=sBuffer.toString().replace("{name}", "ŷŷ");
		newString=sBuffer.toString().replace("{type}", "����");
		newString=sBuffer.toString().replace("{master}", "��ΰ");
		System.out.println("�滻��"+newString);
		writer.write(newString);
		}
		
	}

}
