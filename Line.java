package task2;

import java.awt.Color;
import java.awt.Point;
import java.awt.Graphics;

public class Line extends Shape {
	private int x1, x2, y1, y2;
	
	public Line() {
		super(new Point(0, 0), Color.black);
		this.x1 = 0;
		this.x2 = 0;
		this.y1 = 0;
		this.y2 = 0;
	}
	
	

	public int getX1() {
		return x1;
	}



	public void setX1(int x1) {
		this.x1 = x1;
	}



	public int getX2() {
		return x2;
	}



	public void setX2(int x2) {
		this.x2 = x2;
	}



	public int getY1() {
		return y1;
	}



	public void setY1(int y1) {
		this.y1 = y1;
	}



	public int getY2() {
		return y2;
	}



	public void setY2(int y2) {
		this.y2 = y2;
	}



	public Line(Point position, Color color, 
			int x1, int y1, int x2, int y2) {
		super(position, color);
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		
	}
	
	public void draw(Graphics g) {
		g.drawLine(x1, y1, x2, y2);
	}

}
