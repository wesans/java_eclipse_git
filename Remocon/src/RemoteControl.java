
public interface RemoteControl {
	// 필드가 없다. (변수가 없다) 상수는 선언가능.(사실상 변수)
	int MAX_VOLUME=10; //이거 상수
	int MIN_VOLUME=0;
	// 생성자가 없다. ->new 연산자 사용 불가
	
	// 오직 메소드만 있음.(추상메소드/디폴트메소드/정적메소드)
	void turnOn(); //추상메소드.. abstract 안써도 추상으로 인식되나봄
	void turnOff();
	void setVolume(int volume);
	//default(기본) 메소드- 일반 클래스의 일반 메소드
	default void setMute(boolean mute) { //일반클래스의 일반메소드와 동일
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}

