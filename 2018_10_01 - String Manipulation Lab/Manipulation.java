
public class Manipulation {

	String fullName, firstName, lastName, initial1, initial2, nickname;
	int length, breakIndex;
	
	public Manipulation() {
		
	}
	
	public Manipulation(String fullName) {
		this.fullName = fullName;
	}
	
	public int getLength() {
		length = fullName.length();
		return (length);
	}
	
	public String getFirst() {
		breakIndex = fullName.indexOf(" ");
		firstName = fullName.substring(0, breakIndex);
		firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
		return (firstName);
	}
	
	public String getLast() {
		lastName = fullName.substring(breakIndex + 1, length);
		lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
		return (lastName);
	}
	
	public String getInitials() {
		initial1 = fullName.substring(0,1).toUpperCase();
		initial2 = lastName.substring(0,1).toUpperCase();
		return (initial1 + initial2);
	}
	
	public String getNickname() {
		nickname = firstName + " \"The Man\" " + lastName;
		return (nickname);
	}
}
