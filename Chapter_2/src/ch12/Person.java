package ch12;

public class Person {

	String name;
	int age;
	
	// 초기화를 시켜줌
	public Person() {
		// 바로 밑의 생성자를 불러주는 개념... 얘를 제일 먼저 불러야 댐
		this("no name", 1);
	}
	
	public Person(String name, int age) {
		// 여기 this는 자기 자신의 멤버변수 address를 나타냄
		this.name = name;
		this.age = age;
	}
	
	public void showPerson() {
		System.out.println(name + age);
	}
	
	public Person getPerson() {
		return this;
	}
	
	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.showPerson();
		
		System.out.println(person);
		
		Person person2 = person.getPerson();
		System.out.println(person2);
		
	}
}
