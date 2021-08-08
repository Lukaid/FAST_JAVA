package ch12;

public class logicalTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ( (num1 += 10 ) < 10) && ((i += 2) < 10 ); // 앞의 항이 이미 false니까 뒤의 항은 보지도 않음
		
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}
}
