package ThreadDemo2;

public class MyRunnable implements Runnable {
public void run(){
	System.out.println("线程t正在执行");
	try {
		Thread.sleep(500);
		System.out.println("线程t休眠");
	} catch (InterruptedException e) {
		e.printStackTrace();
		System.out.println("线程t被中断");
	}
}
}
