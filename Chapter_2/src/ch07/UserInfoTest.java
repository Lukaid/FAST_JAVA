package ch07;

public class UserInfoTest {

	public static void main(String[] args) {

		// default 생성자를 이용하여 인스턴스를 생성한 후 멤버변수를 지
		UserInfo userLee = new UserInfo();
		userLee.userId = "a12345";
		userLee.userPassword = "zxcvbn12345";
		userLee.userName = "Lee";
		userLee.phoneNumber = "01034556699";
		userLee.userAddress = "Seoul, Korea";
		
		System.out.println(userLee.showUserInfo());
		
		// 처음부터 매개변수를 지정하여 생
		UserInfo userKim = new UserInfo("b12345", "09876mnbvc", "Kim");
		System.out.println(userKim.showUserInfo());
	}
}
