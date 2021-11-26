import java.util.Scanner;

public class CafeControl {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		System.out.println("작업을 선택하시오.(X:종료,M:메뉴관리,O:주문관리,S:실적관리)");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		while(str.equals("X")==false) {
			
			if(str.equals("M")) {
				System.out.println("메뉴관리(X:종료,C:메뉴추가,R:메뉴목록,U:메뉴수정,D:메뉴삭제)");
				String sch=s.nextLine();
				while(sch.equals("X")==false) {
					if(sch.equals("C")){
						System.out.println("메뉴추가");
						}
					else if(sch.equals("R")) {
						System.out.println("메뉴목록");
						}
					else if(sch.equals("U")) {
						System.out.println("메뉴수정");
						}
					else if(s.equals("D")) {
						System.out.println("메뉴삭제");
						}
					sch=s.nextLine();
					}
			}
			else if(str.equals("O")) {
				System.out.println("주문관리");
				}
			else if(str.equals("S")) {
				System.out.println("실적관리");
				}
			System.out.println("작업을 선택하시오.(X:종료,M:메뉴관리,O:주문관리,S:실적관리)");
			str=s.nextLine();
		}
		System.out.println("프로그램 종료");
	}
}
