
public class PhoneExample {

	public static void main(String[] args) {
//		 Phone phone = new Phone("ȫ�浿"); //�߻��� �� ������
		// �߻�Ŭ�����δ� new�����ڸ� �̿��ؼ� �ν��Ͻ� ������ �����Ұ�
		SmartPhone smartPhone = new SmartPhone("ȫ�浿");

		smartPhone.turnOn();
		smartPhone.search();
		smartPhone.InternetSearch();
		smartPhone.turnOff();
		
		CellPhone cellPhone =new CellPhone("ȫ���");
		cellPhone.turnOn();
		cellPhone.YoutubeSearch();
		cellPhone.turnOff();
	}

}
