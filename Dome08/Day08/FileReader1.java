package Day08;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReader1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
   FileReader reader=new FileReader("E:\\1.txt");
   char[] cs=new char[1024];
   int data=0;
   /*
    * Vector �̰߳�ȫ��ArrayList���̰߳�ȫ��   ---Vector
    * ��Ҫ��Ϊ���ϱ����ǰ�ȫ�ģ�����������ϴ洢�����ݾ�һ���ܱ�֤�̰߳�ȫ
    * �Լ�����
    */
   StringBuffer sBuffer=new StringBuffer();
   while ((data=reader.read(cs))!=-1) {
	String temp=new String(cs, 0, data);
	sBuffer.append(temp);
	
}
   System.out.println(sBuffer.toString());
   reader.close();
	}

}
