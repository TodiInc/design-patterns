package chatPackage;

public interface IMediatorChat {

	public void sendMessage(User user, String msg);
	 
    void addUser(User user);
    
    void removeUser(User user);
	
}
