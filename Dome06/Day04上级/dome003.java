package Day04上级;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class dome003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.创建多只企鹅信息
		Pet pgn1=new Pet("欧欧","Q仔");
				Pet pgn2=new Pet("乐乐","Q妹");
				Pet pgn3=new Pet("笑笑","Q妹");
				Pet pgn4=new Pet("哈哈","Q仔");
				//2.创建Map集合对象并把多个企鹅对象放入其中
				Map<String,Pet> cs=new HashMap<String,Pet>();
				cs.put(pgn1.getName(), pgn1);
				cs.put(pgn2.getName(), pgn2);
				cs.put(pgn3.getName(), pgn3);
				cs.put(pgn4.getName(), pgn4);
				//3.通过Iterator迭代器依次输出集合中所以狗狗信息
				System.out.println("使用Iterator遍历,所以企鹅的昵称和品种分别是:");
				Set<String> keys=cs.keySet();//取出所以key的集合
				Iterator<String> it=keys.iterator();//获取Iterator对象
			/*	while(it.hasNext()){
					String key=it.next();//取出key
					Pet pgn=cs.get(key);//根据key取出对应的值
					System.out.println(key+"\t"+pgn.getType());
				}*/
				//使用foreach语句输出集合中所以企鹅信息
				for(String key:keys){
					Pet pgn=cs.get(key);//根据key取出对应的值
					System.out.println(key+"\t"+pgn.getType());
				}
				
			

	}

}
