package practice5.exercise3;

import java.util.Scanner;

public class PasswordTest {

	public static void main(String[] args) {
//		Password pwd = new Password(20);
//		
//		System.out.println(pwd.toString());
//		System.out.println(pwd.isStrong());
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Array size? ");
		int arrSize = input.nextInt();
		
		Password[] pwdArr = new Password[arrSize];
		boolean[] isStrongArr = new boolean[arrSize];
		
		for (int i = 0; i < arrSize; i++) {
			System.out.println("Password " + i + " length? ");
			int pwdLen = input.nextInt();
			Password pwd = new Password(pwdLen);
			
			pwdArr[i] = pwd;
			isStrongArr[i] = pwd.isStrong();
		}
		
		for (int i = 0; i < arrSize; i++) {
			System.out.println(pwdArr[i].password + "    " + isStrongArr[i]);
		}
		
		input.close();
	}
	
}
