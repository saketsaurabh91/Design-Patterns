package design.pattern.decorator;

public class DecoratorPatternDemo {
	public static void main(String[] args) {

		SportsCar sc = new SportsCar(new BasicCar());
		sc.assemble();

		LuxuryCar lc = new LuxuryCar(new SportsCar(new BasicCar()));
		lc.assemble();
	}
}
