package Day03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriter2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       Writer writer=new FileWriter("F:\\����ϰ.txt");
       BufferedWriter be=new BufferedWriter(writer);
       be.write("\r\n���ǵ�����");
       be.newLine();//����
       be.write("������");
       be.close();
       System.out.println("�ɹ�");
	}

}
