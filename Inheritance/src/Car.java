
public class Car {
	Tire[] tires= {
			new Tire(6,"�տ���"),
			new Tire(2,"�տ�����"),
			new Tire(3,"�ڿ���"),
			new Tire(4,"�ڿ�����")
	};
//	Tire frontLeft;
//	Tire frontRight;
//	Tire backLeft;
//	Tire backRight;
	
	public Car() {
//		frontLeft= new Tire(6,"�տ���");
//		frontRight= new Tire(2,"�տ�����");
//		backLeft= new Tire(3,"�ڿ���");
//		backRight= new Tire(4,"�ڿ�����");
	}
	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}
	
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		
		for(int i=0;i<tires.length;i++) {
			if(!tires[i].roll() ) {stop(); return i+1;}
		}
		
//		if(!tires[0].roll()) {stop(); return 1;}
//		if(!tires[1].roll()) {stop(); return 2;}
//		if(!tires[2].roll()) {stop(); return 3;}
//		if(!tires[3].roll()) {stop(); return 4;}
		
//		if(!frontLeft.roll()) {stop(); return 1;}
//		if(!frontRight.roll()) {stop(); return 2;}
//		if(!backLeft.roll()) {stop(); return 3;}
//		if(!backRight.roll()) {stop(); return 4;}
		
		return 0;
		}
}
