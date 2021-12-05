
public class Common {
	
	int x;
	int y;
	int gcf;
	int lcm;
	
	Common(){}
	Common(int x, int y){
		this.x = x;     //this.x=x; 디스가 먼데 머하는건데
		this.y = y;
		this.find2Number();
	}
	void find2Number() {  //void는 리턴값이 없고 답으로 머 나올지 모를때 앞에 붙임
		for(int i=1; i<x && i<y; i++) {//x y 무조건 둘보다 작을때, 즉 작은수를 구할 필요x
			if(x%i==0 && y%i==0) {
				gcf=i;
				lcm=(x*y)/gcf;
				}
			}
		}
	
	void showGCF(){ //왜 딴애들은 () 일케 해주냐면 compute에 쓴 식이 () 0파라미터라 
		System.out.println(x +"와 "+ y +"의 최대공약수 : "+ gcf);
	}
	
	void showLCM(){
		System.out.println(x +"와 "+ y +"의 최소공배수 : "+ lcm);
	}
}
