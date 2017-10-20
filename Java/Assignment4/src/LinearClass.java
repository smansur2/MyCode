
public class LinearClass {
	private double a,b,c,d,e,f;
	LinearClass(double _a, double _b, double _c, double _d, double _e, double _f){
		a = _a;
		b = _b;
		c = _c;
		d = _d;
		e = _e;
		f = _f;
	}
	public double getA() {return a;}
	public double getB() {return b;}
	public double getC() {return c;}
	public double getD() {return d;}
	public double getE() {return e;}
	public double getF() {return f;}
	public boolean isSolvable() {
		if(a*d - b*c == 0) {
			return false;
		}
		else return true;
	}
	public double getX() {
		return (e*d - b*f)/(a*d - b*c);
	}
	public double getY() {
		return (a*f - e*c)/(a*d - b*c);
	}
}
