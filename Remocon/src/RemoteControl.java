
public interface RemoteControl {
	// �ʵ尡 ����. (������ ����) ����� ���𰡴�.(��ǻ� ����)
	int MAX_VOLUME=10; //�̰� ���
	int MIN_VOLUME=0;
	// �����ڰ� ����. ->new ������ ��� �Ұ�
	
	// ���� �޼ҵ常 ����.(�߻�޼ҵ�/����Ʈ�޼ҵ�/�����޼ҵ�)
	void turnOn(); //�߻�޼ҵ�.. abstract �Ƚᵵ �߻����� �νĵǳ���
	void turnOff();
	void setVolume(int volume);
	//default(�⺻) �޼ҵ�- �Ϲ� Ŭ������ �Ϲ� �޼ҵ�
	default void setMute(boolean mute) { //�Ϲ�Ŭ������ �Ϲݸ޼ҵ�� ����
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}

