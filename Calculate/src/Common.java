
public class Common {
	
	int x;
	int y;
	int gcf;
	int lcm;
	
	Common(){}
	Common(int x, int y){
		this.x = x;     //this.x=x; �𽺰� �յ� ���ϴ°ǵ�
		this.y = y;
		this.find2Number();
	}
	void find2Number() {  //void�� ���ϰ��� ���� ������ �� ������ �𸦶� �տ� ����
		for(int i=1; i<x && i<y; i++) {//x y ������ �Ѻ��� ������, �� �������� ���� �ʿ�x
			if(x%i==0 && y%i==0) {
				gcf=i;
				lcm=(x*y)/gcf;
				}
			}
		}
	
	void showGCF(){ //�� ���ֵ��� () ���� ���ֳĸ� compute�� �� ���� () 0�Ķ���Ͷ� 
		System.out.println(x +"�� "+ y +"�� �ִ����� : "+ gcf);
	}
	
	void showLCM(){
		System.out.println(x +"�� "+ y +"�� �ּҰ���� : "+ lcm);
	}
}
