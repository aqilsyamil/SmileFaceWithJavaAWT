package task2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Rectangle extends Shape {
	private int x, y, width, height;
	
	public Rectangle() {
		super(new Point(0, 0), Color.black);
		this.x = 0;
		this.y = 0;
		this.width = 0;
		this.height = 0;
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

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Rectangle(Point position, Color color, int x, int y, int width, int height) {
		super(position, color);
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void draw(Graphics g) {
		g.drawRect(x, y, width, height);
	}
}
