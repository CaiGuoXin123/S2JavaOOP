package Thread上机;

public class Test06 {

	public static void main(String[] args) {
		RunThread06 runThread06=new RunThread06();
		for (int i = 0; i < 5; i++) {
			new Thread(runThread06,(i+1)+"号选手").start();
		}
		
		

	}

}
