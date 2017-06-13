package design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {

	private List<Observer> observers;
	private String message;
	private boolean changed;
	private Object MUTEX = new Object();

	public MyTopic() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer ob) {
		synchronized (MUTEX) {
			if (!observers.contains(ob))
				this.observers.add(ob);
		}

	}

	@Override
	public void unregisterObserver(Observer ob) {
		synchronized (MUTEX) {
			this.observers.remove(ob);
		}
	}

	@Override
	public void notifyAllObservers() {
		List<Observer> observersLocal = null;
		synchronized (MUTEX) {
			if (!changed) {
				return;
			}
			observersLocal = this.observers;
			this.changed = false;
		}
		for (Observer obj : observersLocal) {
			obj.update();
		}
	}

	@Override
	public Object getUpdate(Observer obj) {
		return this.message;

	}

	public void postMessage(String msg) {
		System.out.println("Message Posted to Topic:" + msg);
		this.message = msg;
		this.changed = true;
		notifyAllObservers();
	}
}
