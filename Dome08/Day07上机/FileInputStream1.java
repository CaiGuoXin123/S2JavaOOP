package Day07上机;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileInputStream1 {

	public static void main(String[] args) {
		try {
			readDataFromDisk();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void readDataFromDisk() throws Exception {
		FileInputStream fiStream=new FileInputStream("E:\\1.txt");
		
		FileOutputStream  fStream=new FileOutputStream("F:\\晚自习.txt");
		String temp="今天下雨！！！！！！！！！！！！";
		byte  words[]=new byte[1024];
		while (fiStream.read()!=-1) {
			  fiStream.read(words);
			  fStream.write(words,0,words.length);
		}
		fStream.close();
		fiStream.close();
		System.out.println("赋值成功");
	}

}
