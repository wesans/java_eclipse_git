
public class RemoteControlSample {

	public static void main(String[] args) {
//		Television tv= new Television();
//		Television tv1 = new RemoteControl();// �θ�� �ڽ����� convert �Ұ�
//		RemoteControl tv=new Television();
		RemoteControl tv=new RemoteControl() {
		
		private int volume; 
		
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
		} 
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
		}
		public void setVolume(int v) {
			if(v>RemoteControl.MAX_VOLUME) {
				this.volume=RemoteControl.MAX_VOLUME;
			} else if(v<RemoteControl.MIN_VOLUME) {
				this.volume=RemoteControl.MIN_VOLUME;
			} else {
				this.volume=v;
			}
			System.out.println("���� TV ����: "+this.volume);
			}
		@Override
		public void setMute(boolean b) {
			System.out.println("boolean "+b);
			}
		};
		
		tv.turnOn();
		tv.setVolume(7);
		tv.setMute(true); //�̷��� ���µ� ���ɽ��? �������̽� �ȿ� �ֱ⶧���� ����
		tv.turnOff();
		
		RemoteControl.changeBattery();
		
		RemoteControl audio = new RemoteControl() {
		private int volume; 
		
		public void turnOn() {
			System.out.println("Audio�� �մϴ�.");
		} 
		public void turnOff() {
			System.out.println("Audio�� ���ϴ�.");
		}
		public void setVolume(int v) {
			if(v>RemoteControl.MAX_VOLUME) {
				this.volume=RemoteControl.MAX_VOLUME;
			} else if(v<RemoteControl.MIN_VOLUME) {
				this.volume=RemoteControl.MIN_VOLUME;
			} else {
				this.volume=v;
			}
			System.out.println("���� Audio ����: " +this.volume);
			}
		};
		
		audio.turnOn();
		audio.setVolume(6);
		audio.turnOff();
	}
}
