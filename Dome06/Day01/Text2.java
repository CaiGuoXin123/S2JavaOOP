package Day01;

import java.util.LinkedList;

public class Text2 {

	public static void main(String[] args) {
		Dog ooDog=new Dog("ŷŷ","ѩ����");
		Dog yayaDog=new Dog("����", "��������Ȯ");
		Dog meimeiDog=new Dog("����", "���������");
		Dog kukuDog=new Dog("�޿�", "ɳƤ");
        LinkedList<Dog> dogs =new LinkedList<Dog>();
        dogs.add(ooDog);
        dogs.add(yayaDog);
        dogs.add(meimeiDog);
        dogs.add(kukuDog);
      //
        
        System.out.println(dogs);
        Dog dos=(Dog) dogs.getFirst(); //��ѯ��һ��
        System.out.println("��һ���������֣�"+dos.getName()+"��");
        Dog doss=(Dog) dogs.getLast();//��ѯ���һ����
        System.out.println("���һ���������֣�"+doss.getName()+"��");
        dogs.removeFirst();
        dogs.removeLast();
        System.out.println("\nɾ�����ֹ�����"+dogs.size()+"��");
        System.out.println("�ֱ��У�");
        for (int i = 0; i < dogs.size(); i++) {
			Dog dop=(Dog)dogs.get(i);
			System.out.println(dop.getName()+dop.getStain());
		}
	}

}
