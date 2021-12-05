
public class Battle {

	public static void main(String[] args) {
		Soldier commando= new Soldier(12,150,0);
		Warrior conan= new Warrior(15,120,1);
		
		System.out.println("War started.");
		while(commando.getHP()>0 &&
				conan.getHP()>0) {
			try {
				// 0�� 1 ���߿� �ϳ��� �����߻���Ű�� �ڵ�
				int rd=0;
				rd=(int)(Math.random()*2); 
				if(rd==0) {
				commando.attack(conan);
				Thread.sleep(500);
				} else {
				conan.attack(commando);
				Thread.sleep(500);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(commando.getHP() > conan.getHP()) {
			System.out.println("�ڡ١��ڸ����� �¸�! (���� ��)");
		} else if(commando.getHP() < conan.getHP()) {
			System.out.println("�ڡڡ��ڳ��� �¸�! (���� ��)");
		} else {
			System.out.println("�� �� ���! (���º�)");
		}
	}

}
