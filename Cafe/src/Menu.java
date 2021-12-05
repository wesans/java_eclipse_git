import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {//멤버 선언
	
	private ArrayList<String> alMenu; //위에선 선언만 하고 (){}열었을때만 실행문
	private ArrayList<Integer>alPrice;
	

	
	public Menu(){//생성자 정의
		this.alMenu=new ArrayList<String>();//위에 Arraylist<String>써줘서 생략
		this.alPrice=new ArrayList<Integer>();//<>타입 정해주면 효율
		File f=new File("C:\\Temp\\menu.txt");
		//데이터:변수 >파일 >데이터베이스
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			try {
				String line=br.readLine();
				while(line!=null){
					String[] ar=line.split(",");
					this.alMenu.add(ar[0]);
					this.alPrice.add(Integer.parseInt(ar[1]));
					line=br.readLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public String getAlMenu(int ndx) {
		return this.alMenu.get(ndx);
	}
	public int getAlPrice(int ndx) {
		return this.alPrice.get(ndx);
	}
	public void display() {
		for(int i=0; i<this.alMenu.size(); i++) {
	          System.out.println((i+1)+"."+this.alMenu.get(i)+" "+this.alPrice.get(i)+"원");
			}
//		this.guide();
	}
	private void guide() {
		System.out.println("메뉴관리(X:종료,C:메뉴추가,U:메뉴수정,D:메뉴삭제)");
	}
	private void add(String menu, int price) {
		this.alMenu.add(menu); //왜 파라미터 하나게요? ㅋㅋ맞춰보셈
		this.alPrice.add(price);
		this.saveMenu();
	}
	private void update(int menu_num, String menu, int price) {//앞에 menu_num
		this.alMenu.set(menu_num-1,menu);
		this.alPrice.set(menu_num-1,price);
		this.saveMenu();
	}
	private void remove(int menu_num) {
		this.alMenu.remove(menu_num-1);
		this.alPrice.remove(menu_num-1);
		this.saveMenu();
	}
	private void saveMenu() {
		File f=new File("C:\\Temp\\menu.txt");
		try {
			FileWriter fw=new FileWriter(f);
			PrintWriter pw=new PrintWriter(fw);
			for(int i=0;i<this.alMenu.size();i++) {
				pw.print(this.alMenu.get(i)+","+this.alPrice.get(i)+"\n");
			}
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Handling() {
		Scanner s=new Scanner(System.in); //이 스캐너 s는 이곳에 포함된 s
		
		this.display();
		this.guide();
		String sch=s.nextLine();
		while(!sch.equals("X")) {
			if(sch.equals("C")){
				System.out.println("메뉴추가");
				Scanner ms=new Scanner(System.in);
				System.out.println("새 메뉴명 입력하세요");
				String menuname=ms.nextLine();
				System.out.println("새 가격 입력하세요");
				int price=Integer.parseInt(ms.nextLine());
				this.add(menuname,price);
				//ms.close();
				
				} else if(sch.equals("U")) {
				System.out.println("메뉴수정");
				Scanner ms=new Scanner(System.in);
				System.out.println("변경(update)할 메뉴번호를 입력하세요");
				int menu_num=Integer.parseInt(ms.nextLine());
				System.out.println("새 메뉴명 입력하세요");
				String menuname=ms.nextLine();
				System.out.println("새 가격 입력하세요");
				int price=Integer.parseInt(ms.nextLine());
				this.update(menu_num,menuname,price);
				
				} else if(sch.equals("D")) {
					System.out.println("메뉴삭제");
					Scanner ms=new Scanner(System.in);
					System.out.println("삭제할 메뉴 번호를 입력하세요");
					int n=Integer.parseInt(ms.nextLine());
					this.remove(n);
					//ms.close();
				}
			this.display();
			this.guide();
			sch=s.nextLine();
			}
		}
}