
public class Star {

	public static void main(String[] args) {
		int i=1;
		int j=0;
		String ast="*";
//		System.out.println(ast); (ast*i)�ȵ� int��¼�� ����
		while(i<11) {
			while(j<i){
				System.out.print(ast);
				j++;
			}
			j=0;  //�ʱ�ȭ
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
