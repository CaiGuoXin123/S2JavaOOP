package Day01;

import java.util.List;
import java.util.ArrayList;

public class Text1 {

	public static void main(String[] args) {
	Dog ooDog=new Dog("欧欧","雪纳瑞");
	Dog yayaDog=new Dog("亚亚", "拉布拉多犬");
	Dog meimeiDog=new Dog("美美", "拉布拉多的");
	Dog kukuDog=new Dog("哭哭", "沙皮");
	List dis=new ArrayList<Dog>();
	dis.add(ooDog);
    dis.add(yayaDog);
    dis.add(meimeiDog);
    dis.add(2,kukuDog);
   // System.out.println("共计有"+dis.size()+"条狗狗");
    System.out.println("删除之前共计有"+dis.size()+"条狗狗");
    dis.remove(0);
    dis.remove(meimeiDog);
    System.out.println("*********删除之后共计有"+dis.size()+"条狗狗");
    System.out.println("分别是：");
    for (int i = 0; i < dis.size(); i++) {
		Dog dog=(Dog) dis.get(i);
		System.out.println(dog.getName()+"\t"+dog.getStain());
	}
    if (dis.contains(meimeiDog)) {
		System.out.println("****包含美美");
	}else {
		System.out.println("/////不包含美美");
	}
	}

}
