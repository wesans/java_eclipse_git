//��Ǫ��(����/����)
public class Car {
	//Ŭ������ ���(�ʵ�)
	String company; //������ü
	String model; //�𵨸� 
	String color; //����
	int maxSpeed; //�ְ�ӵ�
	int speed; //����ӵ�
	
	//-������(Constructor:������/������)
	//�ʵ尪�� �ʱ�ȭ�� �� �Ǵ� �ʱ�ȭ�۾��� ������ ��.
	//Ŭ������� ������ �޼ҵ�.
	//��ȯ�� Ÿ���� ����.
	//�ڵ�����=�����(���������) ȣ��x <-new ������ ȣ��
	//�⺻�����ڰ� �ݵ�� �־����. ���� �Ķ���� �־ ����� ������
	//�⺻������ �ȿ� �� ����־ �Ǳ��� Car(){} ���ɸ� 
	Car(){ //�⺻������(default constructor)//�Ķ���� ����.()�� �����̶� �Ҹ�
		this.company="KIA";
		this.model="Sorento";
		this.color="grey";
		this.maxSpeed=240;
		this.speed=0;
	}
	//�Ϲݻ����ڰ� ������, �ݵ�� �⺻�����ڵ� �����ؾ� �Ѵ�.
	//�׷��� (�Ϲݻ����� ����) �⺻�����ڸ� ������ �� �ִ�.
	//������ �����ε�(Constructor Overloading) <-�������� ����
	Car(String sCompany,String sModel,String sColor,int nMaxSpeed,
			int nSpeed){ //�Ķ���� 5��. �Ķ���� �־ Car()�� ����
		this.company=sCompany;
		this.model=sModel;
		this.color=sColor;
		this.maxSpeed=nMaxSpeed;
		this.speed=nSpeed;
	}
	//String model, String color :�Ű�����(parameter), ��������
	Car(String model, String color){
		this("KIA",model,color,240,0); //calling other constructor in the constructor 
//		this.company="KIA";
//		this.model=model; 
//		this.color=color;
//		this.maxSpeed=240;
//		this.speed=0;
	}
	void drive(int speed) {
	this.speed=speed;
	}

}
