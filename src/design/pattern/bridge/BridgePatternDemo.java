package design.pattern.bridge;

public class BridgePatternDemo {
	public static void main(String[] args) {
		Shape triangle = new Triangle(new RedColor());
		triangle.applyColor();
	}
}
