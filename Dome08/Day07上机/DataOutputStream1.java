package Day07上机;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.omg.CORBA.ShortSeqHelper;

public class DataOutputStream1 {

	public static void main(String[] args) {
	try {
		ShortSeqHelper();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

	private static void ShortSeqHelper() throws Exception {
		InputStream stream=new FileInputStream("F:\\jhkj.png");
	      DataInputStream dStream=new DataInputStream(stream);
	      
	      OutputStream oStream1=new FileOutputStream("E:\\集合框架.png");
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
