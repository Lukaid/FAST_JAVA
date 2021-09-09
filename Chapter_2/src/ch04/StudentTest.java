package ch04;

public class StudentTest {
	
	public static void main(String[] args) {
		
		// studentLee는 참조변수, 클래스 생성시 메모리의 위치를 나타냄
		Student studentLee = new Student(); // 클래스를 기반으로 생성된 애를 인스턴스라고 함
		// 인스턴스는 heap, 지역변수는 stack 메모리에 저장
		
		// 멤버변수
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "고양시 덕양구";
		
		// 메서드
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
