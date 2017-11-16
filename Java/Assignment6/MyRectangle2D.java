
public class MyRectangle2D {
	private double x, y, w, h;
	public MyRectangle2D() {
		x = y = 0;
		w = h = 1;
	}
	public MyRectangle2D(double _x, double _y, double _w, double _h) throws Exception {
		x = _x;
		y = _y;
		setWidth(_w);
		setHeight(_h);
	}
	public void setWidth(double _w) throws Exception {
		if(!isValid(_w)) {
			throw new Exception ("Width has to be greater than 0.");
		}
		else {
			w=_w;
		}
	}
	public void setHeight(double _h) throws Exception {
		if(!isValid(_h)) {
			throw new Exception ("Height has to be greater than 0.");
		}
		else {
			h=_h;
		}		
	}
	public boolean isValid(double _x) {
		if(_x<=0) return false;
		else return true;
	}
	public double getWidth() { return w; }
	public double getHeight() { return h; }
	public double getArea() {
		return w*h;
	}
	public double getPerimeter() {
		return 2*(w+h);
	}
	
	public boolean contains(double _x, double _y) {
		double xupper = x+w/2;
		double xlower = x-w/2;
		double yupper = y+w/2;
		double ylower = y-w/2;
		if(xlower<_x && x<xupper)
			if(ylower<_y && y<yupper) 
				return true;
		return false;		
	}
	public boolean contains(MyRectangle2D r) {
		double xupper = x+w/2;
		double xlower = x-w/2;
		double yupper = y+w/2;
		double ylower = y-w/2;
		
		double xupper2 = r.x+r.w/2;
		double xlower2 = r.x-r.w/2;
		double yupper2 = r.y+r.w/2;
		double ylower2 = r.y-r.w/2;
		
		if(xlower< xlower2 && xupper2<xupper)
			if(ylower<ylower2 && yupper2<yupper) 
				return true;
		
		return false;
	}
	
	public boolean overlaps(MyRectangle2D r) {
		//left top point
		double x1 = r.x - r.w/2;
		double y1 = r.y + r.h/2;
		
		//right top point
		double x2 = r.x + r.w/2;
		double y2 = r.y + r.h/2;
		
		//right bottom point
		double x3 = r.x + r.w/2;
		double y3 = r.y - r.h/2;
		
		//left bottom point
		double x4 = r.x - r.w/2;
		double y4 = r.y - r.h/2;
		
		boolean a,b,c,d;
		a = contains(x1,y1);
		b = contains(x2,y2);
		c = contains(x3,y3);
		d = contains(x4,y4);
		
		int count = 0;
		if(a) count++;
		if(b) count++;
		if(c) count++;
		if(d) count++;
		if(count>=1 && count<=3)
			return true;
		
		
		
		return false;
	}
	
	
	
	
	
}
