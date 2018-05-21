package ThreadDemo2;

public class Test {

	public static void main(String[] args) {
		Thread thread=new Thread(new MyRunnable(),"t");
           System.out.println("线程t处于新建状态");
           thread.start();
           System.out.println("线程t处于就绪状态");
	}

}
