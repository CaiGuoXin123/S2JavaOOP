package Thread�ϻ�;

public class Site implements Runnable {
	
    private int num=0; //���۵��ǵڼ���Ʊ
    private int count=10; //ʣ��Ʊ��
	@Override
	public void run() {
		while (true) {
			synchronized (this) {
				if (count <= 0) {
					break;
				}
				count--;
				num++;
				System.out.println(Thread.currentThread().getName() + "������" + num + "ʣ��" + count + "Ʊ");
			}
		}
		
	}
	
    
    
    
}
