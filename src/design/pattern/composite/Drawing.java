package design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing extends Shape {

	public List<Shape> operations = new ArrayList<Shape>();

	public void add(Shape shape) {
		operations.add(shape);
	}

	public void clear(Shape shape) {
		operations.remove(shape);
	}

	public void clearAll() {
		operations.clear();
	}

	@Override
	public void draw(String color) {

		for (Shape s : operations) {
			s.draw(color);
		}
	}

}
