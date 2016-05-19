package org.learning.Symphonia.Bubble;

import javafx.scene.shape.Circle;

public class Bubble {
	private Circle circle;
	
	private int x;
	
	private int y;
	
	private double duration;
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public double getDuration() {
		return duration;
	}
	
	public Circle createShape() {
		circle = new Circle();
		return circle;
	}
	
	public Bubble(int position, double duration) {
		this.x = position;
		this.y = 0;
		this.duration = duration;
	}
}
