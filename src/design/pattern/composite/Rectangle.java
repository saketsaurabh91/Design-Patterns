package design.pattern.composite;

public class Rectangle implements Shape {

	@Override
	public void draw(String color) {
		System.out.println("Drawing rectangle with color: " + color);

	}

}
