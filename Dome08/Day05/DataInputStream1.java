package Day05;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;


public class DataInputStream1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
  InputStream stream=new FileInputStream("F:\\jhkj.png");
      DataInputStream dStream=new DataInputStream(stream);
      
      OutputStream oStream1=new FileOutputStream("E:\\¼¯ºÏ¿ò¼Ü.png");
    DataOutputStream dStream2=new DataOutputStream(oStream1);
      byte[] in=new byte[1024];
      int data=0;
      while ((data=dStream.read(in))!=-1) {
		dStream2.write(in,0,data);     
		
	}
      dStream2.close();
      oStream1.close();
      dStream.close();
      stream.close();
      System.out.println("adsadasdas");
	}

}
