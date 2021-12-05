
public class Battle {

	public static void main(String[] args) {
		Soldier commando= new Soldier(12,150,0);
		Warrior conan= new Warrior(15,120,1);
		
		System.out.println("War started.");
		while(commando.getHP()>0 &&
				conan.getHP()>0) {
			try {
				// 0과 1 둘중에 하나를 랜덤발생시키는 코드
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
			System.out.println("★☆★코만도의 승리! (병사 승)");
		} else if(commando.getHP() < conan.getHP()) {
			System.out.println("★★★코난의 승리! (전사 승)");
		} else {
			System.out.println("둘 다 사망! (무승부)");
		}
	}

}
