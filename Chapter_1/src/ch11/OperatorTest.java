package ch11;

public class OperatorTest {

	public static void main(String[] args) {

		int GameScore = 150;
		
//		int lastScore = ++GameScore; // GameScore += 1; �� �ٸ��� ����
		int lastScore = GameScore++; // ��� �ش� statement�� ���� ������ 1�� ������Ŵ
		
		
		System.out.println(lastScore);
		System.out.println(GameScore);
	}
}
