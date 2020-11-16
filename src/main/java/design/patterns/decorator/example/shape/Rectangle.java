package design.patterns.decorator.example.shape;

/**
 * Rectangle implements Shape interface to draw a rectangle
 * 
 * @author "Bobandeep Singh"
 */
public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Shape of rectangle is drawn");
	}

	@Override
	public String toString() {
		return "Rectangle";
	}

}
