package ch07;

public class DoubleTest {

	public static void main(String[] args) {

		double dnum = 3.14; // 실수는 기본적으로 double에 저장됨
		float fnum = 3.14f; // 3.14는 실제로 8byte의 크기는 아니지만 기본적으로 double로 인식하여 식별자 f가 없으면 오류남
		
		System.out.println(dnum);
		System.out.println(fnum);
	}
}
