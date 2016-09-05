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
