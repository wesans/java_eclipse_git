
public class Warrior {
	private int AP; //�ִ� ���ݷ�
	private int HP; //
	private int RD;
	
	public Warrior() {}
	public Warrior(int AP, int HP, int RD) {
		this.AP = AP;
		this.HP = HP;
		this.RD = RD;
	}
	public int getAP() {
		return AP;
	}
	public int getHP() {
		return HP;
	}
	public int getRD() {
		int RD=(int)(Math.random()*this.RD);
		return RD;
	}
	public void setAP(int AP) {
		this.AP = AP;
	}
	public void setHP(int AP) {
		this.HP-=AP;
		System.out.println("�������� ���� ü�� : "+ this.HP);
	}
	public void attack(Soldier s) {
		int attackPoint=(int)(Math.random()*this.AP);
		System.out.println("�ڡ������� ���ݷ� : "+ attackPoint);
		s.setHP(attackPoint);
	}
}
