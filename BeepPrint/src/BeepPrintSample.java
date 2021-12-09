
public class BeepPrintSample {

	public static void main(String[] args) {
		Thread bt1 = new BeepTask1();
		bt1.start();
		
		Thread fb1 = new FiboTask1();
		fb1.start();
		
//		Runnable bt = new BeepTask();
//		Thread thread = new Thread(bt);
//		thread.start(); //run() 호출
//		
//		Runnable ft = new FiboTask();
//		Thread fthread = new Thread(ft);
//		fthread.start(); //run() 호출
//		
		for(int i=0;i<5;i++) {
			System.out.println("AAAAA");
			try {
				Thread.sleep(500);
				} catch (InterruptedException e) {}
			}
		}
}
