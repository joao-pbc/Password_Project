package password;

import java.util.concurrent.ThreadLocalRandom;


public class PasswordChecker {

	public static void main(String[] args) {
		
		String password = generateString();
		
		System.out.println(checkPassword(password));
		
	}
	
	public static int checkPassword(String password) {
		int pasStrenght = 0;
		Character charaObj;
		Boolean hasUpper = false;
		Boolean hasSpecial = false, hasSpace = false;
		
		if(password.length()>5) {
			pasStrenght++;
			
		}
		for( int i = 0; i < password.length(); i++) {
			
			charaObj = password.charAt(i);
			
			if(charaObj.toString().equals(" ")) {
				hasSpace = true;
			}
			
			try {
				Integer.parseInt(charaObj.toString());	
				
			} catch (Exception e) {
				if( charaObj.toString().equals(charaObj.toString().toUpperCase()) ) {
					hasUpper = true;
				}
			}
			
			switch(charaObj.toString()) {
			case "!":
			case "@":
			case "#":
			case "%":
			case "$":
			case "¨":
			case "&":
			case "*":
			case "(":
			case ")":
			case "}":
			case "{":
			case "]":
			case "[":
				hasSpecial = true;
			}
			
			
		}

		
		if(hasUpper) {
			pasStrenght++;
		}
		if(hasSpecial) {
			pasStrenght++;
		}
		if(hasSpace) {
			System.out.println("It has space!");
		}
		
		return pasStrenght;
	}
	
	public static String generateString() {
		
		String newPass = "";
		Character a;
		for (int i = 0; i < 15; i++) {
			a = (char)(ThreadLocalRandom.current().nextInt(0, 165 + 1));
			newPass += a.toString();
		}
		
		return newPass;
	}

}
