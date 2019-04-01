import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class BigHouse extends Canvas {
	public BigHouse() // constructor - sets up the class
	{
		setSize(800, 600);
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void paint(Graphics window) {
		bigHouse(window);
	}

	public void bigHouse(Graphics window) {
		window.setColor(Color.CYAN);
		window.fillRect(0, 0, 800, 400);
		
		window.setColor(Color.GREEN);
		window.fillRect(0, 400, 800, 200);

		window.setColor(Color.BLUE);
		window.drawString("BIG HOUSE ", 50, 50);

		window.setColor(Color.BLUE);
		window.fillRect(200, 200, 400, 400);

		window.setColor(Color.ORANGE);
		window.fillRect(250, 250, 100, 100);
		
		window.setColor(Color.ORANGE);
		window.fillRect(400, 250, 150, 150);

		window.setColor(Color.ORANGE);
		int x[] = { 200, 600, 400 };
		int y[] = { 200, 200, 50 };
		window.fillPolygon(x, y, 3);
		
		int x2[] = { 250, 250, 625 };
		int y2[] = { 400, 600, 600 };
		window.fillPolygon(x2, y2, 3);
		
		window.setColor(Color.DARK_GRAY);
		window.fillRect(75, 300, 50, 600);
		window.fillRect(675, 300, 50, 600);
		
		window.setColor(Color.GREEN);
		window.fillOval(0, 150, 200, 200);
		window.fillOval(600, 150, 200, 200);
		
		window.setColor(Color.YELLOW);
		window.fillOval(700, -100, 200, 200);
	}
}
