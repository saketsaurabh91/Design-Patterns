package design.pattern.observer;

public interface Subject {

	public void registerObserver(Observer ob);
	public void unregisterObserver(Observer ob);
	public void notifyAllObservers();
	public Object getUpdate(Observer obj);
	
}
