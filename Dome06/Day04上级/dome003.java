package Day04�ϼ�;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class dome003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.������ֻ�����Ϣ
		Pet pgn1=new Pet("ŷŷ","Q��");
				Pet pgn2=new Pet("����","Q��");
				Pet pgn3=new Pet("ЦЦ","Q��");
				Pet pgn4=new Pet("����","Q��");
				//2.����Map���϶��󲢰Ѷ���������������
				Map<String,Pet> cs=new HashMap<String,Pet>();
				cs.put(pgn1.getName(), pgn1);
				cs.put(pgn2.getName(), pgn2);
				cs.put(pgn3.getName(), pgn3);
				cs.put(pgn4.getName(), pgn4);
				//3.ͨ��Iterator����������������������Թ�����Ϣ
				System.out.println("ʹ��Iterator����,���������ǳƺ�Ʒ�ֱַ���:");
				Set<String> keys=cs.keySet();//ȡ������key�ļ���
				Iterator<String> it=keys.iterator();//��ȡIterator����
			/*	while(it.hasNext()){
					String key=it.next();//ȡ��key
					Pet pgn=cs.get(key);//����keyȡ����Ӧ��ֵ
					System.out.println(key+"\t"+pgn.getType());
				}*/
				//ʹ��foreach���������������������Ϣ
				for(String key:keys){
					Pet pgn=cs.get(key);//����keyȡ����Ӧ��ֵ
					System.out.println(key+"\t"+pgn.getType());
				}
				
			

	}

}
