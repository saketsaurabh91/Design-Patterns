package design.pattern.factory;

public class CarFactory {

	public static Car createCar(CarType carType) {
		Car car = null;
		switch (carType) {
		case LUXURY:
			car = new LuxuryCar();
			break;
		case SMALL:
			car = new SmallCar();
			break;
		default:
			car = null;
			break;
		}
		return car;
	}

}
