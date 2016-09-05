//Habeeb Mohammed, Section 5, 02/29/2016
public abstract class Shape {

	protected int position_x;
	protected int position_y = 0;

	public Shape(int position_x, int position_y) {
		this.position_x = position_x;
		this.position_y = position_y;
	}

	public int getPosition_x() {
		return position_x;
	}

	public void setPosition_x(int position_x) {
		this.position_x = position_x;
	}

	public int getPosition_y() {
		return position_y;
	}

	public void setPosition_y(int position_y) {
		this.position_y = position_y;
	}

	public boolean equals(Object other) {
		if (!(other instanceof Shape)) {
			return false;
		}
		Shape otherShape = (Shape) other;
		if ((this.position_x == otherShape.position_x) && (this.position_y == otherShape.position_y)) {
			return true;
		}
		else
			return false;
	}

	public String toString() {
		String position = "";
		position = "location(" + this.position_y + "," + this.position_x + ")";
		return position;
	}
	
	public boolean larger(Shape other){
		if(this.area() > other.area()){
			return true;
		}
		else
			return false;
	}
	
	public abstract double area();
	public abstract double perimeter();
	public abstract boolean resize(double ratio);

}

import java.util.ArrayList;
import java.util.Comparator;

//Habeeb Mohammed, Section 5, 02/29/2016
public class Rectangle extends Shape {
	
	protected int width = 0;
	protected int height = 0;


	public Rectangle(int width, int height, int position_x, int position_y) {
		super(position_x, position_y);
		this.width = width;
		this.height = height;
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

	@Override
	public double area() {
		int area = width * height;
		return area;
	}

	@Override
	public double perimeter() {
		int perimeter = (width * 2) + (height * 2);
		return perimeter;
	}

	@Override
	public boolean resize(double ratio) {
		if((width * height) * (int) ratio <= 0){
			return false;
		}
		else
		return true;
	}
	
	@Override
	public String toString(){
		String position = "";
		position = "Rectangle at " + super.toString() + ", height " + height + ", width " + width;
		return position;
	}
	
	@Override
	public boolean equals(Object other){
		Rectangle otherShape = (Rectangle) other;
		if((super.equals(otherShape)) && (this.width == otherShape.width) && (this.height == otherShape.height)){
			return true;
		}
		else
			return false;
	}
	
	public static void main(String[] args){
		Rectangle r1 = new Rectangle(2,2,5,3);
		Rectangle r2 = new Rectangle(4,2,5,6);
		Rectangle r3 = new Rectangle(2,2,5,3);
		Rectangle r4 = new Rectangle(7,10,11,14);
		
		//test code
		System.out.println("Area: " + r1.area());
		System.out.println("Equals: " + r1.equals(r3));
		System.out.println("Resize: " + r1.resize(4/3));
		System.out.println("Larger: " + r1.larger(r4));
		System.out.println("Perimeter: " + r1.perimeter());
				
		ArrayList<Rectangle> rectangle = new ArrayList<>();
		
		rectangle.add(r1);
		rectangle.add(r2);
		rectangle.add(r3);
		rectangle.add(r4);
		
		for(int i = 0; i < rectangle.size(); i++){
			if(rectangle.get(i).larger(rectangle.get(i++))){
				System.out.println(rectangle.get(i));
			}
		}
		
		
		System.out.println(rectangle.contains(new Rectangle(4,2,5,6)));
		System.out.println(r1);
	}
	

}
