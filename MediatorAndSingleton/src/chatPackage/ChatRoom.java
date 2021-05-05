package chatPackage;

import java.util.Scanner;

public class ChatRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		IMediatorChat chatroom = new MediatorChat();
        
		Scanner scan = new Scanner(System.in);
        String message = "";
        boolean flag = false;
		
        User user1 = new User(chatroom,"1", "Teodor");
        User user2 = new User(chatroom,"2", "Ivan");
        User user3 = new User(chatroom,"3", "Petar");
         
        chatroom.addUser(user1);
        chatroom.addUser(user2);
        chatroom.addUser(user3);
        
        do {
        
        message = scan.nextLine();
        	
        if(message.contains("Addbot"))
        	SingletonBot.getInstance();
        
        flag = SingletonBot.noNoWords(chatroom,user1,message);
        
        if(!flag)
        	user1.send(message);
        else
        	user1.send("***");
        	SingletonBot.Warning(user1, message);
        
        }while(!flag);
        
        user2.send("Oof");
        user3.send("F");
	}

}
