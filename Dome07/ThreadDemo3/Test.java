package ThreadDemo3;

public class Test {

	public static void main(String[] args) {
		 Thread thread=new Thread(new MyRunnable(),"线程A") ;
		 Thread thread1=new Thread(new MyRunnable(),"线程B") ;
			thread.setPriority(Thread.MAX_PRIORITY);
		thread1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("线程A"+thread.getPriority());
		System.out.println("线程B"+thread1.getPriority());
		thread.start();
		thread1.start();
	}

}
