package Day01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Text3 {

	public static void main(String[] args) {
		Dog ooDog=new Dog("欧欧","雪纳瑞");
		Dog yayaDog=new Dog("亚亚", "拉布拉多犬");
		Dog meimeiDog=new Dog("美美", "拉布拉多的");
		Dog kukuDog=new Dog("哭哭", "沙皮");
        Map<Object, Dog> dog=new HashMap<Object, Dog>();
        dog.put(ooDog.getName(), ooDog);
        dog.put(yayaDog.getName(), yayaDog);
        dog.put(meimeiDog.getName(), yayaDog);
        dog.put(kukuDog.getName(), kukuDog);
        System.out.println("使用Iterator遍历，狗狗的名称和品种分别是：");
        Set<Object> keys=dog.keySet();  //键的所有集合
        Iterator<Object> iterator=keys.iterator();
        //判断是否存在另一个元素
        while (iterator.hasNext()) {
		String key=(String)iterator.next();  //取出键
		Dog dos=(Dog)dog.get(key);
		System.out.println(key+"\t"+dos.getStain());
			
		}
	}

}
