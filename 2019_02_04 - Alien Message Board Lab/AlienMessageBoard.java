public class AlienMessageBoard {
	
	String message, username;
	
	AlienMessageBoard() {
		
	}
	
	AlienMessageBoard(String message, String username) {
		this.message = message;
		this.username = username;
	}

	int curseCount(String curse) {
		int count = 0;
		String temp = message;
		
		while (temp.indexOf(curse) != -1){
			temp = temp.substring(temp.indexOf(curse) + curse.length(), temp.length());
			count++;
		}
		
		return count;
	}
	
	String checkCurse() {
		if (curseCount(" $ ") == 0 && curseCount(" ^^ ") == 0 && curseCount(" qey ") == 0) {
			return "CLEAN";
		} else  {
			return "BAD\n" + username + "\n$:" + curseCount(" $ ") + "\n^^:" + curseCount(" ^^ ") + "\nqey:" + curseCount(" qey ");
		}
	}
	
}
