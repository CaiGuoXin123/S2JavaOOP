package ThreadDemo2;

public class MyRunnable implements Runnable {
public void run(){
	System.out.println("�߳�t����ִ��");
	try {
		Thread.sleep(500);
		System.out.println("�߳�t����");
	} catch (InterruptedException e) {
		e.printStackTrace();
		System.out.println("�߳�t���ж�");
	}
}
}
