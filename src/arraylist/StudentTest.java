package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(2037003, "Lee");
		studentLee.addSubject("����", 75);
		studentLee.addSubject("����", 85);
		studentLee.addSubject("��ȸ", 70);
		studentLee.addSubject("����", 90);
		studentLee.addSubject("����", 100);
		
		studentLee.showStudentInfo();
		
		System.out.println("================");
		
		Student studentKim = new Student(20172851, "Kim");
		studentKim.addSubject("����", 90);
		studentKim.addSubject("����", 75);
		studentKim.addSubject("��ȸ", 90);
		studentKim.addSubject("����", 85);
		studentKim.addSubject("����", 95);
		
		studentKim.showStudentInfo();
	}

}
