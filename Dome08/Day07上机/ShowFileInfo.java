package Day07�ϻ�;

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
		   //ʵ��������
					File  file=new File("AA\\1.txt");
					//�ж�txt�Ƿ����
					if (file.exists()) {
						if (file.isDirectory()) {
							System.out.println("��ǰ�ļ�����");
						}else{
							System.out.println("�ļ�������·��: "+file.getAbsolutePath());
							System.out.println("�ļ���Ϊ:"+file.getName());
							System.out.println("�ļ������·��:"+file.getPath());
							System.out.println("�ļ�����һ��Ŀ¼:"+file.getParent());
							System.out.println("�ļ��ĳ���Ϊ:"+file.length());
						}
						System.out.println("�밴1ɾ��");
						Scanner input=new Scanner(System.in);
						int xz=input.nextInt();
						if (xz==1) {
							boolean bo=file.delete();
							if (bo) {
								System.out.println("ɾ���ɹ�");
							}
						}
						 
					}else{
						System.out.println("��ǰ�ļ�������");
						//���ļ������� �����ļ�
						boolean bool=file.createNewFile();
						if (bool) {
							System.out.println("�����ļ��ɹ�");
						}
						
					} 
		
	}

}
