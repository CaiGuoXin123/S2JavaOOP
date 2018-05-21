package Day01;
/*
 * 局部内部类
 */
public class Dog002 {
   public int age;
     public void eat(String name){
	  class Cat{
 		 public  void show() {
			System.out.println(name);
		}
	  }
	  new Cat().show();
 }
     public void eatTest(){
    	 
     }
}
