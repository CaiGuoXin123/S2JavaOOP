package Thread�ϻ�;

public class Text04 {

	public static void main(String[] args) {
      System.out.println("******��ʾĬ�����ȼ�*****");
      Thread thread=MyThread04.currentThread();
      System.out.println("���߳���"+thread.currentThread().getName()+",���ȼ���"+thread.getPriority());
      MyThread04 myThread04=new MyThread04();
      System.out.println("���߳�"+myThread04.getName()+"���ȼ�"+myThread04.getPriority());
      
      
      System.out.println("\n********�޸����ȼ���*******");
      Thread thread2=new Thread();
      thread2.setPriority(Thread.MAX_PRIORITY);
      System.out.println("���߳���"+Thread.currentThread().getName()+",���ȼ���"+thread2.getPriority());
      MyThread04 myThread044=new MyThread04();
      myThread044.setPriority(Thread.MIN_PRIORITY);
      myThread04.start();
      System.out.println("���ȼ�"+myThread044.getPriority());
  
	}

}
