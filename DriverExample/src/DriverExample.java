
public class DriverExample {

	public static void main(String[] args) {
	Driver driver= new Driver();
	Bus bus= new Bus();
	Taxi taxi= new Taxi();
	
	driver.driver(bus);  //�ڵ�����ȯ(�ڽ� ->�θ�)
	driver.driver(taxi); //�ڵ�����ȯ(�ڽ� ->�θ�)
	}

}
