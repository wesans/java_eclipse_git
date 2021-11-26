
public class Book_1126 {

	public static void main(String[] args) {//이 옆의거에 대한 설명임 159~161p
		int total=0;
		for(int i=0;i<args.length;i++) {
			total=total+Integer.parseInt(args[i]);
			System.out.println("현재값:"+args[i]);
		}
		System.out.println("합계:"+total);

	}

}
