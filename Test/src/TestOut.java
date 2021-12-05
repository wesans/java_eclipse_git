
class TestOut {
	private int n; //������ Ŭ���� �ۿ����� ������ �� ����.(write/read �Ұ�)
	private String str;
	private float realnumber;

	public TestOut() {
	}
	public TestOut(String str, float realnumber) {
		this.str = str;
		this.realnumber = realnumber;
		this.n=(int)this.realnumber;
	}
	public TestOut(int n, String str) {
		this.str = str;
	}
	public TestOut(int n) {
		this.n = n;
	}
	public int getN() {
		return n;
	}
	public String getStr() {
		return str;
	}
	public float getRealnumber() {
		return realnumber;
	}
	public void setN(int n) {
		this.n = n;
	}
	public TestOut(int n, String str, float realnumber) {
		this.n = n;
		this.str = str;
		this.realnumber = realnumber;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public void setRealnumber(float realnumber) {
		this.realnumber = realnumber;
	}
}
