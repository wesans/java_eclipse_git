
public class SmartPhone extends Phone {
	
	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void InternetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}
	@Override
	public void turnOn() {
		System.out.println("����Ʈ�� ������ ŵ�ϴ�.");
	}
	@Override
	public void turnOff() {
		System.out.println("����Ʈ�� ������ ���ϴ�.");
	}
}
