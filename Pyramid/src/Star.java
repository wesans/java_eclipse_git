
public class Star {

	public static void main(String[] args) {
		int i=1;
		int j=0;
		String ast="*";
//		System.out.println(ast); (ast*i)안들어감 int어쩌구 오류
		while(i<11) {
			while(j<i){
				System.out.print(ast);
				j++;
			}
			j=0;  //초기화
			System.out.println();
			i++;
		}
		 while(i!=0) {
	         while(j<i) {
	            System.out.print(ast);
	            j++;
	         }
	         j=0;
	         System.out.println();
	         i--;
	      }
	}
}
