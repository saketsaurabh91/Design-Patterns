package design.pattern.chainofresponsibility;

public interface DispenseChain {

	public void dispenseCash(Currency currency);
	
	public void setNextChain(DispenseChain chain);
}
