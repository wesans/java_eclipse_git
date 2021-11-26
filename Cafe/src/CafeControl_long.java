import java.util.Scanner;

public class CafeControl_long {
	{
		
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
				else if(sch.equals("D")) {
					System.out.println("메뉴삭제");
					}
				System.out.println("메뉴관리(X:종료,C:메뉴추가,R:메뉴목록,U:메뉴수정,D:메뉴삭제)");
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
		//위에 String str=s.nextLine(); 일케 쓸수가 없음 이미 선언했기에...
		//str=s.nextLine(); 일케만 써줘야함...어렵당
		//초기화랄지 무한루프 빠져나오는 그거 암튼 그거임.
		//새 값을 받아들여줘야 하니깐
	}
	System.out.println("프로그램 종료");
	// 이거 while 안쪽에다 else if로 ==false 조건으로 해놨었는데 그럴 필요x
	// 어차피 while문 조건상, 탈출하려면 무조건 "X"만 가능해서.
	//  밖에 나온건 탈출한 X값일테니 따로 조건이나 함수 지정할 필요x
	
	// while 하나에 if else
	// "프로그램 시작 출력"
	// 입력값 읽기
	// "X"를 입력하면 "프로그램 종료"출력하고 프로그램 종료. 
	// 입력값이 "X"가 아닌 동안, 다음을 반복
	// 입력값이 "X"가 아니면 반복하는 while문 작성.
    // "M"을 입력하면 "메뉴관리" 출력.
	// "O"를 입력하면 "주문관리" 출력
	// "S"를 입력하면 "실적관리" 출력
	// 이도저도 아니면, 다시 입력값을 받아들임
	}
}