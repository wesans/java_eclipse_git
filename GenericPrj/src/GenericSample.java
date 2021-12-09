
public class GenericSample {

	public static void main(String[] args) {
		
		EmployeeInfo ei = new EmployeeInfo(1);
		Person<EmployeeInfo, Integer> p1 =
				new Person<EmployeeInfo, Integer>(ei, 1);
		
		StudentIfo si = new StudentInfo(2);
		Person<StudentInfo, Integer> p2 =
				new Person<StudentInfo, Integer>(si,2);
		
//		StudentInfo si = new StudentInfo(2);
//		StudentPerson sp = new StudentPerson(si);
//		System.out.println(sp.info.grade); //2 ÂïÈû
//		
//		EmployeeInfo ei = new EmployeeInfo(1);
//		EmployeePerson ep = new EmployeePerson(ei);
//		System.out.println(ep.info.rank); //1ÂïÈû

	}
}

class Person<T,S> {
	public T info; //½ÇÇà½Ã°£¿¡ °áÁ¤
	public S id;
	
	Person (T info, S id) {
		this.info = info;
		this.id = id;
	}
}

class StudentInfo {
	public int grade; //ÄÄÆÄÀÏ½Ã °áÁ¤

	public StudentInfo(int grade) {
		this.grade = grade;
	}
}

class EmployeeInfo {
	public int rank;

	public EmployeeInfo(int rank) {
		this.rank = rank;
	}
}




class StudentPerson {
	public StudentInfo info;

	public StudentPerson(StudentInfo info) {
		this.info = info;
	}
}
class EmployeePerson {
	public EmployeeInfo info;

	public EmployeePerson(EmployeeInfo info) {
		this.info = info;
	}
	
}