package ThreadDemo3;

public class Test {

	public static void main(String[] args) {
		 Thread thread=new Thread(new MyRunnable(),"�߳�A") ;
		 Thread thread1=new Thread(new MyRunnable(),"�߳�B") ;
			thread.setPriority(Thread.MAX_PRIORITY);
		thread1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("�߳�A"+thread.getPriority());
		System.out.println("�߳�B"+thread1.getPriority());
		thread.start();
		thread1.start();
	}

}
