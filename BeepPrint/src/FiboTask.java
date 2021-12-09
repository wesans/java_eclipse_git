
public class FiboTask implements Runnable {

	int a;
	int b;
	int c;
	public void run() {
		a=1;
		b=1;
		c=0;
		for(c=2;c<1000;c++) {
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
