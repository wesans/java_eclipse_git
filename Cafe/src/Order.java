import java.util.ArrayList;
import java.util.Scanner;

public class Order {
	private ArrayList<String> alMobile;
	private ArrayList<String> alMenu;
	private ArrayList<Integer> alQty;
	private ArrayList<Integer> alSum;	
	private Scanner s;
	
	public Order(){
		this.alMobile=new ArrayList<String>();
		this.alMenu=new ArrayList<String>();
		this.alQty=new ArrayList<Integer>();
		this.alSum=new ArrayList<Integer>();
		this.s=new Scanner(System.in);
	}
	private void add(String menu, int qty, int sum) {
		
		this.alMenu.add(menu);
		this.alQty.add(qty);
		this.alSum.add(sum);
	}		
	private void remove(int ndx) {
		ndx--;
		this.alMobile.remove(ndx);
		this.alMenu.remove(ndx);
		this.alQty.remove(ndx);
		this.alSum.remove(ndx);
	}
	private void update(int ndx, String mobile, String menu, int qty, int price) {
		ndx--;
		this.alMobile.set(ndx, mobile);
		this.alMenu.set(ndx, menu);
		this.alQty.set(ndx, qty);
		this.alSum.set(ndx, price*qty);
	}
	public void display() {
		  for(int i=0; i<this.alMenu.size();i++) {
		         System.out.println(this.alMobile.get(i)+","+this.alMenu.get(i)+","+
		             this.alQty.get(i)+","+this.alSum.get(i));
		      }
	}
	public void Handling(Menu menu) {
//		Scanner s=new Scanner(System.in);

		int menu_num=this.getInput(menu);

		while(menu_num!=0) {
				System.out.println("메뉴의 수량을 입력하세요");
				int qty=Integer.parseInt(s.nextLine());
				menu_num--; //메뉴번호->인덱스번호 변환
				this.add(menu.getAlMenu(menu_num), qty, menu.getAlPrice(menu_num)*qty);
				this.showOrder();
				
				menu_num=this.getInput(menu);
				}
		int start_ndx=this.addMobile();
		
		int total=0;
		for(int i=start_ndx;i<this.alMenu.size();i++) {
			System.out.println(this.alMobile.get(i)+","+this.alMenu.get(i)+",x"+
		         this.alQty.get(i)+","+this.alSum.get(i));
			total+=this.alSum.get(i);
			}
		System.out.println("총주문금액:"+total);
		System.out.println("-------------------------------");
		}
	private void showOrder() {//현재메뉴 이름/수량/총액 표시
	int n=this.alMenu.size()-1;
	System.out.println(this.alMenu.get(n)+"x"+this.alQty.get(n)+","+
           this.alSum.get(n));
	}
	
	private int getInput(Menu m) {
	m.display();
	System.out.println("주문할 메뉴번호를 입력하세요 (0:주문종료)");
	int n=Integer.parseInt(this.s.nextLine());
	return n;
	}
	private int addMobile() {
	
	System.out.println("모바일 번호를 입력하세요(없으면,'-')");
	String mobile=s.nextLine();
	if(mobile.equals("")) mobile="-";
	int start_ndx=this.alMobile.size();
	for(int i=this.alMobile.size();i<this.alMenu.size();i++) {
		this.alMobile.add(mobile);
	}
	return start_ndx;
	}
}