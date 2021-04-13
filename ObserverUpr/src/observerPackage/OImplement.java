package observerPackage;

import java.util.Observable;
import java.util.Observer;

public class OImplement implements Observer{

	private String message;
	
	@Override
	public void update (Observable o, Object message) {
		this.setMessage((String) message);
	}
	
	public void setMessage(String message) {
		this.message = message;
		
	}
	public String getMessage() {
		return message;
	}
	
}
