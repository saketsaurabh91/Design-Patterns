package design.pattern.chainofresponsibility;

public class Dollar20Dispenser implements DispenseChain {

	public DispenseChain chain;

	@Override
	public void dispenseCash(Currency currency) {
		if (currency.getAmount() >= 20) {
			int div = currency.getAmount() / 20;
			int rem = currency.getAmount() % 20;
			System.out.println("Dispensing 20 dollar notes: " + div);
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
