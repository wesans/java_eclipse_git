
public class DriverExample {

	public static void main(String[] args) {
	Driver driver= new Driver();
	Bus bus= new Bus();
	Taxi taxi= new Taxi();
	
	driver.driver(bus);  //�ڵ�����ȯ(�ڽ� ->�θ�)
	driver.driver(taxi); //�ڵ�����ȯ(�ڽ� ->�θ�)
	
	if( bus instanceof Bus) {
		System.out.println("bus instanceof Bus.");
	} else {
		System.out.println("bus NOT instanceof Bus.");
		}
	if( bus instanceof Vehicle) {
		System.out.println("bus instanceof Vehicle.");
	} else {
		System.out.println("bus NOT instanceof Vehicle.");
		}
	}
}
