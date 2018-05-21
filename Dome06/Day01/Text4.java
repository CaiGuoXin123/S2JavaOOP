package Day01;

import java.util.List;
import java.util.ArrayList;

public class Text4 {

	public static void main(String[] args) {
		Dog ooDog=new Dog("欧欧","雪纳瑞");
		Dog yayaDog=new Dog("亚亚", "拉布拉多犬");
		Dog meimeiDog=new Dog("美美", "拉布拉多的");
		Dog kukuDog=new Dog("哭哭", "沙皮"); 
		 List<Dog> dogs=new ArrayList<Dog>();
		dogs.add(ooDog);
		dogs.add(yayaDog);
		dogs.add(meimeiDog);
		dogs.add(2,kukuDog);
		Dog dog3=dogs.get(2);
	    System.out.println("第三只狗的信息如下：");
	    System.out.println(dog3.getName()+"\t"+dog3.getStain());
	    System.out.println("\n所有狗的信息如下：");
	    for(Dog dog:dogs){
	    	System.out.println(dog.getName()+"\t"+dog.getStain());
	    }
	}

}
