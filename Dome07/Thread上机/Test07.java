package Thread�ϻ�;

public class Test07  {

	public static void main(String[] args) {
		
		Site site = new Site();
		
		Thread per1 = new Thread(site, "������");
		
		Thread per2 = new Thread(site, "��Ʊ����");
		
		Thread per3 = new Thread(site, "��ţ��");
		
		per1.start();
		per2.start();
		per3.start();
		
		
		
		
	}

}
