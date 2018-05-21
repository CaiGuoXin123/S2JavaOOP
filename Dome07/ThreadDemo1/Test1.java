package ThreadDemo1;

public class Test1 {

	public static void main(String[] args) {
	  MyThread thread=new MyThread();
	  MyThread thread2=new MyThread();
			  thread2.start();
	  thread.start();//Æô¶¯Ïß³Ì
	   
	//  thread.run();
	// thread2.run();
	}

}
