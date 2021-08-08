package ch13;

public class BitTest {

	public static void main(String[] args) {
		
		int num1 = 5; // 00000101
		int num2 = 10; // 00001010
		
		System.out.println(num1 | num2);
		System.out.println(num1 & num2);
		System.out.println(num1 ^ num2);
		System.out.println(~num1);
		
		System.out.println(num1 << 2); // ºñÆ®°¡ ¿Å°ÜÁø ¼ö ¸¸Å­ 2ÀÇ n½ÂÀ» °öÇØÁÜ
		System.out.println(num1);
		System.out.println(num1 <<= 2);
		System.out.println(num1);
	}

}
