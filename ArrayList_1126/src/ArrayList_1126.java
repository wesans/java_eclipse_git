import java.util.ArrayList;

public class ArrayList_1126 {

	public static void main(String[] args) {
		ArrayList<String> alMenu=new ArrayList<String>(); //ArrayList..�ڽ� array ���
		ArrayList<Integer> alPrice=new ArrayList<Integer>();//<>Ÿ�� �����ָ� ȿ����
		
		alMenu.add("Americano");    alPrice.add(2000);
		alMenu.add("Latte");        alPrice.add(3000);
		alMenu.add("Mocca");        alPrice.add(3500);
		alMenu.add("Espresso");     alPrice.add(2500);
		alMenu.add("Cappuccino");   alPrice.add(4000);
		
		for(int i=0; i<alMenu.size();i++) {
			System.out.println(alMenu.get(i)+","+alPrice.get(i));
		}
		
//		al.add(14); //add �ϳ��� ���Ҷ�
//		al.add(-1);
//		al.add(22);
//		al.add(32);
//		al.add("Hello"); //���� ��
//		al.add("World");
//		al.add(3.14); //�Ǽ� ��
//		for (int i=0; i< al.size();i++) { //.size() ..length ���
//			System.out.println(al.get(i)); //get(i) ..[]���
//		}

	}

}
