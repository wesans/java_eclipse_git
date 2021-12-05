//거푸집(원판/원형)
public class Car {
	//클래스의 멤버(필드)
	String company; //제조업체
	String model; //모델명 
	String color; //색상
	int maxSpeed; //최고속도
	int speed; //현재속도
	
	//-생성자(Constructor:건축자/구성자)
	//필드값을 초기화할 때 또는 초기화작업을 수행할 때.
	//클래스명과 동일한 메소드.
	//반환값 타입이 없음.
	//자동실행=대놓고(명시적으로) 호출x <-new 연산자 호출
	//기본생성자가 반드시 있어야함. 없이 파라미터 넣어서 만들면 에러남
	//기본생성자 안에 걍 비어있어도 되긴함 Car(){} 일케만 
	Car(){ //기본생성자(default constructor)//파라미터 없음.()이 공백이란 소리
		this.company="KIA";
		this.model="Sorento";
		this.color="grey";
		this.maxSpeed=240;
		this.speed=0;
	}
	//일반생성자가 있으면, 반드시 기본생성자도 존재해야 한다.
	//그러나 (일반생성자 없이) 기본생성자만 존재할 수 있다.
	//생성자 오버로딩(Constructor Overloading) <-다형성의 일종
	Car(String sCompany,String sModel,String sColor,int nMaxSpeed,
			int nSpeed){ //파라미터 5개. 파라미터 있어서 Car()와 공존
		this.company=sCompany;
		this.model=sModel;
		this.color=sColor;
		this.maxSpeed=nMaxSpeed;
		this.speed=nSpeed;
	}
	//String model, String color :매개변수(parameter), 지역변수
	Car(String model, String color){
		this("KIA",model,color,240,0); //calling other constructor in the constructor 
//		this.company="KIA";
//		this.model=model; 
//		this.color=color;
//		this.maxSpeed=240;
//		this.speed=0;
	}
	void drive(int speed) {
	this.speed=speed;
	}

}
