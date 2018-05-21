package ThreadÉÏ»ú;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  demo01 demo01=new demo01();
          demo01 demo012=new demo01();
         Thread thread=new Thread(demo01);
         Thread thread1=new Thread(demo012);
         thread.start();
         thread1.start();
	}

}
