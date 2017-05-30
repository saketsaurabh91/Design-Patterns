package design.pattern.composite;

public class DemoCompositePattern {

	public static void main(String[] args) {

		Drawing draw = new Drawing();
		Rectangle r1 = new Rectangle();
		draw.add(r1);
		draw.add(new Circle());
		draw.add(new Rectangle());

		draw.draw("RED");
		draw.clear(r1);

		draw.draw("BLUE");

		draw.clearAll();
		draw.draw("INVISIBLE");
	}
}
