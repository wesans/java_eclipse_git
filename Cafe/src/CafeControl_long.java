import java.util.Scanner;

public class CafeControl_long {
	{
		
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
				else if(sch.equals("D")) {
					System.out.println("�޴�����");
					}
				System.out.println("�޴�����(X:����,C:�޴��߰�,R:�޴����,U:�޴�����,D:�޴�����)");
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
		//���� String str=s.nextLine(); ���� ������ ���� �̹� �����߱⿡...
		//str=s.nextLine(); ���ɸ� �������...��ƴ�
		//�ʱ�ȭ���� ���ѷ��� ���������� �װ� ��ư �װ���.
		//�� ���� �޾Ƶ鿩��� �ϴϱ�
	}
	System.out.println("���α׷� ����");
	// �̰� while ���ʿ��� else if�� ==false �������� �س����µ� �׷� �ʿ�x
	// ������ while�� ���ǻ�, Ż���Ϸ��� ������ "X"�� �����ؼ�.
	//  �ۿ� ���°� Ż���� X�����״� ���� �����̳� �Լ� ������ �ʿ�x
	
	// while �ϳ��� if else
	// "���α׷� ���� ���"
	// �Է°� �б�
	// "X"�� �Է��ϸ� "���α׷� ����"����ϰ� ���α׷� ����. 
	// �Է°��� "X"�� �ƴ� ����, ������ �ݺ�
	// �Է°��� "X"�� �ƴϸ� �ݺ��ϴ� while�� �ۼ�.
    // "M"�� �Է��ϸ� "�޴�����" ���.
	// "O"�� �Է��ϸ� "�ֹ�����" ���
	// "S"�� �Է��ϸ� "��������" ���
	// �̵����� �ƴϸ�, �ٽ� �Է°��� �޾Ƶ���
	}
}