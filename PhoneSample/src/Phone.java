
public abstract class Phone {
	public String owner;
	
	public Phone(String owner) {
		this.owner=owner;
	}
	public void search() {
		System.out.println("�˻��մϴ�.");
	}
	public abstract void turnOn();
	public abstract void turnOff();
	//�߻� �޼ҵ�� Overriding..
	//�Ⱦ��ϱ� �� �̸��� ���� abstract(�߻�)���� ���������ڰ�..�̸� �ڵ� �������ڰ� ���ô��ҰŴϱ�
	//�߻�Ŭ���� <-�߻�޼ҵ� ���� <-�������̵��� �δ���� �ϱ�����
	
}
