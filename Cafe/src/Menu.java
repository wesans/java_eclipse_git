import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {//��� ����
	
	private ArrayList<String> alMenu; //������ ���� �ϰ� (){}���������� ���๮
	private ArrayList<Integer>alPrice;
	

	
	public Menu(){//������ ����
		this.alMenu=new ArrayList<String>();//���� Arraylist<String>���༭ ����
		this.alPrice=new ArrayList<Integer>();//<>Ÿ�� �����ָ� ȿ��
		File f=new File("C:\\Temp\\menu.txt");
		//������:���� >���� >�����ͺ��̽�
		
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
	          System.out.println((i+1)+"."+this.alMenu.get(i)+" "+this.alPrice.get(i)+"��");
			}
//		this.guide();
	}
	private void guide() {
		System.out.println("�޴�����(X:����,C:�޴��߰�,U:�޴�����,D:�޴�����)");
	}
	private void add(String menu, int price) {
		this.alMenu.add(menu); //�� �Ķ���� �ϳ��Կ�? �������纸��
		this.alPrice.add(price);
		this.saveMenu();
	}
	private void update(int menu_num, String menu, int price) {//�տ� menu_num
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
		Scanner s=new Scanner(System.in); //�� ��ĳ�� s�� �̰��� ���Ե� s
		
		this.display();
		this.guide();
		String sch=s.nextLine();
		while(!sch.equals("X")) {
			if(sch.equals("C")){
				System.out.println("�޴��߰�");
				Scanner ms=new Scanner(System.in);
				System.out.println("�� �޴��� �Է��ϼ���");
				String menuname=ms.nextLine();
				System.out.println("�� ���� �Է��ϼ���");
				int price=Integer.parseInt(ms.nextLine());
				this.add(menuname,price);
				//ms.close();
				
				} else if(sch.equals("U")) {
				System.out.println("�޴�����");
				Scanner ms=new Scanner(System.in);
				System.out.println("����(update)�� �޴���ȣ�� �Է��ϼ���");
				int menu_num=Integer.parseInt(ms.nextLine());
				System.out.println("�� �޴��� �Է��ϼ���");
				String menuname=ms.nextLine();
				System.out.println("�� ���� �Է��ϼ���");
				int price=Integer.parseInt(ms.nextLine());
				this.update(menu_num,menuname,price);
				
				} else if(sch.equals("D")) {
					System.out.println("�޴�����");
					Scanner ms=new Scanner(System.in);
					System.out.println("������ �޴� ��ȣ�� �Է��ϼ���");
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