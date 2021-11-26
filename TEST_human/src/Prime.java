
public class Prime {

	public static void main(String[] args) {
		int num = 0;
		for(int n=2; n<=2000; n++){
			for(int i=2; i<=n; i++){
				if(n % i == 0) {
					num ++;
				}}
			if(num==1){
				System.out.println(n+" ");
				}
			num=0;
			}
//		for(int n = 3; n < 2000; n++) {
//			for(int x = 2; i < n; x++) {
//				if(n % x == 0) {
//					break;
//				}
//			}			
//		}
//		
		}
		
		
		// 나눠지면 소수가 아님
		// 나눠지지 않으면 소수
	
}
