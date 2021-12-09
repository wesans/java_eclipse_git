
public class PhoneExample {

	public static void main(String[] args) {
//		 Phone phone = new Phone("홍길동"); //추상은 뉴 못쓴대
		// 추상클래스로는 new연산자를 이용해서 인스턴스 변수를 생성불가
		SmartPhone smartPhone = new SmartPhone("홍길동");

		smartPhone.turnOn();
		smartPhone.search();
		smartPhone.InternetSearch();
		smartPhone.turnOff();
		
		CellPhone cellPhone =new CellPhone("홍길순");
		cellPhone.turnOn();
		cellPhone.YoutubeSearch();
		cellPhone.turnOff();
	}

}
