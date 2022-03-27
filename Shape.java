package task2;

import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
	private Point position;
	private Color color;
	
	public Shape(Point position, Color color) {
		this.position = position;
		this.color = color;
	}
	
	abstract public void draw(Graphics g);
	
	public void move(Point newPosition) {
		this.position = newPosition;
	}


	public Point getPosition() {
		return position;
	}


	public void setPosition(Point position) {
		this.position = position;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}
	
	
}
