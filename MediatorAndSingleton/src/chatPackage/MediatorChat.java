package chatPackage;

import java.util.HashMap;
import java.util.Map;

public class MediatorChat implements IMediatorChat{

	private Map<String, User> usersMap = new HashMap<>();
	
	@Override
    public void sendMessage(User user, String msg) 
    {
        System.out.println(user.getName()+ ":" + msg);
    }
 
    @Override
    public void addUser(User user) {
        this.usersMap.put(user.getId(), user);
    }
    
    @Override
    public void removeUser(User user) {
    	this.usersMap.remove(user.getId(), user);
    }
	
}
