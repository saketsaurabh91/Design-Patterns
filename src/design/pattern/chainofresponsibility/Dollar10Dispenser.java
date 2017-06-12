package design.pattern.chainofresponsibility;

public class Dollar10Dispenser implements DispenseChain {

	public DispenseChain chain;

	@Override
	public void dispenseCash(Currency currency) {
		if (currency.getAmount() >= 10) {
			int div = currency.getAmount() / 10;
			int rem = currency.getAmount() % 10;
			System.out.println("Dispensing 10 dollar notes: " + div);
			if (rem != 0) {
				this.chain.dispenseCash(new Currency(rem));
			}
		} else {
			this.chain.dispenseCash(currency);
		}

	}

	@Override
	public void setNextChain(DispenseChain chain) {
		this.chain = chain;
	}

}
