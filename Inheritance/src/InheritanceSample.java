
public class InheritanceSample {

	public static void main(String[] args) {
		Car car= new Car();
		
		for(int i=0; i<5; i++) {
			int punk=car.run();
			switch(punk) {
			case 1:
				System.out.println("�տ��� �ѱ�Ÿ�̾�� ��ü");
				//�ڵ�����ȯ (�ڽ� >�θ�Ŭ����...�� Tire�Ⱥθ��� �� �ѱ�Ÿ�̾��ΰ��� ��)
//				car.frontLeft=new HankookTire(15,"�տ���");
				car.tires[punk-1]=new HankookTire(15,"�տ���");
				break;
			case 2:
				System.out.println("�տ����� ��ȣŸ�̾�� ��ü");
//				car.frontRight=new KumhoTire(13,"�տ�����");
				car.tires[punk-1]=new KumhoTire(13,"�տ�����");
				break;
			case 3:
				System.out.println("�ڿ��� �ѱ�Ÿ�̾�� ��ü");
//				car.backLeft=new HankookTire(14,"�ڿ���");
				car.tires[punk-1]=new HankookTire(14,"�ڿ���");
				break;
			case 4:
				System.out.println("�ڿ����� �ѱ�Ÿ�̾�� ��ü");
//				car.backRight=new KumhoTire(17,"�ڿ�����");
				car.tires[punk-1]=new KumhoTire(17,"�ڿ�����");
				break;
			}
			System.out.println("----------------------------");
		}
	}

}
