package TreadDemo5;

public class Test {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println("�߳�A" + i);
				}

			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println("�߳�B" + i);
					if (i == 3) {
						System.out.println("���ð�������");
						Thread.yield();
					}
				}

			}
		});
		t1.start();
		t2.start();
	}

}
