package Day03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FilOutputStream1 {

	public static void main(String[] args) {
		try {
			writeDataToDisk();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void writeDataToDisk() throws Exception {
		FileOutputStream fis=new FileOutputStream("F:\\����ϰ.txt");
		String temp="�������꣡����������������������";
		byte[] bs=temp.getBytes();
		fis.write(bs);
		fis.close();
		System.out.println("�ɹ�");
	}

}
