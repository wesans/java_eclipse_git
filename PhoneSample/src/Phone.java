
public abstract class Phone {
	public String owner;
	
	public Phone(String owner) {
		this.owner=owner;
	}
	public void search() {
		System.out.println("검색합니다.");
	}
	public abstract void turnOn();
	public abstract void turnOff();
	//추상 메소드와 Overriding..
	//안쓰니까 걍 이름만 쓰고 abstract(추상)으로 선언해주자고..미리 코드 넣지말자고 무시당할거니깐
	//추상클래스 <-추상메소드 선언 <-오버라이딩을 부담없이 하기위해
	
}
