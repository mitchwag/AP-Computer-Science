public class NameSwap {
	
	String original, firstName, lastName;

	public NameSwap(String original) {
		this.original = original;
	}

	public String swapFirstLast() {
		firstName = original.substring(0, original.indexOf(' '));
		lastName = original.substring(original.indexOf(' ') + 1, original.length());
		return lastName + " " + firstName;
	}
}