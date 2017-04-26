package design.pattern.factory;

public abstract class Car {

	public Car(CarType type){
		this.type = type;
		basicProcessing();
	}
	
	private void basicProcessing() {
		System.out.println("pour metal to make car");
	}

	private String color;
	private CarType type;
	
    public abstract void whichCar();

	public CarType getType() {
		return type;
	}

	public void setType(CarType type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
