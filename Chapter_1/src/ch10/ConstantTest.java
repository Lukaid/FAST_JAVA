package ch10;

public class ConstantTest {

	public static void main(String[] args) {

		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		// MAX_NUM = 200; 한번 final로 지정한 상수는 다시 바꿀 수 없음
		
		System.out.println(MAX_NUM);
		
		MIN_NUM = 20;
		
		System.out.println(MIN_NUM);
	}
}
