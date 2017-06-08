package design.pattern.bridge;

public abstract class Shape {

	public Color color;

	public Shape(Color c) {
		this.color = c;
	}

	public abstract void applyColor();
}
