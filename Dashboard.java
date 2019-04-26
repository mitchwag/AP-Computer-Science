
public class Dashboard {

	private int odometer;
	private int speedometer;
	private boolean checkEngine;

	public Dashboard() {
		odometer = 0;
		speedometer = 0;
		checkEngine = false;
	}

	public Dashboard(int o, int s) {
		checkEngine = false;
		
		if (o >= 0 && o <= 99999)
			odometer = o;
		else {
			odometer = 0;
			checkEngine = true;
		}
		
		if (s >= 0 && s <= 100)
			speedometer = s;
		else {
			speedometer = 0;
			checkEngine = true;
		}
	}

	public String toString() {
		String temp = "";
		
		String checkOnOff = "Off";
		if (checkEngine)
			checkOnOff = "On";
		
		temp += "Speedometer: " + speedometer + " MPH";
		temp += "\nOdometer: " + String.format("%05d", odometer);;
		temp += "\nCheck Engine: " + checkOnOff;
		
		return temp;
	}

	public void accelerate() {
		speedometer++;
		
		if (speedometer > 100) {
			speedometer = 0;
			checkEngine = true;
		}
	}

	public void drive(int n) {
		odometer += (int)((n / 60) * speedometer);
		
		if (odometer > 99999) {
			odometer = 0;
			checkEngine = true;
		}
	}

}