package Thread�ϻ�;

public class RunThread06 implements Runnable {
  boolean  falt=true;
  public int meters=1000;
	@Override
	public void run() {
		while (falt) {
			synchronized (this) {
				if (meters<=100) {
					break;
				}
				System.out.println(Thread.currentThread().getName()+"�õ�������");
				for (int j = 0; j < 100; j+=10) {
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				System.out.println(Thread.currentThread().getName()+"����"+(j+10)+"�ף�");
			}
				meters-=100;
				falt=false;
			}
			
		}
			
			
			
			
	}
  
}
