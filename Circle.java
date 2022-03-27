package task2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Circle extends Shape {
	private int x, y, radius;
	
	public Circle() {
		super(new Point(0, 0), Color.black);
		this.x = 0;
		this.y = 0;
		this.radius = 0;
	}
	
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	public Circle(Point position, Color color, int x, int y, int radius) {
		super(position, color);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void draw(Graphics g) {
		g.drawOval(x, y, radius, radius);
	}
		
}

