
public class InheritanceSample {

	public static void main(String[] args) {
		Car car= new Car();
		
		for(int i=0; i<5; i++) {
			int punk=car.run();
			switch(punk) {
			case 1:
				System.out.println("앞왼쪽 한국타이어로 교체");
				//자동형변환 (자식 >부모클래스...왜 Tire안부르고 뉴 한국타이어인가의 답)
//				car.frontLeft=new HankookTire(15,"앞왼쪽");
				car.tires[punk-1]=new HankookTire(15,"앞왼쪽");
				break;
			case 2:
				System.out.println("앞오른쪽 금호타이어로 교체");
//				car.frontRight=new KumhoTire(13,"앞오른쪽");
				car.tires[punk-1]=new KumhoTire(13,"앞오른쪽");
				break;
			case 3:
				System.out.println("뒤왼쪽 한국타이어로 교체");
//				car.backLeft=new HankookTire(14,"뒤왼쪽");
				car.tires[punk-1]=new HankookTire(14,"뒤왼쪽");
				break;
			case 4:
				System.out.println("뒤오른쪽 한국타이어로 교체");
//				car.backRight=new KumhoTire(17,"뒤오른쪽");
				car.tires[punk-1]=new KumhoTire(17,"뒤오른쪽");
				break;
			}
			System.out.println("----------------------------");
		}
	}

}
