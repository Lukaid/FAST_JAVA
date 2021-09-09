package ch06;

public class Student {
	
	// 멤버변수는 자동으로 초기화가 된다. 지역변수는 초기화 안됨.
	public int studentNumber; // int 는 0으로
	public String studentName; // String은 null로 초기
	public int grade;
	
	public Student() {} // default 생성자..?
	
	// 멤버변수에 값을 할당하기, this.멤버변수 
	// 생성자로 인스턴트를 생성할 때, 매개변수를 받아서 멤버변수를 초기화
	public Student(int studentNumber, String studentName, int grade) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		
		return studentName + "학생의 학번은" + studentNumber + "이고, " + grade + "학년 입니다.";
	}
}
