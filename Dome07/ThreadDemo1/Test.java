package ThreadDemo1;

public class Test {

	public static void main(String[] args) {
		//1.获取主线程对象
		Thread thread=Thread.currentThread();
		System.out.println("当前线程是"+thread.getName());
		thread.setName("MyjavaThread");
		System.out.println("******当前线程是"+thread.getName());
	}

}
