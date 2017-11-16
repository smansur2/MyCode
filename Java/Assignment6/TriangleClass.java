public class TriangleClass extends GeometricObject {
	private double side1, side2, side3;
	public TriangleClass() {
		side1 = side2 = side3 = 1;
	}

	public TriangleClass(double a, double b, double c)throws Exception {
		check(a,b,c);
		setSide1(a);
		setSide2(b);
		setSide3(c);
	}
	public TriangleClass(double a, double b, double c,String s, boolean f)throws Exception {
		setSide1(a);
		setSide2(b);
		setSide3(c);
		setColor(s);
		setFill(f);
	
	}
	public void check(double a, double b, double c)throws Exception {
		if(a+b>c || a+c>b || b+c>a) {
			return;
		}
		else {
			Exception e = new Exception ("Illegal Triangle");	
			throw e;
		}
	}
	public void setSide1(double a) throws Exception{
		if(!isValid(a)) {
			Exception ex = new Exception ("Length has to be greater than 0");	
			throw ex;
		}
		else
			side1 = a;
	}
	public void setSide2(double a) throws Exception{
		if(!isValid(a)) {
			Exception ex = new Exception ("Length has to be greater than 0");	
			throw ex;
		}
		else
			side2 = a;
	}
	public void setSide3(double a) throws Exception{
		if(!isValid(a)) {
			Exception ex = new Exception ("Length has to be greater than 0");	
			throw ex;
		}
		else
			side3= a;
	}
	public boolean isValid(double a) throws Exception {
		if(a<=0) return false;
		else return true;
	}
	public double getArea() {
		double p = getPerimeter()/2;
		double area;
		area = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
		return area;
	}
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	public String toString() {
		return "Triangle: side1 = " +side1+ " side2 = " +side2+" side3: = " +side3 +" Color: = " +getColor()+" Filled: = " +getFill();
		
	}
}
