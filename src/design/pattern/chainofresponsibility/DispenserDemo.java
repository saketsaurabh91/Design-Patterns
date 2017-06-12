package design.pattern.chainofresponsibility;

public class DispenserDemo {

	public DispenseChain c1;

	public DispenserDemo() {
		this.c1 = new Dollar50Dispenser();
		Dollar20Dispenser c2 = new Dollar20Dispenser();
		Dollar10Dispenser c3 = new Dollar10Dispenser();
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}

	public static void main(String[] args) {
		DispenserDemo dm = new DispenserDemo();
		dm.c1.dispenseCash(new Currency(80));
	}
}
