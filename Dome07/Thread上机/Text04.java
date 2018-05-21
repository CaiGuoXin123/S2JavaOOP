package Thread上机;

public class Text04 {

	public static void main(String[] args) {
      System.out.println("******显示默认优先级*****");
      Thread thread=MyThread04.currentThread();
      System.out.println("主线程名"+thread.currentThread().getName()+",优先级："+thread.getPriority());
      MyThread04 myThread04=new MyThread04();
      System.out.println("子线程"+myThread04.getName()+"优先级"+myThread04.getPriority());
      
      
      System.out.println("\n********修改优先级后*******");
      Thread thread2=new Thread();
      thread2.setPriority(Thread.MAX_PRIORITY);
      System.out.println("主线程名"+Thread.currentThread().getName()+",优先级："+thread2.getPriority());
      MyThread04 myThread044=new MyThread04();
      myThread044.setPriority(Thread.MIN_PRIORITY);
      myThread04.start();
      System.out.println("优先级"+myThread044.getPriority());
  
	}

}
