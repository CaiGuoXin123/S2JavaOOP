package Day01;

import java.util.List;
import java.util.ArrayList;

public class Text1 {

	public static void main(String[] args) {
	Dog ooDog=new Dog("ŷŷ","ѩ����");
	Dog yayaDog=new Dog("����", "��������Ȯ");
	Dog meimeiDog=new Dog("����", "���������");
	Dog kukuDog=new Dog("�޿�", "ɳƤ");
	List dis=new ArrayList<Dog>();
	dis.add(ooDog);
    dis.add(yayaDog);
    dis.add(meimeiDog);
    dis.add(2,kukuDog);
   // System.out.println("������"+dis.size()+"������");
    System.out.println("ɾ��֮ǰ������"+dis.size()+"������");
    dis.remove(0);
    dis.remove(meimeiDog);
    System.out.println("*********ɾ��֮�󹲼���"+dis.size()+"������");
    System.out.println("�ֱ��ǣ�");
    for (int i = 0; i < dis.size(); i++) {
		Dog dog=(Dog) dis.get(i);
		System.out.println(dog.getName()+"\t"+dog.getStain());
	}
    if (dis.contains(meimeiDog)) {
		System.out.println("****��������");
	}else {
		System.out.println("/////����������");
	}
	}

}
