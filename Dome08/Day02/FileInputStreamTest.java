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
		//�������ã���ͨӲ�̺��ڴ��ͨ�� ������һ����Ӳ�����ļ��󶨵��ļ���
	 FileInputStream fis=new FileInputStream("F:\\����ϰ.txt");
	 //������������Сk ����1k���ݵ�һ��������       ��ң������ڴ��е�һ��������Ҫ�����ڴ��Ӳ��֮�������ݽ�������ʱ������
	 byte[] bytes=new byte[1024];
	 int data=0;
	 StringBuffer sBuffer=new StringBuffer();
	 
	 while ((data=fis.read(bytes))!=-1) {
		String temp=new  String(bytes, 0, data);
		sBuffer.append(temp);
		System.out.println("=====��Ч�ֽ���==="+data);
	}
		System.out.println(sBuffer.toString());
		fis.close();
	}

}
