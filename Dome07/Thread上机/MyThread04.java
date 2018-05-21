package Thread上机;

public class MyThread04 extends Thread {

public void run(){

 System.out.println("子线程名"+Thread.currentThread().getName());
}
}
