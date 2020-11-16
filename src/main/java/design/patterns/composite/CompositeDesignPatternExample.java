package design.patterns.composite;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * Composite design pattern is used in our daily programming
 * very frequently.
 * It is also be coupled with DI in many cases.
 * The class itself doesn't need to have all the details as
 * other classes can be used for that.
 * <br>
 * Here is a simple example which will give you the basic idea
 * of the concept.
 * 
 * @author "Bobandeep Singh"
 *
 */
public class CompositeDesignPatternExample {

	public static void main(String[] args) {
		
		List<ClassB> listOfClassB = new ArrayList<>();
		listOfClassB.addAll(List.of(new ClassB(1, "B1"), new ClassB(2, "B2")));
		
		ClassA classA = new ClassA();
		classA.setId(10);
		classA.setName("A10");
		classA.setListOfClassB(listOfClassB);
		
		System.out.println("ClassA is a composite class as it is composed with collection of ClassB");
		System.out.println("ClassA: "+classA);

	}

}

@Data
class ClassA {
	private int id;
	private String name;
	private List<ClassB> listOfClassB;
}

@Data
class ClassB{
	private int id;
	private String name;

	public ClassB(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}