package chatPackage;

public class SingletonBot {

	private static SingletonBot instance;
	private static String[] badWords = new String[] {
			"cat"
	};
	
	public static SingletonBot getInstance() {
		
		if(null == instance) {
			instance = new SingletonBot(); 
			// za da moje construktora da se izvikva samo edin put
		}
		return instance;
	}
	
	private SingletonBot() { 
		// za da sprem instanciraneto
	}
	
	public static boolean noNoWords (IMediatorChat mediator, User user, String input) {
		for (String el: badWords)
			if(input.contains(el)) {
				mediator.removeUser(user);
				return true;
			}
			else 
				return false;
		return false;
		
	}
	
	public static void Warning(User user, String input) {
		System.out.println("ChatBot: Found one!");
		System.out.println("ChatBot: I'm gonna say this once and maybe a few more times if someone else does it, but words " +
		 "like '" + input + "' are forbidden! Bye, bye " + user.getName() + "!");
	}
	
}
