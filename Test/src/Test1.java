
public class Test1 {
	public static void main(String[] args) {
		TestOut to = new TestOut();
		
		to.setN(10); //set( <-write)
		int k=to.getN(); //�ΰ�ΰ� �������������
		System.out.println(to.getN()); //get( <-read)

	}

}
