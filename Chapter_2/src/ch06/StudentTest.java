package ch06;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(); // 얘는 default 생성자
		studentLee.grade = 1;
		
		System.out.println(studentLee.showStudentInfo());
		
		Student studentKim = new Student(123, "wow", 456);
		
		System.out.println(studentKim.showStudentInfo());
	}

}
