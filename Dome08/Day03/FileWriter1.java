package Day03;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//覆盖
        FileWriter writer=new FileWriter("F:\\晚自习.txt");
        writer.write("=====今天下雨！！！=====");
        writer.close();
        System.out.println("成功");
	}

}
