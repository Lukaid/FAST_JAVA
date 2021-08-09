package ch04;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student(); // 클래스를 기반으로 생성된 애를 인스턴스라고 함
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "고양시 덕양구";
		
		studentLee.showStudentInfo();
		
		System.out.println(studentLee);
		
		
		Student studentKim = new Student();
		
		studentKim.studentID = 54321;
		studentKim.setStudentName("Kim");
		studentKim.address = "서울시 관악구";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentKim);
	}
}
