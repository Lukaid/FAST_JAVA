package ch09;

public class LocalVariableInter {

	public static void main(String[] args) {

		var i = 10;
		var j = 10.0;
		var str = "test";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		var str2 = str;
		System.out.println(str2);
		
		str = "hello";
		System.out.println(str);
		
		// str = 1; 이미 한번 변수타입이 정해진 변수는, 해당 변수 타입 내에서 변수의 재지정은 가능하지만 다른 타입의 변수로 재지정은 불가능하다.
	}
}
