package practice5.exercise3;

import java.util.Random;

@SuppressWarnings("unused")
public class Password {

	int length;
	String password;
	
	Password() {
		length = 8;
		password = "00000000";
	}
	
	Password(int length) {
		this.length = length;
		this.password = this.GeneratePassword(length);
	}
	
	
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getPassword() {
		return password;
	}

	public String GeneratePassword(int len) {
		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghi"
          +"jklmnopqrstuvwxyz!@#$%&";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		return sb.toString();
	}
	
	public boolean isStrong() {
		int upper = 0, lower = 0, number = 0, special = 0;
		 
        for(int i = 0; i < password.length(); i++)
        {
            char ch = password.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else if (ch >= '0' && ch <= '9')
                number++;
            else
                special++;
        }
        
        if (upper >= 2 && lower >= 1 && number >= 5) {
        	return true;
        } else {
        	return false;
        }
	}

	@Override
	public String toString() {
		return "Password [length=" + length + ", password=" + password + "]";
	}
	
	
	
}
