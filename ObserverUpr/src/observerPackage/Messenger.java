package observerPackage;

public class Messenger implements Message{

	private String message;

    @Override
    public void update(Object message) {
        this.setMessage((String) message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
	
}
