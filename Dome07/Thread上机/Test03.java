package Thread上机;

public class Test03 {

	public static void main(String[] args) {
	    ClimbThread03 climbThread03=new ClimbThread03("年轻人", 500, 1);
	    ClimbThread03 climbThread032=new ClimbThread03("老年人", 500, 1);
	    System.out.println("*******************");
	    climbThread03.start();
	    climbThread032.start();
	}

}
