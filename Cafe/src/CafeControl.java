import java.util.Scanner;

public class CafeControl {

	public static void main(String[] args) {
		
		System.out.println("���α׷� ����");
		System.out.println("�۾��� �����Ͻÿ�.(X:����,M:�޴�����,O:�ֹ�����,S:��������)");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		while(str.equals("X")==false) {
			
			if(str.equals("M")) {
				System.out.println("�޴�����(X:����,C:�޴��߰�,R:�޴����,U:�޴�����,D:�޴�����)");
				String sch=s.nextLine();
				while(sch.equals("X")==false) {
					if(sch.equals("C")){
						System.out.println("�޴��߰�");
						}
					else if(sch.equals("R")) {
						System.out.println("�޴����");
						}
					else if(sch.equals("U")) {
						System.out.println("�޴�����");
						}
					else if(s.equals("D")) {
						System.out.println("�޴�����");
						}
					sch=s.nextLine();
					}
			}
			else if(str.equals("O")) {
				System.out.println("�ֹ�����");
				}
			else if(str.equals("S")) {
				System.out.println("��������");
				}
			System.out.println("�۾��� �����Ͻÿ�.(X:����,M:�޴�����,O:�ֹ�����,S:��������)");
			str=s.nextLine();
		}
		System.out.println("���α׷� ����");
	}
}
