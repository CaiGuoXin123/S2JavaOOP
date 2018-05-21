package Day01;

import java.util.LinkedList;

public class Text2 {

	public static void main(String[] args) {
		Dog ooDog=new Dog("欧欧","雪纳瑞");
		Dog yayaDog=new Dog("亚亚", "拉布拉多犬");
		Dog meimeiDog=new Dog("美美", "拉布拉多的");
		Dog kukuDog=new Dog("哭哭", "沙皮");
        LinkedList<Dog> dogs =new LinkedList<Dog>();
        dogs.add(ooDog);
        dogs.add(yayaDog);
        dogs.add(meimeiDog);
        dogs.add(kukuDog);
      //
        
        System.out.println(dogs);
        Dog dos=(Dog) dogs.getFirst(); //查询第一狗
        System.out.println("第一条狗的名字："+dos.getName()+"。");
        Dog doss=(Dog) dogs.getLast();//查询最后一条狗
        System.out.println("最后一条狗的名字："+doss.getName()+"。");
        dogs.removeFirst();
        dogs.removeLast();
        System.out.println("\n删除部分狗还有"+dogs.size()+"条");
        System.out.println("分别有：");
        for (int i = 0; i < dogs.size(); i++) {
			Dog dop=(Dog)dogs.get(i);
			System.out.println(dop.getName()+dop.getStain());
		}
	}

}
