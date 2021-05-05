package chatPackage;

public class User {

	 private IMediatorChat mediator;
     
	    private String id;
	    private String name;
	     
	    public User(IMediatorChat room, String id, String name) {
	        this.mediator = room;
	        this.name = name;
	        this.id = id;
	    }
	     
	    public void send(String msg) {
	        getMediator().sendMessage(this, msg);
	    }
	 
	    public void receive(String msg) {
	        System.out.println(this.getName() + " : " + msg);
	    }
	    
	    public IMediatorChat getMediator() {
	        return mediator;
	    }
	 
	    public String getId() {
	        return id;
	    }
	 
	    public String getName() {
	        return name;
	    }
	
}
