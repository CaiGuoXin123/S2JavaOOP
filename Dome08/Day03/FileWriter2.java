package Day03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriter2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       Writer writer=new FileWriter("F:\\晚自习.txt");
       BufferedWriter be=new BufferedWriter(writer);
       be.write("\r\n我是第三行");
       be.newLine();//换行
       be.write("第四行");
       be.close();
       System.out.println("成功");
	}

}
