package practice5.exercise2;

import java.util.Random;

@SuppressWarnings("unused")
public class Person {
	
	private String name;
	private int age;
	private String id;
	private char gender;
	private double weight;
	private double height;
	
	public Person() {
		name = "";
		age = 0;
		id = this.generatesID();
		gender = 'M';
		weight = 0;
		height = 0;
	}

	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		id = this.generatesID();
		this.gender = this.CheckGender(gender) ? gender : 'M';
		weight = 0;
		height = 0;
	}

	public Person(String name, int age, char gender, double weight, double height) {
		this.name = name;
		this.age = age;
		id = this.generatesID();
		this.gender = this.CheckGender(gender) ? gender : 'M';
		this.weight = weight;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int Calculate() {
		double BMI = weight / (height * height);
		if (BMI > 18.5 && BMI < 25) {
			return 0;
		} else if (BMI <= 18.5) {
			return -1;
		} else {
			return 1;
		}
	}
	
	public boolean isOver18() {
		boolean isOver18 = age >= 18 ? true : false;
		return isOver18;
	}
	
	private boolean CheckGender(char gen) {
		if (gen == 'M' || gen == 'F') {
			return true;
		} else {
			return false;
		}
	}
	
	private String generatesID() {
		Random rnd = new Random();
	    int number = rnd.nextInt(99999999);

	    // this will convert any number sequence into 6 character.
	    return String.format("%08d", number);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", id=" + id + ", gender=" + gender + ", weight=" + weight
				+ ", height=" + height + "]";
	}
	
	

}
