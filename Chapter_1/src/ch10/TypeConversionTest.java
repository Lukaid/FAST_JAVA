package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {
		
		byte bNum = 125;
		int iNum = bNum;
		
		System.out.println(iNum);
		
		int iNum_2 = 255;
		byte bNum_2 = (byte)iNum_2;
		
		System.out.println(bNum_2);
		
		double a = 1.2;
		float b = 0.9f;
		
		int test_1 = (int)a + (int)b;
		int test_2 = (int)(a + b);
		
		System.out.println(test_1);
		System.out.println(test_2);
	}
}
