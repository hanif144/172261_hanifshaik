package com.aop.main.service;

import com.aop.main.model.Circle;
import com.aop.main.model.Triangle;

public class ShapeService {
	
	private static Circle circle;
	private Triangle triangle;
	public static  Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	
	

}
