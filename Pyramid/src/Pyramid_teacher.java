
public class Pyramid_teacher {
	int limit=10;
	int x=1;
	while(x<=limit) {
		int n=x;
		int i=0;
		while(i<n) {
			System.out.print("*"); //������ "*"�� nȸ ���
			i++;
			}
		System.out.println(""); //���� ������ (�ٹٲ�)
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
