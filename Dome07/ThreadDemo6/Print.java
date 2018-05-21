package ThreadDemo6;

public class Print {

	public  void print1() {
		for (int i = 1; i < 50; i++) {
			synchronized(this){
			System.out.print("出");
			System.out.print("込");
			System.out.print("込");
			
			System.out.println(" ");
			}
		}
	}
	
	public void print2(){

		synchronized(this){
		for (int i = 0; i < 50; i++) {
			System.out.print("込");
			System.out.print("込");
			System.out.println(" ");
		}
		}
	}
}
