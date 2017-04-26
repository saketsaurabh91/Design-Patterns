package design.pattern.factory;

public class SmallCar extends Car{

	public SmallCar() {
		super(CarType.SMALL);
		whichCar();
	}

	@Override
	public void whichCar() {
		System.out.println("Im small car");
		
	}
}
