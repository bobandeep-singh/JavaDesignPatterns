package design.patterns.decorator.example.shape;

/**
 * Circle implements Shape interface to draw a circle
 * 
 * @author "Bobandeep Singh"
 */
public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Shape of circle is drawn");
	}

	@Override
	public String toString() {
		return "Circle";
	}
}
