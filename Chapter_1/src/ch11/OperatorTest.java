package ch11;

public class OperatorTest {

	public static void main(String[] args) {

		int GameScore = 150;
		
//		int lastScore = ++GameScore; // GameScore += 1; 랑 다를게 없음
		int lastScore = GameScore++; // 얘는 해당 statement가 끝난 다음에 1을 증가시킴
		
		
		System.out.println(lastScore);
		System.out.println(GameScore);
	}
}
