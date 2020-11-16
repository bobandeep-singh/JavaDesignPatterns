package design.patterns.decorator.example.shape;

public class DecoratePatternWithShapeDemo {
	/**
	 * Using {@link RedShapeDecorator} in which we can pass the instance
	 * of type Shape in the constructor.
	 * <br>
	 * The functionality of shape is enhanced/augmented and a border
	 * of red color can be added to it.
	 */
	public static void main(String[] args) {
		System.out.println("The circle is drawn without border");
		Shape circle = new Circle();
		circle.draw();
		

		System.out.println("\nThe circle is drawn and border is added");
		Shape redCircle = new RedShapeDecorator(new Circle());
		redCircle.draw();
		
		System.out.println("\nThe Rectangle is drawn and border is added");
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		redRectangle.draw();
	}
}
