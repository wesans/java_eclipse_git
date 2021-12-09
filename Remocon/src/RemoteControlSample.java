
public class RemoteControlSample {

	public static void main(String[] args) {
//		Television tv= new Television();
//		Television tv1 = new RemoteControl();// 부모는 자식으로 convert 불가
//		RemoteControl tv=new Television();
		RemoteControl tv=new RemoteControl() {
		
		private int volume; 
		
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		} 
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
		public void setVolume(int v) {
			if(v>RemoteControl.MAX_VOLUME) {
				this.volume=RemoteControl.MAX_VOLUME;
			} else if(v<RemoteControl.MIN_VOLUME) {
				this.volume=RemoteControl.MIN_VOLUME;
			} else {
				this.volume=v;
			}
			System.out.println("현재 TV 볼륨: "+this.volume);
			}
		@Override
		public void setMute(boolean b) {
			System.out.println("boolean "+b);
			}
		};
		
		tv.turnOn();
		tv.setVolume(7);
		tv.setMute(true); //이런거 없는디 어케써용? 인터페이스 안에 있기때문에 가능
		tv.turnOff();
		
		RemoteControl.changeBattery();
		
		RemoteControl audio = new RemoteControl() {
		private int volume; 
		
		public void turnOn() {
			System.out.println("Audio를 켭니다.");
		} 
		public void turnOff() {
			System.out.println("Audio를 끕니다.");
		}
		public void setVolume(int v) {
			if(v>RemoteControl.MAX_VOLUME) {
				this.volume=RemoteControl.MAX_VOLUME;
			} else if(v<RemoteControl.MIN_VOLUME) {
				this.volume=RemoteControl.MIN_VOLUME;
			} else {
				this.volume=v;
			}
			System.out.println("현재 Audio 볼륨: " +this.volume);
			}
		};
		
		audio.turnOn();
		audio.setVolume(6);
		audio.turnOff();
	}
}
