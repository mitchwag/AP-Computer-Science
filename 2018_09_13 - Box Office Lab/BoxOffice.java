public class BoxOffice {

	String location, seatlocation, username;
	double numTix;
	double subtotal, salestax, total;

	public BoxOffice() // default constructor
	{

	}

	public void getName(String name) {
		username = name;
	}

	public void getNumTix(int tix) {
		numTix = tix;
	}

	public void getLocation(String loc) {
		seatlocation = loc;
	}

	public String sendMessage() {
		if (seatlocation.equalsIgnoreCase("b"))
			location = "Box";
		else if (seatlocation.equalsIgnoreCase("l"))
			location = "Lawn";
		else if (seatlocation.equalsIgnoreCase("p"))
			location = "Pavilion";

		// create concatenation string thanking user for purchase
		// (Kevin, thank you for purchasing 3 Lawn tickets)
		return (username + ", thank you for purcahsing " + numTix + " "
				+ location + " tickets.");
	}

	public double calcSubtotal() {
		final double BOX = 75.00;
		final double LAWN = 25.00;
		final double PAVILION = 30.00;

		if (seatlocation.equalsIgnoreCase("b"))
			subtotal = numTix * BOX;
		else if (seatlocation.equalsIgnoreCase("l"))
			subtotal = numTix * LAWN;
		else if (seatlocation.equalsIgnoreCase("p"))
			subtotal = numTix * PAVILION;

		return subtotal;
	}

	public double calcSalesTax() {
		final double TAX_RATE = 0.06;
		// calculate salestax
		salestax = subtotal * TAX_RATE;
		// return salestax
		return salestax;
	}

	public double calcTotal() {
		// calculate total
		total = subtotal + salestax;
		// return total
		return total;
	}
}
