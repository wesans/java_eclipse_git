
public class DriverExample {

	public static void main(String[] args) {
	Driver driver= new Driver();
	Bus bus= new Bus();
	Taxi taxi= new Taxi();
	
	driver.driver(bus);  //자동형변환(자식 ->부모)
	driver.driver(taxi); //자동형변환(자식 ->부모)
	}

}
