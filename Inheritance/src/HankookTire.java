
public class HankookTire extends Tire {

	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
	}
	
	@Override
	public boolean roll() {
		++pastRotation;
		if(pastRotation<maxRotation) {
			System.out.println("HankookTire ��������: "+(maxRotation-pastRotation)+"ȸ");
			return true;    //�ִ�ȸ�������� ���� ����
		} else {
			System.out.println(this.location+ " �ѱ�Ÿ�̾���ũ");
			return false;   //�ִ�ȸ���� �ʰ�
		}
	}
}
