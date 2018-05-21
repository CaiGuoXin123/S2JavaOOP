package Thread上机;

public class Test07  {

	public static void main(String[] args) {
		
		Site site = new Site();
		
		Thread per1 = new Thread(site, "逃跑跑");
		
		Thread per2 = new Thread(site, "抢票代理");
		
		Thread per3 = new Thread(site, "黄牛党");
		
		per1.start();
		per2.start();
		per3.start();
		
		
		
		
	}

}
