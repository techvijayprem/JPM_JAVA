package geometry;

public class GeometryPackageDemo {

	 public static void main(String[] args) {
	        circle cl = new circle(5.0);
	        rectangle rc = new rectangle(4.0, 6.0);
	        triangle tg = new triangle(3.0, 4.0, 5.0);

	        System.out.println("Circle area: " + cl.area());
	        System.out.println("Rectangle area: " + rc.area());
	        System.out.println("Triangle area: " + tg.area());
	    }
}
