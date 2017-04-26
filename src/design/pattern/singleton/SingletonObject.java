package design.pattern.singleton;
import java.io.Serializable;

public class SingletonObject implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1149951233931146024L;
	private static SingletonObject singletonObject;

	private SingletonObject() {
	}

	public static SingletonObject getInstance() {
		if(null == singletonObject){
			singletonObject = new SingletonObject();
		}
		return singletonObject;
	}
	
	  Object readResolve(){
		 System.out.println("entering private");
		 return getInstance();
	 }
}
