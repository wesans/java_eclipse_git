
public class CalculatorExample {

	public static void main(String[] args) {
//		instance ����x Calculator calc=new Calculator();
		
//		Calculator.pi=3.14; //���̳� ���࿩�� �˾ƺ���
		double result1=10*10*Calculator.pi;
		int result2=Calculator.plus(10,5);
		int result3=Calculator.minus(10,5);

		System.out.println("info:"+Calculator.info);
		System.out.println("result1 : "+ result1);
		System.out.println("result2 : "+ result2);
		System.out.println("result3 : "+ result3);
	}

}
