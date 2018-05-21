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
    * Vector 线程安全的ArrayList是线程安全的   ---Vector
    * 不要以为集合本身是安全的，你用这个集合存储的数据就一定能保证线程安全
    * 自己控制
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
