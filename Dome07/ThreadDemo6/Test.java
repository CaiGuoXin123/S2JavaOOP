package ThreadDemo6;

public class Test {

	public static void main(String[] args) {
		Print print=new Print();
	    MyThread myThread=new MyThread();
	    myThread.print=print;
	    
	    MyThreadTwo myThreadTwo=new MyThreadTwo();
	     myThreadTwo.print=print;
	     Thread thread=new Thread(myThread);
	     Thread thread2=new Thread(myThreadTwo);
	     thread.start();
	     thread2.start();
	}

}
