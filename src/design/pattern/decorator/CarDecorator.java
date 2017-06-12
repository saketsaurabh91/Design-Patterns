package design.pattern.decorator;

public class CarDecorator extends BasicCar {

	public Car car;

	public CarDecorator(Car car) {
		this.car = car;
	}

	@Override
	public void assemble() {

		this.car.assemble();
	}

}
