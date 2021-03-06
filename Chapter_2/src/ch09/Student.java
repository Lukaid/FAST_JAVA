package ch09;

public class Student {

	int studentID;
	String studentName;
	
	Subject korea;
	Subject math;
	
	Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		// 참조변수를 멤버변수로 쓰는 경우, 보통 생성자에서 선언
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showScoreInfo() {
		int total = korea.score + math.score;
		System.out.println(studentName + "학생의 총점은" + total + "점 입니다.");
	}
}
