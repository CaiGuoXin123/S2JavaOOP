package Day03;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//����
        FileWriter writer=new FileWriter("F:\\����ϰ.txt");
        writer.write("=====�������꣡����=====");
        writer.close();
        System.out.println("�ɹ�");
	}

}
