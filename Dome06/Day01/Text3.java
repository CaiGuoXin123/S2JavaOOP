package Day01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Text3 {

	public static void main(String[] args) {
		Dog ooDog=new Dog("ŷŷ","ѩ����");
		Dog yayaDog=new Dog("����", "��������Ȯ");
		Dog meimeiDog=new Dog("����", "���������");
		Dog kukuDog=new Dog("�޿�", "ɳƤ");
        Map<Object, Dog> dog=new HashMap<Object, Dog>();
        dog.put(ooDog.getName(), ooDog);
        dog.put(yayaDog.getName(), yayaDog);
        dog.put(meimeiDog.getName(), yayaDog);
        dog.put(kukuDog.getName(), kukuDog);
        System.out.println("ʹ��Iterator���������������ƺ�Ʒ�ֱַ��ǣ�");
        Set<Object> keys=dog.keySet();  //�������м���
        Iterator<Object> iterator=keys.iterator();
        //�ж��Ƿ������һ��Ԫ��
        while (iterator.hasNext()) {
		String key=(String)iterator.next();  //ȡ����
		Dog dos=(Dog)dog.get(key);
		System.out.println(key+"\t"+dos.getStain());
			
		}
	}

}
