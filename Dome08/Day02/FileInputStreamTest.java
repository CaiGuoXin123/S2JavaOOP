package Day02;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
	

	public static void main(String[] args) {
		try {
			readDataFromDisk();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}
	private static void readDataFromDisk() throws Exception {
		//流：作用：打通硬盘和内存的通道 创建了一个和硬盘上文件绑定的文件流
	 FileInputStream fis=new FileInputStream("F:\\晚自习.txt");
	 //创建缓存区大小k 承载1k数据的一个缓冲区       大家：就是内存中的一块区域。主要是在内存和硬盘之间做数据交换的临时储存区
	 byte[] bytes=new byte[1024];
	 int data=0;
	 StringBuffer sBuffer=new StringBuffer();
	 
	 while ((data=fis.read(bytes))!=-1) {
		String temp=new  String(bytes, 0, data);
		sBuffer.append(temp);
		System.out.println("=====有效字节数==="+data);
	}
		System.out.println(sBuffer.toString());
		fis.close();
	}

}
