
public class Pyramid_teacher {
	int limit=10;
	int x=1;
	while(x<=limit) {
		int n=x;
		int i=0;
		while(i<n) {
			System.out.print("*"); //옆으로 "*"를 n회 출력
			i++;
			}
		System.out.println(""); //한줄 내리기 (줄바꿈)
		x++;
		}
	x=9;
	while(x>=1) {
		int n=x;
		int i=0;
		while(i<n) {
			System.out.print("*");
			i++;
			}
		System.out.println("");
		x--;
		}
	}
}
