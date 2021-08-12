package ch08;

public class ManNameTest {

	public static void main(String[] args) {

		ManName ManTomas = new ManName("Tomas", 37);
		ManTomas.manTall = 180;
		ManTomas.manWeight = 78;
		
		System.out.println(ManTomas.showManInfo());
	}

}
