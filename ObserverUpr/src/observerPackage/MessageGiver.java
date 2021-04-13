package observerPackage;

import java.util.ArrayList;
import java.util.List;

public class MessageGiver {

	private String message;
    private List<Message> messages = new ArrayList<>();

    public void addObserver(Message message) {
        this.messages.add(message);
    }

    public void removeObserver(Message message) {
        this.messages.remove(message);
    }

    public void setNews(String message) {
        this.message = message;
        for (Message m : this.messages) { /* тука стана малко сложно, naming is just perfect :D */
        	m.update(this.message);
        }
    }
	
}
