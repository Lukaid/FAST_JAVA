package ch09;

public class SubjectTest {

	public static void main(String[] args) {

		Student studentLee = new Student(2021310001, "Lee");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 90);
		
		Student studentKim = new Student(2014123068, "Kim");
		studentKim.setKoreaSubject("국어", 90);
		studentKim.setMathSubject("수학", 100);
		
		studentLee.showScoreInfo();
		studentKim.showScoreInfo();
	}

}
