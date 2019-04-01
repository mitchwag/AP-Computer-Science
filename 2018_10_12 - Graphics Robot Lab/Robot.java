import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas {
	public Robot() // constructor method - sets up the class
	{
		setSize(800, 800);
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void paint(Graphics window) {
		window.setColor(Color.CYAN);
		window.fillRect(0, 0, 800, 800);
		
		window.setColor(Color.BLUE);
		window.drawString("Robot LAB ", 35, 35);

		head(window);
		upperBody(window);
		lowerBody(window);
	}

	public void head(Graphics window) {
		window.setColor(Color.RED);
		window.fillOval(275, 150, 50, 50);
		window.fillOval(475, 150, 50, 50);

		window.setColor(Color.GREEN);
		window.fillRoundRect(350, 75, 100, 25, 10, 10);
		window.fillRoundRect(350, 250, 100, 25, 10, 10);

		window.setColor(Color.YELLOW);
		window.fillRoundRect(300, 100, 200, 150, 40, 40);

		window.setColor(Color.BLACK);
		window.fillOval(350, 125, 25, 50);
		window.fillOval(425, 125, 25, 50);
		window.fillRect(395, 35, 10, 40);
		
		window.setColor(Color.RED);
		window.fillOval(387, 25, 25, 25);
		window.fillArc(337, 160, 125, 75, 180, 180);
		int x[] = { 385, 415, 400 };
		int y[] = { 185, 185, 165 };
		window.fillPolygon(x, y, 3);
	}

	public void upperBody(Graphics window) {
		window.setColor(Color.YELLOW);
		window.fillRoundRect(275, 275, 250, 200, 40, 40);
		window.fillRect(235, 300, 30, 150);
		window.fillRect(535, 300, 30, 150);

		window.setColor(Color.GREEN);
		window.fillRoundRect(225, 290, 50, 50, 10, 10);
		window.fillRoundRect(525, 290, 50, 50, 10, 10);

		window.setColor(Color.RED);
		window.fillOval(225, 440, 50, 50);
		window.fillOval(525, 440, 50, 50);
	}

	public void lowerBody(Graphics window) {
		window.setColor(Color.RED);
		window.fillRoundRect(300, 475, 200, 25, 10, 10);
		window.fillRoundRect(265, 600, 100, 40, 10, 10);
		window.fillRoundRect(425, 600, 100, 40, 10, 10);
		
		window.setColor(Color.BLACK);
		window.fillRect(325, 500, 30, 100);
		window.fillRect(440, 500, 30, 100);
	}
}