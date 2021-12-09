
public class FiboTask1 extends Thread {

@Override
	public void run() {
		int a=1;
		int b=1;
		int c=0;
		for(c=1;c<1000;c++) {
			System.out.println(c);
			c=a+b;
			a=b;
			b=c;
		}
		try {
			Thread.sleep(500);
			} catch (InterruptedException e) {}
	}
}
