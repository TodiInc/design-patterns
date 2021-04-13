package observerPackage;

import java.util.Observable;

public class OExtend extends Observable{
	
	public String message;
	
	public void setMessage(String message) {
		this.message = message;
		setChanged();
		notifyObservers(message);
	}

}
