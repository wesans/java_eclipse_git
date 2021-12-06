
public class Tire {
	int maxRotation;  //�ִ�ȸ��Ƚ��
	int pastRotation; //����ȸ��Ƚ��
	String location;  //Ÿ�̾���ġ
	
	public Tire() {}
	
	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	boolean roll() {
		++pastRotation;
		if(pastRotation<maxRotation) {
			System.out.println("Tire ��������: "+(maxRotation-pastRotation)+"ȸ");
			return true;    //�ִ�ȸ�������� ���� ����
		} else {
			System.out.println(this.location+ " Ÿ�̾���ũ");
			return false;   //�ִ�ȸ���� �ʰ�
		}
		
	}
	

}
