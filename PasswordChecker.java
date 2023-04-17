package application;

import java.util.concurrent.ThreadLocalRandom;


public class PasswordChecker {
	
		
	public static String generateString(boolean letra, boolean num, boolean spec) {
		int charSelector, charSelector2;
		String newPass = "";
		Character a;
		 while ( newPass.length() < 15) {
			charSelector = ThreadLocalRandom.current().nextInt(0, 4 + 1);
			switch(charSelector) {
			
			case 1: 
				a = (char)ThreadLocalRandom.current().nextInt(97, 122 + 1);
				newPass += a.toString();
				break;
				
			case 2: 
				if(!num) {
					break;
				}
				a = (char)ThreadLocalRandom.current().nextInt(48, 57 + 1);
				newPass += a.toString();
				break;
				
			case 0: 
				if(!letra) {
					break;
				}
				a = (char)ThreadLocalRandom.current().nextInt(65, 90 + 1);
				newPass += a.toString();
				break;
			
			case 3: 
				if(!spec) {
					break;
				}
				charSelector2 = ThreadLocalRandom.current().nextInt(0, 3 + 1);
				switch(charSelector2) {
				case 0:
					a = 34;
					while((a == 34) || (a == 39) || (a == 44) || (a == 46) || (a == 22)) {
						a = (char)ThreadLocalRandom.current().nextInt(33, 47 + 1);
						newPass += a.toString();
						break;
					}
					
				case 1:
					a = (char)ThreadLocalRandom.current().nextInt(58, 64 + 1);
					newPass += a.toString();
					break;
				case 2:
					a = (char)ThreadLocalRandom.current().nextInt(91, 95 + 1);
					newPass += a.toString();
					break;
				case 3:
					a = (char)ThreadLocalRandom.current().nextInt(123, 126 + 1);
					newPass += a.toString();
					break;
				}
			}
		}
		
		return newPass;
	}

}