
public class Calculator {
	final static double pi=3.14159;
//	static: instance �������� ����� �� �ִ� ��������(�ʵ�)/�Լ�(�޼ҵ�)
//	final:����Ұ�(����->���)
	static String company="LG";
	static String model="LCD";
	static String info;
	static {
		info=company+"-"+model;
	}
	
	static int plus(int x, int y) {
		return x+y;
	}
	static int minus(int x, int y) {
		return x-y;
	}
}
