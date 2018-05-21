package Thread上机;

public class ClimbThread03 extends Thread {
	public  int time;
	public int getTime() {
		return time;
	}


	public void setTime(int time) {
		this.time = time;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public int num=0;

      public ClimbThread03(String name,int time ,int kilometer){
    	  super(name);
    	  this.time=time;
    	  this.num=kilometer*1000/100;
    	  
      }

               public void run(){
            	   while (num>0) {
					try {
						Thread.sleep(this.time);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"爬完100米");
					num--;
				}
            		System.out.println(Thread.currentThread().getName()+"到达终点");
               }
}
