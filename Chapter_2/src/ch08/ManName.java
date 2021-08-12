package ch08;

public class ManName {

	public String manName;
	public int manAge;
	public int manTall;
	public int manWeight;
	
	public ManName() {}
	
	public ManName(String manName, int manAge) {
		
		this.manName = manName;
		this.manAge = manAge;
	}
	
	public String showManInfo() {
		return "키가" + manTall + "이고 몸무게가 "+manWeight+" 킬로인 남성이 있습니다. 이름은 "+manName+" 이고 나이는 "+manAge+"세입니다."; 
	}
}
