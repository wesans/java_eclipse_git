import java.util.Scanner;

public class myCountry {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		if(str.equals("Korea")==true) {
			System.out.println("Republic Of Korea");
		}else {
			System.out.println("Other Country");
		}
	}

}
