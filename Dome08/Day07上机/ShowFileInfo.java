package Day07上机;

import java.io.File;
import java.util.Scanner;

public class ShowFileInfo {

	public static void main(String[] args) {
		try {
			FileMethods();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void FileMethods() throws Exception{
		   //实例化对象
					File  file=new File("AA\\1.txt");
					//判断txt是否存在
					if (file.exists()) {
						if (file.isDirectory()) {
							System.out.println("当前文件存在");
						}else{
							System.out.println("文件的完整路径: "+file.getAbsolutePath());
							System.out.println("文件名为:"+file.getName());
							System.out.println("文件的相对路径:"+file.getPath());
							System.out.println("文件的上一级目录:"+file.getParent());
							System.out.println("文件的长度为:"+file.length());
						}
						System.out.println("请按1删除");
						Scanner input=new Scanner(System.in);
						int xz=input.nextInt();
						if (xz==1) {
							boolean bo=file.delete();
							if (bo) {
								System.out.println("删除成功");
							}
						}
						 
					}else{
						System.out.println("当前文件不存在");
						//当文件不存在 创建文件
						boolean bool=file.createNewFile();
						if (bool) {
							System.out.println("创建文件成功");
						}
						
					} 
		
	}

}
