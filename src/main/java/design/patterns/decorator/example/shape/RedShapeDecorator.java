package design.patterns.decorator.example.shape;

public class RedShapeDecorator extends ShapeDecorator{

	/**
	 * The Decorator class gets an instance of the {@link Shape class}
	 * @param decoratedShape
	 */
	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	/**
	 * Here we are adding additional functionality to the draw method.
	 * <br>
	 * After invoking the parent method, additional/augmented
	 * method can be applied over it
	 */
	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}
	
	private void setRedBorder(Shape decoratedShape) {
		System.out.println("Setting red border on shape: "+decoratedShape);
		System.out.println("Border of the shape is painded red in color");
	}

}
