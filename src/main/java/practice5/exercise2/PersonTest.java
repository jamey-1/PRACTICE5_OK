package practice5.exercise2;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {

		  Scanner input = new Scanner(System.in);
		  
		  System.out.println("What name?");
		  String name = input.next();
		  
		  System.out.println("What age?");
		  int age = input.nextInt();
		  
		  System.out.println("What gender(M or F)?");
		  char gender = input.next().charAt(0);
		  
		  System.out.println("What weight(kg)?");
		  double weight = input.nextDouble();
		  
		  System.out.println("What height(meter)?");
		  double height = input.nextDouble();
		  
		  Person person1 = new Person(name, age, gender, weight, height);
		  
		  Person person2 = new Person(name, age, gender);
		  
		  Person person3 = new Person();
		  
		  person2.setWeight(60);
		  person2.setHeight(1.85);
		  
		  person3.setName("Steve");
		  person3.setAge(20);
		  person3.setGender('M');
		  person3.setWeight(75);
		  person3.setHeight(1.85);
		  
		  System.out.println("person1: ");
		  System.out.println(person1.toString());
		  printCalcResult(person1);
		  printIsOver18(person1);
		  System.out.println("person2: ");
		  System.out.println(person2.toString());
		  printCalcResult(person2);
		  printIsOver18(person2);
		  System.out.println("person3: ");
		  System.out.println(person3.toString());
		  printCalcResult(person3);
		  printIsOver18(person3);
		  
		  input.close();
	}
	
	static void printCalcResult(Person person) {
		int result = person.Calculate();
		
		switch (result) {
		case 0:
			System.out.println("You are in ideal weight!");
			break;
		case -1:
			System.out.println("You are below ideal weight!");
			break;
		case 1:
			System.out.println("You are overweight!");
			break;
		default:
			break;
		}
	}
	
	static void printIsOver18(Person person) {
		if (person.isOver18()) {
			System.out.println("You are over legal age.");
		} else {
			System.out.println("You are below legal age.");
		}
	}

}
