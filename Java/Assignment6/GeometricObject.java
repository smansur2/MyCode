public class GeometricObject{
	private String color;
	private boolean filled;
	public GeometricObject() {
		color = "white";
		filled = false;
	}
	public void setColor(String s) {
		color = s;
	}
	public void setFill(boolean b) {
		filled = b;
	}
	public String getColor() {return color;}
	public boolean getFill() {return filled;}
}