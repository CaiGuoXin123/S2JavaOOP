package Day04�ϼ�;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import Day01.Dog;

public class dome002 {

	public static void main(String[] args) {
		Map countries = new HashMap();
		Pet ooDog =new Pet("ŷŷ"," ѩ����");
		Pet yayaDog =new Pet("����", "��������Ȯ");
		Pet meimeiDog =new Pet("����", "���������");
		Pet kukuDog =new Pet("�޿�", "ɳƤ");
		
		countries.put(ooDog.getName(), ooDog);
		countries.put(yayaDog.getName(), yayaDog);
		countries.put(meimeiDog.getName(), meimeiDog);
		countries.put(kukuDog.getName(), kukuDog);

		if (countries.containsKey("����")) {
			Pet str = (Pet) countries.get("����");
			System.out.println("���Ƕ�Ӧ�ĳ�����:" +str.getType());
		} else {
			System.out.println("�޶�Ӧ����!");
		}

	}
	}

