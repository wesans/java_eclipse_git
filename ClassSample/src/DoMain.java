
public class DoMain {

	public static void main(String[] args) {
		Car car=new Car(); //car=�����鼭 ��ü.�ν��Ͻ�(instance:��ü/����)
		
		System.out.println("������ü:"+car.company);
		System.out.println("�𵨸�:"+car.model);
		System.out.println("����:"+car.color);
		System.out.println("�ְ�ӵ�:"+car.maxSpeed);
		System.out.println("����ӵ�:"+car.speed);
		
		
		car.speed=60;
		System.out.println("������ ����ӵ�:"+car.speed);
		System.out.println("-----------------------");
		
		Car seltos=new Car("KIA","Seltos","white",220,0);
		
		System.out.println("������ü:"+seltos.company);
		System.out.println("�𵨸�:"+seltos.model);
		System.out.println("����:"+seltos.color);
		System.out.println("�ְ�ӵ�:"+seltos.maxSpeed);
		System.out.println("����ӵ�:"+seltos.speed);
	}

}
