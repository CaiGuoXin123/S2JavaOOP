package ThreadDemo2;

public class Test {

	public static void main(String[] args) {
		Thread thread=new Thread(new MyRunnable(),"t");
           System.out.println("�߳�t�����½�״̬");
           thread.start();
           System.out.println("�߳�t���ھ���״̬");
	}

}
