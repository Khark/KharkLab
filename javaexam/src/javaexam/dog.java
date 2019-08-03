package javaexam;

public class dog extends Animal {
	String name;
	String breed;
	
	public dog () {
		super();
		name = "TOM";
	}
	
	public dog(String name, int age)
	{
		super(age);
		this.name = name;
	}
	
	public String Animal(String name, String age) {
		return age;
		
	}
	
	public void bark()
	{
		System.out.print(name+"("+breed + ")이 짖습니다.");
	}
}
