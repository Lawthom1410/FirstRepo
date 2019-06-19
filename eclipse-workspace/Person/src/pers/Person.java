package pers;

public class Person {
	
	private String name = "Jack" ;
	private int age = 24;
	private String jobTitle = "Astronaut";
	
	public Person(String name, int age, String jobTitle) {
		super();
		this.name = name;
		if (age < 0) {
			this.age = 0;
		}
		else if (age > 120) {
			this.age = 120;
		}
		else {
			this.age = age;
		}
		this.jobTitle = jobTitle;
	}
	
	public Person() {
		super();
	}
	
	public String getName() {
		return name;
	}

	public void getPersonInfo() {
		System.out.println(String.format("The person's name is %s.", name));
		System.out.println(String.format("Their age is %d.", age));
		System.out.println(String.format("Their occupation is %s.", jobTitle));
		System.out.println();
		
	}
	
	
}
