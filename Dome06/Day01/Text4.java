package Day01;

import java.util.List;
import java.util.ArrayList;

public class Text4 {

	public static void main(String[] args) {
		Dog ooDog=new Dog("ŷŷ","ѩ����");
		Dog yayaDog=new Dog("����", "��������Ȯ");
		Dog meimeiDog=new Dog("����", "���������");
		Dog kukuDog=new Dog("�޿�", "ɳƤ"); 
		 List<Dog> dogs=new ArrayList<Dog>();
		dogs.add(ooDog);
		dogs.add(yayaDog);
		dogs.add(meimeiDog);
		dogs.add(2,kukuDog);
		Dog dog3=dogs.get(2);
	    System.out.println("����ֻ������Ϣ���£�");
	    System.out.println(dog3.getName()+"\t"+dog3.getStain());
	    System.out.println("\n���й�����Ϣ���£�");
	    for(Dog dog:dogs){
	    	System.out.println(dog.getName()+"\t"+dog.getStain());
	    }
	}

}
