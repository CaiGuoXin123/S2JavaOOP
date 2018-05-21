package Day02;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.setAge(12);
		d1.setName("小蓝车");

		Dog d2 = new Dog();
		d2.setAge(12);
		d2.setName("小黄车");

		Set<Dog> dog = new HashSet<Dog>();
		dog.add(d1);
		dog.add(d2);
		System.out.println(dog.size());

	}

}
