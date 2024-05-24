package geometry;

public class circle {

	private double radius;

	public circle(double radius) {
		 
		this.radius = radius;
	}
	
	public double area() {
        return Math.PI * radius * radius;
    }
}
