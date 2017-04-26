package design.pattern.factory;

public class LuxuryCar extends Car{

	public LuxuryCar() {
		super(CarType.LUXURY);
		whichCar();
	}

	@Override
	public void whichCar() {
		System.out.println("Im luxury car");
		
	}

}
