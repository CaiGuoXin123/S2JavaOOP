package ThreadDemo1;

public class Test {

	public static void main(String[] args) {
		//1.��ȡ���̶߳���
		Thread thread=Thread.currentThread();
		System.out.println("��ǰ�߳���"+thread.getName());
		thread.setName("MyjavaThread");
		System.out.println("******��ǰ�߳���"+thread.getName());
	}

}
