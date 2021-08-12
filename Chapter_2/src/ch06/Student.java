package ch06;

public class Student {
	
	// 멤버변수는 자동으로 초기화가 된다. 지역변수는 아님!
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student() {} // default 생성자..?
	
	// 멤버변수에 값을 할당하기, this.멤버변수
	public Student(int studentNumber, String studentName, int grade) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	public String showStudentInfo() {
		
		return studentName + "학생의 학번은" + studentNumber + "이고, " + grade + "학년 입니다.";
	}
}
