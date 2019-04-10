package com.point;

import java.util.ArrayList;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public  class Triangle //implements InitializingBean,DisposableBean
{

	ArrayList<Point> points;

	public ArrayList<Point> getPoints() {
		return points;
	}

	public void setPoints(ArrayList<Point> points) {
		this.points = points;
	}
	
	public void disp()
	{
		for(Point point : points)
		{
			System.out.println(point.x+" "+point.y);
		}
	}

	public void initialize()
	{
		System.out.println("initialize");
	}
	public void close()
	{
		System.out.println("close");
	}
	/*@Override
	public void afterPropertiesSet() throws Exception {
    System.out.println("bean is initialize in the class triangle");		
	}

	@Override
	public void destroy() throws Exception {
        System.out.println("spring is destroying the object");		
	}*/
	
	/*Point pointA;
	Point pointB;
	Point pointC;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void display() {
		System.out.println(pointA.x + "  " + pointA.y);
		System.out.println(pointB.x + "  " + pointB.y);
		System.out.println(pointC.x + "  " + pointC.y);
	}*/

}
