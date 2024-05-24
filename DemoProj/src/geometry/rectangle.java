package geometry;

public class rectangle {

	private double length;
    private double width;
    
	public rectangle(double length, double width) {
		 
		this.length = length;
		this.width = width;
	}
	
	 public double area() {
	        return width * length;
	    }
    
}
