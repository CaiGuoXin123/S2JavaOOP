package Thread�ϻ�;

public class Test05 {

	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1; i<=10;i++){
					System.out.println("����ţ�"+i+"�Ų����ڿ���");
					
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				
				}
				
			}
		});
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
			for (int i = 0; i <=50; i++) {
				System.out.println("��ͨ�ţ�"+i+"�Ų����ڿ���");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if (i==10) {
					try {
						t1.join();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
				
			}
		});
t1.start();
t2.start();
	}

}
