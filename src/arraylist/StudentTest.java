package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(2037003, "Lee");
		studentLee.addSubject("국어", 75);
		studentLee.addSubject("수학", 85);
		studentLee.addSubject("사회", 70);
		studentLee.addSubject("과학", 90);
		studentLee.addSubject("영어", 100);
		
		studentLee.showStudentInfo();
		
		System.out.println("================");
		
		Student studentKim = new Student(20172851, "Kim");
		studentKim.addSubject("국어", 90);
		studentKim.addSubject("수학", 75);
		studentKim.addSubject("사회", 90);
		studentKim.addSubject("과학", 85);
		studentKim.addSubject("영어", 95);
		
		studentKim.showStudentInfo();
	}

}
