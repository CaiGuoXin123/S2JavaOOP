package Day03;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test02 {

	public static void main(String[] args) {
		Map<String,String> countries=new HashMap<String,String>();
		countries.put("CN", "�л����񹲺͹�");
		countries.put("RU", "����˹����");
		countries.put("FR", "���������͹�");
		countries.put("US", "��������ݹ�");
		//ͨ��key����value
		//countries.remove("RU");
		System.out.println("\n");
		System.out.println("************************************");
		
		Set<String> key=countries.keySet();
		for (String en:key) {
			System.out.println(en);
			String co=countries.get(en);
			System.out.println(co);
		}
	//value���ϵķ�ʽ
		System.out.println("\n");
		System.out.println("************************************");
		
		Collection<String> collection=countries.values();
		for (String value:collection) {
			System.out.println(value);
		}
		//��+ֵ    ----entry
		System.out.println("\n");
		System.out.println("************************************");
		
		Set<Entry<String, String>> entrySet = countries.entrySet();
		for(Entry<String, String> entry:entrySet){
			System.out.println(entry.getKey()+"****"+entry.getValue());
		}
		//������Iterator
		System.out.println("\n");
		System.out.println("************************************");
		
		Iterator<String> iterator=countries.keySet().iterator();
        while(iterator.hasNext()){
        	String we=iterator.next();
        	System.out.println(we+"**"+countries.get(we));
        }
        //ͨ��values��ȡ������
    	System.out.println("\n");
		System.out.println("************************************");
		
        Iterator<String> iterator2=countries.values().iterator();
        while(iterator2.hasNext()){
        	String val=iterator2.next();
        	System.out.println(val);
        }
        //key+value
    	System.out.println("\n");
		System.out.println("************************************");
		Iterator<Entry<String, String>> iterator3 = countries.entrySet().iterator();
		while(iterator3.hasNext()){
			Entry<String, String> entry=iterator3.next();
			System.out.println(entry.getKey()+"***"+entry.getValue());
		}
		String country=(String) countries.get("CN");
		System.out.println("\nCN��Ӧ�Ĺ��ң�"+country);
	}

}
