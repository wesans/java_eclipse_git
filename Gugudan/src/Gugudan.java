import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		int i=0, j=1;
		Scanner s=new Scanner(System.in);//쓰고 클릭해서 위에 유틸스캐너 뜨게..프롬프트 같은건가
//		i=s.nextInt(); //단수 입력받기
		Scanner si=new Scanner(System.in);
		i=Integer.parseInt(s.nextLine()); //넥스트라인?으로 머 읽음
//		int n=si.nextInt(); // 정수 읽어주는 거 따로 지정하고 그러는듯
		
		System.out.println(i+"*"+j+"="+i*j);
		j++;
		System.out.println(i+"*"+j+"="+i*j);
		j++;
		System.out.println(i+"*"+j+"="+i*j);
		j++;
		System.out.println(i+"*"+j+"="+i*j);
		j++;
		System.out.println(i+"*"+j+"="+i*j);
		j++;
		System.out.println(i+"*"+j+"="+i*j);
		j++;
		System.out.println(i+"*"+j+"="+i*j);
		j++;
		System.out.println(i+"*"+j+"="+i*j);
		j++;
		System.out.println(i+"*"+j+"="+i*j);
		j++;
		//콘솔창에 숫자를 쳐야 나옴...어
	}

}
