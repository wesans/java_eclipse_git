import java.util.ArrayList;

public class ArrayList_1126 {

	public static void main(String[] args) {
		ArrayList<String> alMenu=new ArrayList<String>(); //ArrayList..자스 array 대신
		ArrayList<Integer> alPrice=new ArrayList<Integer>();//<>타입 정해주면 효율굿
		
		alMenu.add("Americano");    alPrice.add(2000);
		alMenu.add("Latte");        alPrice.add(3000);
		alMenu.add("Mocca");        alPrice.add(3500);
		alMenu.add("Espresso");     alPrice.add(2500);
		alMenu.add("Cappuccino");   alPrice.add(4000);
		
		for(int i=0; i<alMenu.size();i++) {
			System.out.println(alMenu.get(i)+","+alPrice.get(i));
		}
		
//		al.add(14); //add 하나씩 더할때
//		al.add(-1);
//		al.add(22);
//		al.add(32);
//		al.add("Hello"); //문자 들어감
//		al.add("World");
//		al.add(3.14); //실수 들어감
//		for (int i=0; i< al.size();i++) { //.size() ..length 대신
//			System.out.println(al.get(i)); //get(i) ..[]대신
//		}

	}

}
