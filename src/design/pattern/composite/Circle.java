package design.pattern.composite;

public class Circle implements Shape {

	@Override
	public void draw(String color) {
		
		System.out.println("Drawing circle of color: " + color);
	}

}
