package Thread上机;

public class Site implements Runnable {
	
    private int num=0; //销售的是第几张票
    private int count=10; //剩余票数
	@Override
	public void run() {
		while (true) {
			synchronized (this) {
				if (count <= 0) {
					break;
				}
				count--;
				num++;
				System.out.println(Thread.currentThread().getName() + "抢到第" + num + "剩余" + count + "票");
			}
		}
		
	}
	
    
    
    
}
