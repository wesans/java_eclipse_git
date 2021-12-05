
public class Soldier {
	private int AP;
	private int HP;
	private int RD;
	
	public Soldier() {}
	public Soldier(int AP, int HP, int RD) {
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
		System.out.println("☆병사의 남은 체력 : "+ this.HP);
	}
	public void attack(Warrior w) {
		int attackPoint=(int)(Math.random()*this.AP);
		System.out.println("☆☆병사의 공격력 : "+ attackPoint);
		w.setHP(attackPoint);
	}
}
