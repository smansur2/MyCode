import java.util.*;
public class RectangleClass {
	private double width, height;
	public RectangleClass(){
		width = 1;
		height = 1;
	}
	public RectangleClass(double _width, double _height) throws Exception {
		setWidth(_width);
		setHeight(_height);
	}
	
	public double getWidth() { return width;}
	public double getHeight() {return height;}
	
	public void setWidth(double _width) throws Exception {
		if(!isValidParameter(_width)) {
			throw new Exception ("Invalid Width. Number must be greater than 0.");
		}
		width = _width;
	}
	
	public void setHeight(double _height) throws Exception {
		if(!isValidParameter(_height)) {
			throw new Exception ("Invalid Height. Number must be greater than 0.");
		}
		height = _height;
	}

	public boolean isValidParameter(double parameter) {
		if(parameter<=0) return false;
		else return true;
	}
	
	
	public double getArea() {
		return width*height;
	}
	public double getPerimeter() {
		return 2*(width+height);
	}
	
	public void print() {
		System.out.println("Width: " + width + " Height: " + height + " Area: " + getArea() + " Perimeter: " + getPerimeter() );
	}
}
